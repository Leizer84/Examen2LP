package hn.unah.examen1900.demo.demo.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.examen1900.demo.demo.entities.Cuentas;
import hn.unah.examen1900.demo.demo.repositories.CuentasRepository;
import hn.unah.examen1900.demo.demo.services.CuentasService;

public class CuentasServiceImpl implements CuentasService {

    @Autowired
    private CuentasRepository cuentasRepository;

    @Override
    public Cuentas crearCuentas(Cuentas cuentas) {
        return this.cuentasRepository.save(cuentas);

    }

}
