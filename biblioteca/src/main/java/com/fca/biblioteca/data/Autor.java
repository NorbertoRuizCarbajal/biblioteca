package com.fca.biblioteca.data;
import jakarta.persistence.Column;
import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @Column(name = "idAutor")
    private int idAutor;
    @Column(name = "idPersona")
    private int idPersona;

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

}//Fin Autor