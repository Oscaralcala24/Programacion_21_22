package U1.T3;

//Crea un programa que calcule y muestre la división
// de dos números reales de doble precisión introducidos por el usuario.

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce primer numero: ");
        double numero1 = teclado.nextDouble();
        System.out.println("Introduce segundo numero: ");
        double numero2 = teclado.nextDouble();
        System.out.println("El resultado es: "+(numero1/numero2));
    }
}
