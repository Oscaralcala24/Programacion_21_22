package U1.T5_II;

//Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
//
//Ejemplo 1:
//Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//Por favor, introduzca el valor de a: 2
//Ahora introduzca el valor de b: 1
//x = -0.5
//
//
//Ejemplo 2:
//Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//Por favor, introduzca el valor de a: 0
//Ahora introduzca el valor de b: 7
//Esa ecuación no tiene solución real.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Introduce valor de a: ");
        double a = teclado.nextDouble();
        System.out.print("Introduce valor de b: ");
        double b = teclado.nextDouble();
        double resultado;
        if (a==0){
            System.out.println("Esa ecuación no tiene solución real.");
        }else {
            if (b>=0){
                resultado= -b/a;
            }else {
                resultado= b/a;
            }
            System.out.println("x = "+resultado);
        }

    }
}
