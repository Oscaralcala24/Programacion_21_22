package U3.T3;

//Actividad 1: Diseñar un programa que solicite al usuario 5 números decimales.
// A continuación, debe mostrar los números en el mismo orden en que se han introducido.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numerosIntroducidos[] = new float[5];
        for (int i = 0; i < numerosIntroducidos.length; i++) {
            System.out.println("Introduce un numero decimal: ");
            numerosIntroducidos[i] = sc.nextFloat();
        }

        System.out.println(Arrays.toString(numerosIntroducidos));
    }
}
