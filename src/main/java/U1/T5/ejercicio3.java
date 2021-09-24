package U1.T5;

//Crea un programa que diga si el número introducido por el usuario es impar o no lo es.

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        if (numero%2==0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
