package org.example;

import java.util.ArrayList;

public class Grua extends Vehiculo{
    // atributos
    private ArrayList<String> piezasGrua;

    // constructor
    public Grua(String matricula, String color, String marcaYModelo) {
        super(matricula, color, marcaYModelo);
        this.piezasGrua = new ArrayList<>();
        piezasGrua.add("Pluma");
        piezasGrua.add("Torno");
        piezasGrua.add("Contrapluma");
        piezasGrua.add("Estabilizadores");
        piezasGrua.add("Cabina de control");
    }

    // getters y setters
    public ArrayList<String> getPiezasGrua() {
        return piezasGrua;
    }

    public void setPiezasGrua(ArrayList<String> piezasGrua) {
        this.piezasGrua = piezasGrua;
    }
}
