package U1.T8;

//Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
// A continuación, solicitará por teclado un valor que debe estar dentro del rango.
// Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce valor minimo: ");
        int numeroMinimo = teclado.nextInt();
        System.out.print("Introduce valor maximo: ");
        int numeroMaximo = teclado.nextInt();
        System.out.print("Introduce valor dentro del rango: ");
        int numeroRango = teclado.nextInt();
        while ((numeroRango < numeroMinimo) || (numeroRango > numeroMaximo)){
            System.out.print("Introduce valor dentro del rango: ");
            numeroRango = teclado.nextInt();
        }
    }
}
