package U1.T5_II;

//Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax2 + bx + c = 0");
        System.out.print("Introduce valor de a: ");
        double a = teclado.nextDouble();
        System.out.print("Introduce valor de b: ");
        double b = teclado.nextDouble();
        System.out.print("Introduce valor de c: ");
        double c = teclado.nextDouble();
        double resultado1=0;
        double resultado2=0;

        if (a==0) {
            System.out.println("Esa ecuación no tiene solución real.");
        }else {
            resultado1 = ((-(b)) +(- (Math.sqrt((Math.pow(b, 2)) - (4 * a * c))))) / (2 * a);
            resultado2 = ((-(b)) +(+ (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))))/ (2 * a);

        }
        System.out.println("X = "+resultado1+ " y "+resultado2);
    }
}
