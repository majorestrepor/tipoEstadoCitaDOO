package co.edu.uco.utilidades.mappers;

import co.edu.uco.DAO.CitaEntity;
import co.edu.uco.DAO.RegistroEstadoCitaEntity;
import co.edu.uco.DTO.CitaDTO;
import co.edu.uco.DTO.RegistroEstadoCitaDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class CitaMapper {
    public static CitaDTO ConvertFromEntity(CitaEntity entity) {
        if (entity == null) {
            return null;
        }
        CitaDTO dto = new CitaDTO(
                entity.getId(),
                entity.getFechaCita(),
                entity.getNombrePaciente(),
                entity.getEstadoId(),
                entity.getEstadoNombre(),
                entity.getMedicoNombre()
        );
        return dto;
    }

    public static ArrayList<CitaDTO> ConvertListFromEntity(ArrayList<CitaEntity> entities) {
        ArrayList<CitaDTO> dtos = new ArrayList<CitaDTO>();
        for (CitaEntity entity : entities) {
            dtos.add(ConvertFromEntity(entity));
        }
        return dtos;
    }
}
