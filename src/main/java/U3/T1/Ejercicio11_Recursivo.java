package U3.T1;

import java.util.Scanner;

public class Ejercicio11_Recursivo {
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

    private static float calcularElevado(float base, int exponente) {
        if (exponente>1){
             return base = calcularElevado(base, exponente - 1) * base;
        }else {
            return base;
        }
    }
}
