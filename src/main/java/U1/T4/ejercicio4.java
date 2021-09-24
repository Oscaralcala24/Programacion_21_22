package U1.T4;

//Sería interesante disponer de un programa que pida como entrada
// un número decimal y lo muestre redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero decimal: ");
        double numero1 = teclado.nextDouble();
        System.out.println("El numero redondeado es: "+ Math.round(numero1));
    }
}
