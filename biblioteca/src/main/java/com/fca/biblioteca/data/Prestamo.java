package com.fca.biblioteca.data;
import java.time.LocalDate;

public class Prestamo {

    private int idPrestamo;
    private int idPersona;
    private int idLibro;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

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

    public LocalDate getFechaInicio() {

        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {

        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {

        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {

        this.fechaFin = fechaFin;
    }

}//Fin Prestamo