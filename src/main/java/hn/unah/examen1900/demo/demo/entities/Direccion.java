package hn.unah.examen1900.demo.demo.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "direccion")
@Data
public class Direccion {

    @Id
    @Column(name = "iddireccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDireccion;

    private String estado;

    private String ciudad;

    @JsonIgnore
    @OneToOne(mappedBy = "direccion")
    private Cliente cliente;

}
