package co.edu.uco.servicios;

import co.edu.uco.DAO.DatabaseConnection;
import co.edu.uco.DAO.RegistroEstadoCitaDAO;
import co.edu.uco.DAO.RegistroEstadoCitaEntity;
import co.edu.uco.DTO.RegistroEstadoCitaDTO;
import co.edu.uco.utilidades.mappers.RegistroEstadoCitaMapper;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServicioRegistroEstadoCita {
    private RegistroEstadoCitaDAO registroEstadoCitaDAO;
    public ServicioRegistroEstadoCita() throws SQLException {
        registroEstadoCitaDAO = new RegistroEstadoCitaDAO();
    }
    public void asignarEstadoCita(RegistroEstadoCitaDTO registroEstadoCitaDTO) throws SQLException {
        RegistroEstadoCitaEntity entity = RegistroEstadoCitaMapper.ConvertFromDTO(registroEstadoCitaDTO);
        registroEstadoCitaDAO.crear(entity);
    }
}
