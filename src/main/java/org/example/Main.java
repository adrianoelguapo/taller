package org.example;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Taller taller = new Taller();

        while (true){
            String[] opciones = {"Coches","Motos","Camiones","Tractores","Grúas","Salir del taller"};

            int indiceOpciones = JOptionPane.showOptionDialog(null, "Bienvenido al taller de adrianoelguapo. Toca chollar osea que elige que quieres reparar.", "El taller del más guapo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            String opcionElegida = opciones[indiceOpciones];

            switch (opcionElegida){
                case "Coches":
                    String[] opcionesCoches = new String[taller.getCoches().size()];
                    for (int i = 0; i < taller.getCoches().size(); i++) {
                        opcionesCoches[i] = taller.getCoches().get(i).getMarcaYModelo();
                    }
                    int indiceCocheSeleccionado = JOptionPane.showOptionDialog(null, "Maestro, estos son los coches que hay en el taller.", "Selección de bólido supremo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesCoches, opcionesCoches[0]);
                    Coche cocheSeleccionado = taller.getCoches().get(indiceCocheSeleccionado);
                    taller.reparar(cocheSeleccionado);
                    break;
                case "Motos":
                    String[] opcionesMotos = new String[taller.getMotos().size()];
                    for (int i = 0; i < taller.getMotos().size(); i++) {
                        opcionesMotos[i] = taller.getMotos().get(i).getMarcaYModelo();
                    }
                    int indiceMotoSeleccionada = JOptionPane.showOptionDialog(null, "Maestro, estas son las motos que hay en el taller.", "Selección de bólido supremo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesMotos, opcionesMotos[0]);
                    Moto motoSeleccionada = taller.getMotos().get(indiceMotoSeleccionada);
                    taller.reparar(motoSeleccionada);
                    break;
                case "Camiones":
                    String[] opcionesCamiones = new String[taller.getCamiones().size()];
                    for (int i = 0; i < taller.getCamiones().size(); i++) {
                        opcionesCamiones[i] = taller.getCamiones().get(i).getMarcaYModelo();
                    }
                    int indiceCamionSeleccionado = JOptionPane.showOptionDialog(null, "Maestro, estos son los camiones que hay en el taller.", "Selección de bólido supremo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesCamiones, opcionesCamiones[0]);
                    Camion camionSeleccionado = taller.getCamiones().get(indiceCamionSeleccionado);
                    taller.reparar(camionSeleccionado);
                    break;
                case "Tractores":
                    String[] opcionesTractores = new String[taller.getTractores().size()];
                    for (int i = 0; i < taller.getTractores().size(); i++) {
                        opcionesTractores[i] = taller.getTractores().get(i).getMarcaYModelo();
                    }
                    int indiceTractorSeleccionado = JOptionPane.showOptionDialog(null, "Maestro, estos son los tractores que hay en el taller.", "Selección de bólido supremo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesTractores, opcionesTractores[0]);
                    Tractor tractorSeleccionado = taller.getTractores().get(indiceTractorSeleccionado);
                    taller.reparar(tractorSeleccionado);
                    break;
                case "Grúas":
                    String[] opcionesGruas = new String[taller.getGruas().size()];
                    for (int i = 0; i < taller.getGruas().size(); i++) {
                        opcionesGruas[i] = taller.getGruas().get(i).getMarcaYModelo();
                    }
                    int indiceGruaSeleccionada = JOptionPane.showOptionDialog(null, "Maestro, estas son las grúas que hay en el taller.", "Selección de bólido supremo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesGruas, opcionesGruas[0]);
                    Grua gruaSeleccionada = taller.getGruas().get(indiceGruaSeleccionada);
                    taller.reparar(gruaSeleccionada);
                    break;
                case "Salir del taller":
                    JOptionPane.showMessageDialog(null, "A tomarse un día de descanso currante, te lo mereces.", "Hoy paso de movidas", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                    break;
            }
        }
    }
}