package org.example;

import java.util.ArrayList;

public class Coche extends Vehiculo{
    // atributos
    private ArrayList<String> piezas;

    // constructor
    public Coche(String matricula, String color, String marcaYModelo) {
        super(matricula, color, marcaYModelo);
        this.piezas = new ArrayList<>();
        piezas.add("Cambio de Aceite");
        piezas.add("Inyección");
        piezas.add("Dirección");
        piezas.add("Centralita");
        piezas.add("Frenos");
    }

    // getters y setters
    public ArrayList<String> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<String> piezas) {
        this.piezas = piezas;
    }
}
