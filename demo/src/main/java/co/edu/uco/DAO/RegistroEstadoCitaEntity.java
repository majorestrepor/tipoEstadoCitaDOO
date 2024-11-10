package co.edu.uco.DAO;

import java.time.LocalDate;

public class RegistroEstadoCitaEntity {
    private String idCita;
    private String idEstado;
    private String Id;
    private LocalDate fechaRegistro;

    public RegistroEstadoCitaEntity(String idEstado, String idCita, String id, LocalDate fechaRegistro) {
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

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    private void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
