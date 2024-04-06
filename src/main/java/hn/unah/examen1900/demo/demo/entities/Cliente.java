package hn.unah.examen1900.demo.demo.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {

    @Id
    @Column(name = "dni")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dni;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iddireccion", referencedColumnName = "iddireccion")
    private Direccion direccion;

    @JsonManagedReference
    @OneToMany(mappedBy = "numerocuenta")
    private Cuentas numeroCuenta;

}
