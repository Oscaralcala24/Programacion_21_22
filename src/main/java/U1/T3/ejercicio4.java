package U1.T3;

//Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
// y calcule su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero de millas: ");
        float numeroMillas = teclado.nextFloat();
        System.out.println("La conversion en kilometros es: "+(numeroMillas*1.609));
    }
}
