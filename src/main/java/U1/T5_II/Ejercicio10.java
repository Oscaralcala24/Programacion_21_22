package U1.T5_II;

//Escribe un programa que dada una hora determinada (horas y minutos),
// calcule los segundos que faltan para llegar a la medianoche.

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce hora: ");
        int hora = teclado.nextInt();
        System.out.print("Introduce minutos: ");
        int minutos = teclado.nextInt();
        int segundos = (hora*60*60)+(minutos*60);
        int segundosMedianoche = 24*60*60;
        System.out.println("Faltan "+(segundosMedianoche-segundos)+" segundos para medianoche");
    }
}
