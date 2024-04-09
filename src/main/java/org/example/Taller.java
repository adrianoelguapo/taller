package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class Taller {
    // atributos
    private ArrayList<Coche> coches;
    private ArrayList<Moto> motos;
    private ArrayList<Camion> camiones;
    private ArrayList<Tractor> tractores;
    private ArrayList<Grua> gruas;

    // constructor
    public Taller(){
        // iniciar arraylists
        coches = new ArrayList<>();
        motos = new ArrayList<>();
        camiones = new ArrayList<>();
        tractores = new ArrayList<>();
        gruas = new ArrayList<>();

        // añadir coches
        coches.add(new Coche("1234CBC","Negro","Citroën C3"));
        coches.add(new Coche("5678CBG","Gris","Peugeot 206"));
        coches.add(new Coche("9102XYZ", "Rojo", "Ford Fiesta"));
        coches.add(new Coche("3456LMN", "Blanco", "Volkswagen Golf"));
        coches.add(new Coche("7890QRS", "Plateado", "Toyota Corolla"));

        // añadir motos
        motos.add(new Moto("5421CBD","Azul","Yamaha R1"));
        motos.add(new Moto("9865JHS","Verde","Kawasaki Ninja"));
        motos.add(new Moto("7531ABC", "Azul", "Honda CBR"));
        motos.add(new Moto("2468DEF", "Negro", "Suzuki GSX-R"));
        motos.add(new Moto("1593GHI", "Blanco", "Yamaha MT-07"));

        // añadir camiones
        camiones.add(new Camion("3295DYF","Blanco","Scania R500"));
        camiones.add(new Camion("7634KXY","Negro","Iveco T-Way"));
        camiones.add(new Camion("9876LMN", "Blanco", "Mercedes-Benz Actros"));
        camiones.add(new Camion("5432PQR", "Rojo", "Volvo FH"));
        camiones.add(new Camion("2109XYZ", "Azul", "MAN TGX"));

        // añadir tractores
        tractores.add(new Tractor("2514BHC","Verde","John Deere 7530"));
        tractores.add(new Tractor("5766CFD","Amarillo","Claas Axion 850"));
        tractores.add(new Tractor("1234ABC", "Verde", "John Deere 6130R"));
        tractores.add(new Tractor("5678DEF", "Azul", "New Holland T7"));
        tractores.add(new Tractor("9012GHI", "Rojo", "Massey Ferguson 7726S"));

        // añadir gruas
        gruas.add(new Grua("4324KJH","Amarillo","Liebherr LTM 11200-9.1"));
        gruas.add(new Grua("7640LPS","Amarillo","XCMG XGC-55"));
        gruas.add(new Grua("9876TUV", "Rojo", "Liebherr LTM 1350-6.1"));
        gruas.add(new Grua("5432WXY", "Blanco", "Terex AC 1000"));
        gruas.add(new Grua("2109ZAB", "Verde", "Tadano ATF 600G-8"));
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public ArrayList<Moto> getMotos() {
        return motos;
    }

    public ArrayList<Camion> getCamiones() {
        return camiones;
    }

    public ArrayList<Tractor> getTractores() {
        return tractores;
    }

    public ArrayList<Grua> getGruas() {
        return gruas;
    }

    // métodos reparar
    public void reparar(Coche coche) {
        // Obtener la lista de piezas del coche
        ArrayList<String> piezas = coche.getPiezas();

        // Convertir la lista de piezas a un arreglo de strings
        String[] opcionesPiezas = piezas.toArray(new String[0]);

        // Mostrar un cuadro de diálogo para seleccionar la pieza a reparar
        int indicePiezaSeleccionada = JOptionPane.showOptionDialog(null, "¿A qué pieza del " + coche.getMarcaYModelo() + " hay que hacerle un apaño?", "Reparaciones de las wapas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesPiezas, opcionesPiezas[0]);

        // Obtener la pieza seleccionada
        String piezaSeleccionada = piezas.get(indicePiezaSeleccionada);

        // Mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(null, "La pieza " + piezaSeleccionada + " del coche " + coche.getMarcaYModelo() + " acaba de quedar flamísima.", "A mandar jefe, ¿que toca?", JOptionPane.INFORMATION_MESSAGE);

        String[] opcionesFinales = {"Seguir", "Salir"};

        int indiceopcionFinal = JOptionPane.showOptionDialog(null,"¿Quieres seguir dando el callo o cerramos el chiringuito?","Seguimos levantando el país o lo dejamos por hoy",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcionesFinales,opcionesFinales[0]);

        String opcionFinal = opcionesFinales[indiceopcionFinal];

        switch (opcionFinal) {
            case "Seguir":
                break;
            case "Salir":
                JOptionPane.showMessageDialog(null, "Mañana a seguir levantando este país de pufistas y mafiosos. Un saludo camarada.", "Hora de cerveza post currela", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                break;
        }
    }


    public void reparar(Moto moto) {
        ArrayList<String> piezasMoto = moto.getPiezasMoto();
        String[] opcionesPiezasMoto = piezasMoto.toArray(new String[0]);
        int indicePiezaSeleccionada = JOptionPane.showOptionDialog(null, "¿A qué pieza de la " + moto.getMarcaYModelo() + " hay que hacerle un apaño?", "A mandar jefe, ¿que toca?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesPiezasMoto, opcionesPiezasMoto[0]);
        String piezaMotoSeleccionada = piezasMoto.get(indicePiezaSeleccionada);
        JOptionPane.showMessageDialog(null, "La pieza " + piezaMotoSeleccionada + " de la moto " + moto.getMarcaYModelo() + " acaba de quedar flamísima.", "Reparaciones de las wapas", JOptionPane.INFORMATION_MESSAGE);
        String[] opcionesFinales = {"Seguir", "Salir"};
        int indiceopcionFinal = JOptionPane.showOptionDialog(null,"¿Quieres seguir dando el callo o cerramos el chiringuito?","Seguimos levantando el país o lo dejamos por hoy",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcionesFinales,opcionesFinales[0]);
        String opcionFinal = opcionesFinales[indiceopcionFinal];
        switch (opcionFinal) {
            case "Seguir":
                break;
            case "Salir":
                JOptionPane.showMessageDialog(null, "Mañana a seguir levantando este país de pufistas y mafiosos. Un saludo camarada.", "Hora de cerveza post currela", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                break;
        }
    }


    public void reparar(Camion camion) {
        ArrayList<String> piezasCamion = camion.getPiezasCamion();
        String[] opcionesPiezasCamion = piezasCamion.toArray(new String[0]);
        int indicePiezaSeleccionada = JOptionPane.showOptionDialog(null, "¿A qué pieza del " + camion.getMarcaYModelo() + " hay que hacerle un apaño?", "A mandar jefe, ¿que toca?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesPiezasCamion, opcionesPiezasCamion[0]);
        String piezaCamionSeleccionada = piezasCamion.get(indicePiezaSeleccionada);
        JOptionPane.showMessageDialog(null, "La pieza " + piezaCamionSeleccionada + " del camión " + camion.getMarcaYModelo() + " acaba de quedar flamísima.", "Reparaciones de las wapas", JOptionPane.INFORMATION_MESSAGE);
        String[] opcionesFinales = {"Seguir", "Salir"};
        int indiceopcionFinal = JOptionPane.showOptionDialog(null,"¿Quieres seguir dando el callo o cerramos el chiringuito?","Seguimos levantando el país o lo dejamos por hoy",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcionesFinales,opcionesFinales[0]);
        String opcionFinal = opcionesFinales[indiceopcionFinal];
        switch (opcionFinal) {
            case "Seguir":
                break;
            case "Salir":
                JOptionPane.showMessageDialog(null, "Mañana a seguir levantando este país de pufistas y mafiosos. Un saludo camarada.", "Hora de cerveza post currela", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                break;
        }
    }


    public void reparar(Tractor tractor) {
        ArrayList<String> piezasTractor = tractor.getPiezasTractor();
        String[] opcionesPiezasTractor = piezasTractor.toArray(new String[0]);
        int indicePiezaSeleccionada = JOptionPane.showOptionDialog(null, "¿A qué pieza del " + tractor.getMarcaYModelo() + " hay que hacerle un apaño?", "A mandar jefe, ¿que toca?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesPiezasTractor, opcionesPiezasTractor[0]);
        String piezaTractorSeleccionada = piezasTractor.get(indicePiezaSeleccionada);
        JOptionPane.showMessageDialog(null, "La pieza " + piezaTractorSeleccionada + " del tractor " + tractor.getMarcaYModelo() + " acaba de quedar flamísima.", "Reparaciones de las wapas", JOptionPane.INFORMATION_MESSAGE);
        String[] opcionesFinales = {"Seguir", "Salir"};
        int indiceopcionFinal = JOptionPane.showOptionDialog(null,"¿Quieres seguir dando el callo o cerramos el chiringuito?","Seguimos levantando el país o lo dejamos por hoy",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcionesFinales,opcionesFinales[0]);
        String opcionFinal = opcionesFinales[indiceopcionFinal];
        switch (opcionFinal) {
            case "Seguir":
                break;
            case "Salir":
                JOptionPane.showMessageDialog(null, "Mañana a seguir levantando este país de pufistas y mafiosos. Un saludo camarada.", "Hora de cerveza post currela", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                break;
        }
    }


    public void reparar(Grua grua) {
        ArrayList<String> piezasGrua = grua.getPiezasGrua();
        String[] opcionesPiezasGrua = piezasGrua.toArray(new String[0]);
        int indicePiezaSeleccionada = JOptionPane.showOptionDialog(null, "¿A qué pieza de la " + grua.getMarcaYModelo() + " hay que hacerle un apaño?", "A mandar jefe, ¿que toca?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesPiezasGrua, opcionesPiezasGrua[0]);
        String piezaGruaSeleccionada = piezasGrua.get(indicePiezaSeleccionada);
        JOptionPane.showMessageDialog(null, "La pieza " + piezaGruaSeleccionada + " de la grúa " + grua.getMarcaYModelo() + " acaba de quedar flamísima.", "Reparaciones de las wapas", JOptionPane.INFORMATION_MESSAGE);
        String[] opcionesFinales = {"Seguir", "Salir"};
        int indiceopcionFinal = JOptionPane.showOptionDialog(null,"¿Quieres seguir dando el callo o cerramos el chiringuito?","Seguimos levantando el país o lo dejamos por hoy",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcionesFinales,opcionesFinales[0]);
        String opcionFinal = opcionesFinales[indiceopcionFinal];
        switch (opcionFinal) {
            case "Seguir":
                break;
            case "Salir":
                JOptionPane.showMessageDialog(null, "Mañana a seguir levantando este país de pufistas y mafiosos. Un saludo camarada.", "Hora de cerveza post currela", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                break;
        }
    }
}