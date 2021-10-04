package U1.T5_II;

//Escribe un programa que ordene tres números enteros introducidos por teclado.

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        int a = teclado.nextInt();
        System.out.print("Introduce segundo numero: ");
        int b = teclado.nextInt();
        System.out.print("Introduce tercer numero: ");
        int c = teclado.nextInt();
        if ((a>=b) && (b>=c)){
            System.out.println("El orden es: "+a+" "+b+" "+c);
        }else if ((a>=c) && (c>=b)) {
            System.out.println("El orden es: " + a + " " + c + " " + b);
        }else if ((b>=a) && (a>=c)) {
            System.out.println("El orden es: " + b + " " + a + " " + c);
        }else if ((b>=c) && (c>=a)) {
            System.out.println("El orden es: " + b + " " + c + " " + a);
        }else if ((c>=a) && (a>=b)) {
            System.out.println("El orden es: " + c + " " + a + " " + b);
        }else {
            System.out.println("El orden es: " + c + " " + b + " " + a);
        }
    }
}
