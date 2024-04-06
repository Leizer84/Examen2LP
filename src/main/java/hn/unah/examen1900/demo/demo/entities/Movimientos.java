package hn.unah.examen1900.demo.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "movimientos")
@Data
public class Movimientos {
    
    @Id
    @Column(name = "idmovimiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovimiento;

    @Column(name = "numerocuenta")
    private String numeroCuenta;

    //@Column(name = "tipoMovimiento")
    
    private double monto;

    @Column(name = "fechamovimiento")
    private String fechaMovimiento;

    private Cuentas cuenta;
}
