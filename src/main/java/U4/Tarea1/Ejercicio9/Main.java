package U4.Tarea1.Ejercicio9;

import U4.Tarea1.Ejercicio9.Maquinaria.Locomotoras;
import U4.Tarea1.Ejercicio9.Maquinaria.Trenes;
import U4.Tarea1.Ejercicio9.Personal.Jefes;
import U4.Tarea1.Ejercicio9.Personal.Maquinistas;
import U4.Tarea1.Ejercicio9.Personal.Mecanicos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Jefes jefe1 = new Jefes("Pepe","54657885T");
        Maquinistas maqui1 = new Maquinistas("Juanlu","445364443L", 1200.00,1);
        Mecanicos meca1 = new Mecanicos("Oscar",657388263, Mecanicos.tipoEspecialidad.AERODINAMICA);
        Locomotoras loco1 = new Locomotoras("2537LGG",320,1999, meca1);
        Trenes tren1 = new Trenes(loco1, maqui1);
        Trenes tren2 = new Trenes(loco1, maqui1);
        tren1.addVagon(1200,500,"ALIMENTACION");
        tren1.addVagon(1300,800,"MAQUINARIA");
        tren1.addVagon(1260,400,"LIQUIDOS");
        tren1.addVagon(1000,400,"LIQUIDOS");
        tren1.addVagon(900,10,"MAQUINARIA");
        tren1.addVagon(3000,2200,"MAQUINARIA");
        tren1.addVagon(1200,1100,"ALIMENTACION");
        tren2.addVagon(1200,500,"ALIMENTACION");
        tren2.addVagon(1300,800,"MAQUINARIA");

        tren1.getVagones();
        tren2.getVagones();
    }

}
