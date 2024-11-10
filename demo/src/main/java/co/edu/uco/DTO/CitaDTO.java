package co.edu.uco.DTO;

import java.time.LocalDateTime;

public class CitaDTO {
    private String id;
    private LocalDateTime fechaCita;
    private String nombrePaciente;
    private String estadoId;
    private String estadoNombre;
    private String medicoNombre;

    public CitaDTO(String id, LocalDateTime fechaCita, String nombrePaciente, String estadoId, String estadoNombre, String medicoNombre) {
        setId(id);
        setFechaCita(fechaCita);
        setNombrePaciente(nombrePaciente);
        setEstadoId(estadoId);
        setEstadoNombre(estadoNombre);
        setMedicoNombre(medicoNombre);
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getFechaCita() {
        return fechaCita;
    }

    private void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    private void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getEstadoId() {
        return estadoId;
    }

    private void setEstadoId(String estadoId) {
        this.estadoId = estadoId;
    }

    public String getEstadoNombre() {
        return estadoNombre;
    }

    private void setEstadoNombre(String estadoNombre) {
        this.estadoNombre = estadoNombre;
    }

    public String getMedicoNombre() {
        return medicoNombre;
    }

    private void setMedicoNombre(String medicoNombre) {
        this.medicoNombre = medicoNombre;
    }
}
