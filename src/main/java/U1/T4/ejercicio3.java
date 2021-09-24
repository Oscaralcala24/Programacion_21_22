package U1.T4;

//Modificar el ejercicio anterior para que muestre la parte entera de la media de tres notas decimales.

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce primera nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Introduce segunda nota: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Introduce tercera nota: ");
        double nota3 = teclado.nextDouble();
        double mediaDecimal = (nota1+nota2+nota3)/3;
        int mediaSinDecimal = (int) mediaDecimal;
        System.out.println("La nota media es: "+mediaSinDecimal);
    }
}
