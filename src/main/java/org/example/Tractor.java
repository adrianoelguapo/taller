package org.example;

import java.util.ArrayList;

public class Tractor extends Vehiculo{
    // atributos
    private ArrayList<String> piezasTractor;

    // constructor
    public Tractor(String matricula, String color, String marcaYModelo) {
        super(matricula, color, marcaYModelo);
        this.piezasTractor = new ArrayList<>();
        piezasTractor.add("Enganche");
        piezasTractor.add("Toma de fuerza");
        piezasTractor.add("Barra de tiro");
        piezasTractor.add("Cabina");
        piezasTractor.add("Sistema hidráulico");
    }

    // getters y setters
    public ArrayList<String> getPiezasTractor() {
        return piezasTractor;
    }

    public void setPiezasTractor(ArrayList<String> piezasTractor) {
        this.piezasTractor = piezasTractor;
    }
}
