package U3.T1;

//Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        int numeroIntroducido1 = sc.nextInt();
        System.out.print("Introduce segundo numero: ");
        int numeroIntroducido2 = sc.nextInt();
        mayorMenor(numeroIntroducido1,numeroIntroducido2);
    }

    static void mayorMenor(int numero1, int numero2){
        if (numero1>numero2){
            numerosComprendidos(numero1,numero2);
        }else {
            numerosComprendidos(numero2,numero1);
        }
    }

    private static void numerosComprendidos(int num1, int num2) {
        for (int i = num2; i <= num1 ; i++) {
            System.out.println(i);
        }
    }
}
