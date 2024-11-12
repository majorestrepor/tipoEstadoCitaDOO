package co.edu.uco.DAO.postgres;

import co.edu.uco.DAO.CitaEntity;
import co.edu.uco.DAO.DatabaseConnection;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CitaDAO {
    private Connection conn;
    private Statement stmt;
    public CitaDAO() {
        conn = DatabaseConnection.getConnection();
    }

    public ArrayList<CitaEntity> obtenerTodasLasCitas() throws SQLException {
        ArrayList<CitaEntity> citas = new ArrayList<CitaEntity>();
        String sql = "SELECT c.id AS cita_id, c.fecha, p.id AS paciente_id, p.nombre AS nombre_paciente, medico, " +
                "p.direccion, p.telefono, r.tipo_estado_id AS ultimo_estado_id, " +
                "te.nombre AS nombre_ultimo_estado, r.fecha_registro AS fecha_ultimo_estado " +
                "FROM Cita c " +
                "JOIN Paciente p ON c.paciente_id = p.id " +
                "JOIN RegistroEstadoCita r ON c.id = r.cita_id " +
                "JOIN TipoEstadoCita te ON r.tipo_estado_id = te.id " +
                "JOIN ( " +
                "    SELECT cita_id, MAX(fecha_registro) AS max_fecha " +
                "    FROM RegistroEstadoCita " +
                "    GROUP BY cita_id " +
                ") ultimo_estado ON r.cita_id = ultimo_estado.cita_id AND r.fecha_registro = ultimo_estado.max_fecha";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            String citaId = rs.getString("cita_id");
            LocalDateTime fechaCita = rs.getTimestamp("fecha").toLocalDateTime();
            String pacienteId = rs.getString("paciente_id");
            String nombrePaciente = rs.getString("nombre_paciente");
            String ultimoEstadoId = rs.getString("ultimo_estado_id");
            String nombreUltimoEstado = rs.getString("nombre_ultimo_estado");
            LocalDateTime fechaUltimoEstado = rs.getTimestamp("fecha_ultimo_estado").toLocalDateTime();
            String medicoNombre = rs.getString("medico");
            CitaEntity cita = new CitaEntity(
                    citaId, fechaCita, pacienteId, nombrePaciente,
                    ultimoEstadoId, nombreUltimoEstado, fechaUltimoEstado, medicoNombre
            );
            citas.add(cita);
        }
        return citas;
    }
}
