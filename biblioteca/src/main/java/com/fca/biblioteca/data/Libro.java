package com.fca.biblioteca.data;
import java.time.LocalDate;

public class Libro {

    private int idLibro;
    private String titulo;
    private LocalDate fechaPublicacion;
    private String editorial;
    private int edicion;
    private String isbn;
    private int existencias;

    // Getters y Setters
    public int getIdLibro() {

        return idLibro;
    }
    public void setIdLibro(int idLibro) {

        this.idLibro = idLibro;
    }

    public String getTitulo() {

        return titulo;
    }
    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getEditorial() {

        return editorial;
    }
    public void setEditorial(String editorial) {

        this.editorial = editorial;
    }

    public int getEdicion() {

        return edicion;
    }
    public void setEdicion(int edicion) {

        this.edicion = edicion;
    }

    public String getIsbn() {

        return isbn;
    }
    public void setIsbn(String isbn) {

        this.isbn = isbn;
    }

    public int getExistencias() {

        return existencias;
    }
    public void setExistencias(int existencias) {

        this.existencias = existencias;
    }

}//Fin Libro