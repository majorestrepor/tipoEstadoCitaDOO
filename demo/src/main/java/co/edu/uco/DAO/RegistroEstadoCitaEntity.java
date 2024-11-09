package co.edu.uco.DAO;

public class RegistroEstadoCitaEntity {
    String idCita;
    String idEstado;
    String Id;

    public RegistroEstadoCitaEntity() {}
    public RegistroEstadoCitaEntity(String idEstado, String idCita, String id) {
        this.idEstado = idEstado;
        this.idCita = idCita;
        Id = id;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
