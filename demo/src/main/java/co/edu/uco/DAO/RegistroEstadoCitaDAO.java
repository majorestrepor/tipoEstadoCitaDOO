package co.edu.uco.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegistroEstadoCitaDAO {
    private Connection conn;
    private Statement stmt;
    public RegistroEstadoCitaDAO() throws SQLException {
        conn = DatabaseConnection.getConnection();
        stmt = conn.createStatement();
    }
    public void crear(RegistroEstadoCitaEntity entity) throws SQLException{
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
