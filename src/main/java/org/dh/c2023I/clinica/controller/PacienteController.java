package org.dh.c2023I.clinica.controller;

import org.dh.c2023I.clinica.model.Paciente;
import org.dh.c2023I.clinica.service.PacienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacienteController implements IController<Paciente>{

    PacienteService service = new PacienteService();

    @Override
    @GetMapping("paciente-todos")
    public List<Paciente> listarTodos() {
        return service.listarTodos();
    }
}
