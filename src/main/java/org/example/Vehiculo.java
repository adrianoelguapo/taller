package org.example;

public class Vehiculo {
    // atributos
    private String matricula;
    private String color;
    private String marcaYModelo;

    // constructor
    public Vehiculo(String matricula, String color, String marcaYModelo) {
        this.matricula = matricula;
        this.color = color;
        this.marcaYModelo = marcaYModelo;
    }

    // getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarcaYModelo() {
        return marcaYModelo;
    }

    public void setMarcaYModelo(String marcaYModelo) {
        this.marcaYModelo = marcaYModelo;
    }
}
