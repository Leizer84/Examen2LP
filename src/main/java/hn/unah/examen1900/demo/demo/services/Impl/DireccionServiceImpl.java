package hn.unah.examen1900.demo.demo.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.examen1900.demo.demo.entities.Direccion;
import hn.unah.examen1900.demo.demo.repositories.ClienteRepository;
import hn.unah.examen1900.demo.demo.repositories.DireccionRepository;
import hn.unah.examen1900.demo.demo.services.DireccionService;

public class DireccionServiceImpl implements DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Direccion crearDireccion(Direccion direccion) {
        return this.direccionRepository.save(direccion);

    }

}
