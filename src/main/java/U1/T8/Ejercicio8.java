package U1.T8;

//Pedir un número y calcular su factorial.
//
//Ejemplo: Factorial de 5:
//
//5! = 5x4x3x2x1 = 120

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero para saber su factorial: ");
        int numeroIntroducido = teclado.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numeroIntroducido; i++) {
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
