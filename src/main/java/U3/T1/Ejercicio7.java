package U3.T1;

//Diseñar una función que nos diga si un número es primo.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero para saber si es primo: ");
        int numeroIntroducido = sc.nextInt();
        boolean esPrimo = true;
        if (esPrimo(numeroIntroducido,esPrimo)){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
    static boolean esPrimo(int numero, boolean esPrimo){
        for (int i = 2; i < numero; i++) {
            if (numero%i==0){
                esPrimo=false;
                break;
            }
        }
        return esPrimo;
    }
}
