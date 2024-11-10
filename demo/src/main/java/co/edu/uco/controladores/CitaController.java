package co.edu.uco.controladores;

import co.edu.uco.DTO.CitaDTO;
import co.edu.uco.DTO.RegistroEstadoCitaDTO;
import co.edu.uco.servicios.ServicioCita;
import co.edu.uco.servicios.ServicioRegistroEstadoCita;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/cita")
public class CitaController {
    private final ServicioCita servicioCita;

    public CitaController() {
        servicioCita = new ServicioCita();
    }

    @RequestMapping(value = "/obtener-citas", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<CitaDTO> obtenerCitas() throws SQLException {
        return servicioCita.obtenerCitas();
    }
}
