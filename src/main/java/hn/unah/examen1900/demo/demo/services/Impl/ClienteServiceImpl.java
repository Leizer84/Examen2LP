package hn.unah.examen1900.demo.demo.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen1900.demo.demo.entities.Cliente;
import hn.unah.examen1900.demo.demo.repositories.ClienteRepository;
import hn.unah.examen1900.demo.demo.repositories.CuentasRepository;
import hn.unah.examen1900.demo.demo.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        // Verificar si el cliente ya existe
        Optional<Cliente> clienteExistente = clienteRepository.findById(cliente.getDni());

        if (clienteExistente != null) {
            System.out.println("El cliente con el DNI proporcionado ya existe.");
            return null;
        }

        // Si el cliente no existe, guardar en la base de datos
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerCliente() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> buscarPorDni(String dni) {
        return this.clienteRepository.findById(dni);

    }

}