package org.example;

import java.util.ArrayList;

public class Moto extends Vehiculo{
    // atributos
    private ArrayList<String> piezasMoto;

    // constructor
    public Moto(String matricula, String color, String marcaYModelo) {
        super(matricula, color, marcaYModelo);
        this.piezasMoto = new ArrayList<>();
        piezasMoto.add("Suspensión");
        piezasMoto.add("Horquilla");
        piezasMoto.add("Escape");
        piezasMoto.add("Motor");
        piezasMoto.add("Cadena");
    }

    // getters y setters

    public ArrayList<String> getPiezasMoto() {
        return piezasMoto;
    }

    public void setPiezasMoto(ArrayList<String> piezasMoto) {
        this.piezasMoto = piezasMoto;
    }
}
