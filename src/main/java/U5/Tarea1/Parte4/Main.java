package U5.Tarea1.Parte4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Electrodomestico[] arrayElectrodomesticos = new Electrodomestico[10];
        Lavadora[] arrayLavadora = new Lavadora[4];
        Television tv1 = new Television(120, Electrodomestico.coloresDisponibles.NEGRO, Electrodomestico.consumoEnergetico.E,23,42,true);
        Television tv2 = new Television(250, Electrodomestico.coloresDisponibles.NEGRO, Electrodomestico.consumoEnergetico.F,15,32,false);
        Television tv3 = new Television(600, Electrodomestico.coloresDisponibles.NEGRO, Electrodomestico.consumoEnergetico.A,26,55,true);
        Lavadora lv1 = new Lavadora(200, Electrodomestico.coloresDisponibles.AZUL, Electrodomestico.consumoEnergetico.E,60,30);
        Lavadora lv2 = new Lavadora(256, Electrodomestico.coloresDisponibles.ROJO, Electrodomestico.consumoEnergetico.A,40,60);
        Lavadora lv3 = new Lavadora(237, Electrodomestico.coloresDisponibles.ROJO, Electrodomestico.consumoEnergetico.B,40,90);
        Lavadora lv4 = new Lavadora(754, Electrodomestico.coloresDisponibles.BLANCO, Electrodomestico.consumoEnergetico.F,40,60);
        arrayElectrodomesticos[0] = tv1;
        arrayElectrodomesticos[1] = tv2;
        arrayElectrodomesticos[2] = lv1;
        arrayElectrodomesticos[3] = lv4;
        arrayElectrodomesticos[4] = lv3;
        arrayElectrodomesticos[5] = tv3;
        arrayElectrodomesticos[6] = lv2;
        imprimirArrayElectrodomestico(arrayElectrodomesticos);
        System.out.println("---------------------------");
        arrayLavadora[0] = lv1;
        arrayLavadora[1] = lv2;
        arrayLavadora[2] = lv3;
        arrayLavadora[3] = lv4;
        System.out.println(arrayLavadora.length);
        imprimirArrayLavadora(arrayLavadora);
        Arrays.sort(arrayLavadora);
        System.out.println("------------------------------------------------");
        imprimirArrayLavadora(arrayLavadora);
        System.out.println("------------------------------------------------");
        Arrays.sort(arrayLavadora, new compararPrecioFinal());
        imprimirArrayLavadora(arrayLavadora);
    }

    private static void imprimirArrayLavadora(Lavadora[] arrayLavadora) {
        for (Lavadora l1 : arrayLavadora){
            System.out.println(l1);
        }
    }

    private static void imprimirArrayElectrodomestico(Electrodomestico[] arrayElectrodomestico) {
        for (Electrodomestico e : arrayElectrodomestico){
            System.out.println(e);
        }
    }
}
