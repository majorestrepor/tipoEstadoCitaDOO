package controladores;

import DAO.RegistroEstadoCitaEntity;
import DTO.RegistroEstadoCitaDTO;
import org.springframework.web.bind.annotation.*;
import utilidades.mappers.RegistroEstadoCitaMapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

@RestController
@RequestMapping(value = "/registro-estado-cita")
public class RegistroEstadoCitaController {
    @RequestMapping(value = "/asignar-estado-cita", method = RequestMethod.POST)
    @ResponseBody
    public void obtenerEstadosCita(@RequestBody RegistroEstadoCitaDTO registroEstadoCitaDTO) {
        RegistroEstadoCitaEntity entity = RegistroEstadoCitaMapper.ConvertFromDTO(registroEstadoCitaDTO);
        //Guardar en base de datos
        System.out.println("Hanny");
        String url = "jdbc:postgresql://localhost:1234/postgres";
        String user = "postgres";
        String password = "majorera20";

        // Conexión a la base de datos
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Configura el esquema predeterminado para la sesión
            stmt.execute("SET search_path TO agenda");

            // Ejemplo de consulta: Obtener todos los pacientes
            String sql = "SELECT * FROM Paciente"; // No es necesario especificar "agenda.Paciente" debido a `search_path`
            ResultSet rs = stmt.executeQuery(sql);

            // Procesar los resultados
            while (rs.next()) {
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");

                System.out.printf("ID: %s, Nombre: %s, Dirección: %s, Teléfono: %s%n", id, nombre, direccion, telefono);
            }

            // Cerrar ResultSet
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
