package U1.T5_II;

//Realiza un programa que calcule la media de tres notas que se solicitarán al usuario

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        double sumaNotas=0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Introduce nota: ");
            double nota = teclado.nextDouble();
            sumaNotas=sumaNotas+nota;
            media=sumaNotas/i;
        }
        System.out.println("La nota media es: "+media);
    }
}
