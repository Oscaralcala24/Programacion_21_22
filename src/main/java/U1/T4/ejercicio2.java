package U1.T4;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce primera nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Introduce segunda nota: ");
        double nota2 = teclado.nextDouble();
        double media = (nota1+nota2)/2;
        System.out.println("La nota media es: "+media);
    }
}
