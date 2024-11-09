package co.edu.uco.utilidades.mappers;

import co.edu.uco.DAO.RegistroEstadoCitaEntity;
import co.edu.uco.DTO.RegistroEstadoCitaDTO;

import java.util.UUID;

public class RegistroEstadoCitaMapper {
    public static RegistroEstadoCitaEntity ConvertFromDTO(RegistroEstadoCitaDTO dto){
        if (dto == null) {
            return null;
        }
        RegistroEstadoCitaEntity entity = new RegistroEstadoCitaEntity();
        entity.setId(UUID.randomUUID().toString());
        entity.setIdEstado(dto.getIdEstado());
        entity.setIdCita(dto.getIdCita());
        return entity;
    }
}
