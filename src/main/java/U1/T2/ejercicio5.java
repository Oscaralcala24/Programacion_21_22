package U1.T2;

//Crea un programa que pida al usuario una temperatura en grados centígrados
// y calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce temperatura en grados centigrados: ");
        double gradosCentigrados = teclado.nextDouble();
        double gradosFahrenheit = (9*gradosCentigrados/5)+32;
        System.out.println("aa");

    }
}
