package U1.T5_II;

//Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado.
// Se permiten números de hasta 5 cifras.

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numeroIntroducido = teclado.nextInt();
        int primerNumero = 0;
        if (numeroIntroducido<100000){
            for (int i = 1; i <= 5; i++) {
                if (numeroIntroducido>0){
                    primerNumero = numeroIntroducido%10;
                    numeroIntroducido=numeroIntroducido/10;
                }
            }
        }
        System.out.println("La primera cifra del numero introducido es: "+primerNumero);
    }
}
