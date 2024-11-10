package co.edu.uco.servicios;

import co.edu.uco.DAO.CitaEntity;
import co.edu.uco.DAO.postgres.CitaDAO;
import co.edu.uco.DTO.CitaDTO;
import co.edu.uco.utilidades.mappers.CitaMapper;

import java.sql.SQLException;
import java.util.ArrayList;

public class ServicioCita {

    private CitaDAO citaDAO;
    public ServicioCita() {
        citaDAO = new CitaDAO();
    }

    public ArrayList<CitaDTO> obtenerCitas() throws SQLException {
        ArrayList<CitaEntity> citasEntity = citaDAO.obtenerTodasLasCitas();
        ArrayList<CitaDTO> citasDTO = CitaMapper.ConvertListFromEntity(citasEntity);
        return citasDTO;
    }
}
