package U3.T1;

//Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        int numeroIntroducido1 = sc.nextInt();
        System.out.print("Introduce segundo numero: ");
        int numeroIntroducido2 = sc.nextInt();
        System.out.println(numeroMayor(numeroIntroducido1,numeroIntroducido2));
    }
    static int numeroMayor(int numero1, int numero2){
        if (numero1>numero2){
            return numero1;
        }else {
            return numero2;
        }
    }
}
