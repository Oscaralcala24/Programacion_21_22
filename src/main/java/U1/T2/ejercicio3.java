package U1.T2;

//Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce primer numero entero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce segundo numero entero: ");
        int numero2 = teclado.nextInt();
        System.out.println("El resultado de la division es: "+(numero1/numero2));
    }
}
