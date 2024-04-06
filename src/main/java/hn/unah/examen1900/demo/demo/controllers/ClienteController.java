package hn.unah.examen1900.demo.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen1900.demo.demo.entities.Cliente;
import hn.unah.examen1900.demo.demo.services.Impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/cliente/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/cliente/obtener")
    public List<Cliente> obtenerCliente() {
        return this.clienteServiceImpl.obtenerCliente();
    }
}
