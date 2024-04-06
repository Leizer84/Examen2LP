package hn.unah.examen1900.demo.demo.services;

import java.util.List;
import java.util.Optional;

import hn.unah.examen1900.demo.demo.entities.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerCliente();

    public Optional<Cliente> buscarPorDni(String dni);
}
