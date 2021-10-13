package U3.T1;

//Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo.
//Realizar una versión iterativa y otra recursiva.

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce valor de a: ");
        float a = sc.nextFloat();
        System.out.print("Introduce valor de n: ");
        int n = sc.nextInt();
        while (n>=0){
            System.out.print("Introduce valor de n: ");
            n = sc.nextInt();
        }
        calcularElevado(a,n);

    }

    private static void calcularElevado(float a, int n) {

    }
}
