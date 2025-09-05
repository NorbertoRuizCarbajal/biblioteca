package com.fca.biblioteca.data;
import java.time.Year;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @Column(name = "idLibro")
    private int idLibro;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "anioPublicacion")
    private Year anioPublicacion;
    @Column(name = "editorial")
    private String editorial;
    @Column(name = "edicion")
    private String edicion;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "existencia")
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

    public String getEdicion() {

        return edicion;
    }
    public void setEdicion(String edicion) {

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