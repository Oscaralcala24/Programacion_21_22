package U5.Tarea1.Parte4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lavadora[] arrayLavadora = new Lavadora[0];
        Lavadora lv1 = new Lavadora(200, Electrodomestico.coloresDisponibles.AZUL, Electrodomestico.consumoEnergetico.E,60,30);
        Lavadora lv2 = new Lavadora(256, Electrodomestico.coloresDisponibles.ROJO, Electrodomestico.consumoEnergetico.A,40,60);
        Lavadora lv3 = new Lavadora(237, Electrodomestico.coloresDisponibles.ROJO, Electrodomestico.consumoEnergetico.B,40,90);
        Lavadora lv4 = new Lavadora(754, Electrodomestico.coloresDisponibles.BLANCO, Electrodomestico.consumoEnergetico.F,40,60);
        lv1.introducirLavadora(arrayLavadora);
        lv2.introducirLavadora(arrayLavadora);
        lv3.introducirLavadora(arrayLavadora);
        lv4.introducirLavadora(arrayLavadora);
        imprimirArray(arrayLavadora);
        Arrays.sort(arrayLavadora);
        imprimirArray(arrayLavadora);
        Arrays.sort(arrayLavadora, new compararPrecioFinal());
        imprimirArray(arrayLavadora);
    }

    private static void imprimirArray(Lavadora[] arrayLavadora) {
        for (Lavadora l1 : arrayLavadora){
            System.out.println(l1);
        }
    }
}
