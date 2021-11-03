package U3.T1;

//Realizar una función que calcule a elevado a n, donde a es real, y n entero no negativo.
//Realizar una versión iterativa y otra recursiva.

import java.util.Scanner;

public class Ejercicio11_Iterativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce valor de a: ");
        float a = sc.nextFloat();
        System.out.print("Introduce valor de n: ");
        int n = sc.nextInt();
        while (n<=0){
            System.out.print("Introduce valor de n: ");
            n = sc.nextInt();
        }
        System.out.println(calcularElevado(a,n));

    }

    private static float calcularElevado(float a, int n) {
        float resultado;
        resultado = (float) Math.pow(a,n);
        return resultado;
    }
}
