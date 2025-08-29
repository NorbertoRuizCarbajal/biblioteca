package com.fca.biblioteca.data;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestamo")
public class Prestamo {
    @Id
    @Column(name = "idPrestamo")
    private int idPrestamo;
    @Column(name = "idPersona")
    private int idPersona;
    @Column(name = "idLibro")
    private int idLibro;
    @Column(name = fechaPrestamo)
    private LocalDate fechaPrestamo;
    @Column(name = "diasPrestamo")
    private int diasPrestamo;

    // Getters y Setters
    public int getIdPrestamo() {

        return idPrestamo;
    }
    public void setIdPrestamo(int idPrestamo) {

        this.idPrestamo = idPrestamo;
    }

    public int getIdPersona() {

        return idPersona;
    }
    public void setIdPersona(int idPersona) {

        this.idPersona = idPersona;
    }

    public int getIdLibro() {

        return idLibro;
    }
    public void setIdLibro(int idLibro) {

        this.idLibro = idLibro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
}//Fin Prestamo