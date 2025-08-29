package com.fca.biblioteca.data;

public class Persona {
    private int id;
    private String nombre;
    private String primerApellido;
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