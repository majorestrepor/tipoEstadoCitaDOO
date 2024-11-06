package DTO;

public class EstadoCitaDTO {
    String id;
    String nombre;

    public EstadoCitaDTO() {}
    public EstadoCitaDTO(String id, String nombre) {
        super();
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
