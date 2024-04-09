package org.example;

import java.util.ArrayList;

public class Camion extends Vehiculo{
    // atributos
    private ArrayList<String> piezasCamion;

    // constructor
    public Camion(String matricula, String color, String marcaYModelo) {
        super(matricula, color, marcaYModelo);
        this.piezasCamion = new ArrayList<>();
        piezasCamion.add("Transmisión");
        piezasCamion.add("Tacómetro");
        piezasCamion.add("Aire Acondicionado");
        piezasCamion.add("Enganche");
        piezasCamion.add("Neumáticos");
    }

    // getters y setters
    public ArrayList<String> getPiezasCamion() {
        return piezasCamion;
    }

    public void setPiezasCamion(ArrayList<String> piezasCamion) {
        this.piezasCamion = piezasCamion;
    }
}
