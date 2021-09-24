package U1.T5;

//Crea un programa que pida al usuario que introduzca el número 12.
// Después debe decirle si lo ha hecho correctamente o no.

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero 12: ");
        int numero = teclado.nextInt();
        if (numero == 12){
            System.out.println("El numero introducido es correcto");
        } else{
            System.out.println("El numero introducido es incorrecto");
        }
    }
}

