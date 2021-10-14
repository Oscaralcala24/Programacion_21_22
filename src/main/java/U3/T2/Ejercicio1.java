package U3.T2;

//Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primera palabra: ");
        String palabra1 = sc.next();
        System.out.println("Introduce segunda palabra: ");
        String palabra2 = sc.next();

        System.out.print("La palabra mas grande es : " + calcularPalabraMayor(palabra1, palabra2));
    }

    private static String calcularPalabraMayor(String palabra1, String palabra2) {
        int anchuraPalabra1 = palabra1.length();
        int anchuraPalabra2 = palabra2.length();
        if (anchuraPalabra1>anchuraPalabra2){
            return palabra1;
        }else {
            return palabra2;
        }
    }
}
