package com.fca.biblioteca.data;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "autor")
public class Autor_Libro {
    @Id
    @Column(name = "idAutorLibro")
    private int idAutorLibro;
    @Column(name = "idAutor")
    private int idAutor;
    @Column(name = "idLibro")
    private int idLibro;

    //Getters y Setters
    public int getIdAutor() {

        return idAutor;
    }
    public void setIdAutor(int idAutor) {

        this.idAutor = idAutor;
    }

    public int getIdLibro() {

        return idLibro;
    }
    public void setIdLibro(int idLibro) {

        this.idLibro = idLibro;
    }

    public int getIdAutorLibro() {
        return idAutorLibro;
    }

    public void setIdAutorLibro(int idAutorLibro) {
        this.idAutorLibro = idAutorLibro;
    }
}//Fin Autor_Libro