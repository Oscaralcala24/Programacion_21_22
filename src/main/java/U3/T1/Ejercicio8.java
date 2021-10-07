package U3.T1;

//Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero para saber sus divisores que son primos: ");
        int numeroIntroducido = sc.nextInt();
        int numeroPrimos = 0;
        System.out.println(contadorDivisoresPrimos(numeroIntroducido,numeroPrimos));
    }
    static int contadorDivisoresPrimos(int numero, int primos){
        for (int i = 2; i <= numero; i++) {
            boolean esPrimo = true;
            if (numero%i==0){
                for (int j = 1; j < i ; j++) {
                    if (i%j==0){
                        esPrimo=false;
                    }
                }
                if (esPrimo){
                    primos++;
                }
            }
        }
        return primos;
    }
}
