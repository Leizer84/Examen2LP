package hn.unah.examen1900.demo.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.examen1900.demo.demo.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {
    
}
