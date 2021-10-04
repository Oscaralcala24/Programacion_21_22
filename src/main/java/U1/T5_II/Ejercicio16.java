package U1.T5_II;

//Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numeroIntroducido = teclado.nextInt();
        int ultimaCifra;
        ultimaCifra=numeroIntroducido%10;
        System.out.println("La ultima cifra del numero introducido es: "+ultimaCifra);
    }
}
