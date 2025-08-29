package com.fca.biblioteca.data;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno extends Persona{

    @Id
    @Column(name = "idAlumno")
    private int idAlumno;
    @Column(name = "idPersona")
    private int idPersona;
    @Column(name = "numeroCuenta")
    private String numeroCuenta;

    //Getters y Setters
    public String getNumeroCuenta() {

        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {

        this.numeroCuenta = numeroCuenta;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
}//Fin Alumno