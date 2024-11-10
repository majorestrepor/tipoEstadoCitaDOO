package co.edu.uco.servicios;

import co.edu.uco.DAO.DatabaseConnection;
import co.edu.uco.DAO.RegistroEstadoCitaEntity;
import co.edu.uco.DTO.RegistroEstadoCitaDTO;
import co.edu.uco.utilidades.mappers.RegistroEstadoCitaMapper;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServicioRegistroEstadoCita {
    public void asignarEstadoCita(RegistroEstadoCitaDTO registroEstadoCitaDTO) throws SQLException {
        RegistroEstadoCitaEntity entity = RegistroEstadoCitaMapper.ConvertFromDTO(registroEstadoCitaDTO);
        //Guardar en base de datos

        Connection conn = DatabaseConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM agenda.Paciente");

        // Procesar los resultados
        while (rs.next()) {
            String id = rs.getString("id");
            String nombre = rs.getString("nombre");
            String direccion = rs.getString("direccion");
            String telefono = rs.getString("telefono");

            System.out.printf("ID: %s, Nombre: %s, Dirección: %s, Teléfono: %s%n", id, nombre, direccion, telefono);
        }
    }
}
