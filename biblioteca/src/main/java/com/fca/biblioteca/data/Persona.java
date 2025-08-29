package com.fca.biblioteca.data;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @Column(name = "idPersona")
    private int idPersona;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "primerApellido")
    private String primerApellido;
    @Column(name = "segundoApellido")
    private String segundoApellido;

    // Getters y Setters
    public int getId() {

        return id;
    }
    public void setId(int id) {

        this.id = id;
    }

    public String getNombre() {


        return nombre;

    }
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getPrimerApellido() {

        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido){

        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {

        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {

        this.segundoApellido = segundoApellido;
    }

}//Fin Persona