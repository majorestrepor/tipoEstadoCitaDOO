package co.edu.uco.DAO.postgres;

import co.edu.uco.DAO.CitaEntity;
import co.edu.uco.DAO.DatabaseConnection;
import co.edu.uco.DAO.TipoEstadoCitaEntity;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TipoEstadoCitaDAO {
    private Connection conn;
    private Statement stmt;

    public TipoEstadoCitaDAO() {
        conn = DatabaseConnection.getConnection();
    }

    public ArrayList<TipoEstadoCitaEntity> obtenerTodosLosEstados() throws SQLException {
        ArrayList<TipoEstadoCitaEntity> tipoEstadoCitas = new ArrayList<TipoEstadoCitaEntity>();
        String sql = "SELECT * FROM tipoestadocita";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            String id = rs.getString("id");
            String nombre = rs.getString("nombre");

            TipoEstadoCitaEntity tipoEstadoCita = new TipoEstadoCitaEntity(id, nombre);
            tipoEstadoCitas.add(tipoEstadoCita);
        }

        return tipoEstadoCitas;
    }
}
