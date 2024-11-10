package co.edu.uco.DAO;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroEstadoCitaEntity {
    private String idCita;
    private String idEstado;
    private String Id;
    private LocalDateTime fechaRegistro;

    public RegistroEstadoCitaEntity(String idEstado, String idCita, String id, LocalDateTime fechaRegistro) {
        setIdEstado(idEstado);
        setIdCita(idCita);
        setId(id);
        setFechaRegistro(fechaRegistro);
    }

    public String getIdCita() {
        return idCita;
    }

    private void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getIdEstado() {
        return idEstado;
    }

    private void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getId() {
        return Id;
    }

    private void setId(String id) {
        Id = id;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    private void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
