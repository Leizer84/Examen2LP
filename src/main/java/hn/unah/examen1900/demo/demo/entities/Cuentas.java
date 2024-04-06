package hn.unah.examen1900.demo.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "cuentas")
@Data
public class Cuentas {
    
    @Id
    @Column(name = "numerocuenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numeroCuenta;

    
    private double saldo;

    @Column(name = "fechaapertura")
    private String fechaApertura;

    private boolean estado;

    private boolean sobregiro;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "numerocuenta")
    private List<Cliente> cliente;

}
