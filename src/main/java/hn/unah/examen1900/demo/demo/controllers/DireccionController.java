package hn.unah.examen1900.demo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen1900.demo.demo.repositories.ClienteRepository;
import hn.unah.examen1900.demo.demo.services.Impl.DireccionServiceImpl;

@RestController
@RequestMapping("/api")
public class DireccionController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private DireccionServiceImpl direccionServiceImpl;

    @PostMapping("/direccion")
    public String agregarDireccion(@PathVariable String dni, @RequestBody Direccion direccion) {
        Cliente cliente = clienteRepository.findById(dni).orElse(null);

        if (cliente != null) {
            direccion.setCliente(cliente);
            direccionRepository.save(direccion);
            return "Dirección agregada exitosamente.";
        }

        return "El cliente con el DNI " + dni + " no existe.";
    }
}
