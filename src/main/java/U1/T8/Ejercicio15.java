package U1.T8;

//Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos.
// Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:

//
//Resultado del programa: Entre 1 y 8 hay 5 números primos.



import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        int primos = 0;
        int contador =0;
        for (int i = 1; i <= numero; i++) {
            if (contador==2){
                primos++;
            }
            contador =0;
            for (int j = 1; j <= numero; j++) {
                if (i%j==0){
                    contador++;
                }
            }
        }
        System.out.println("Resultado del programa: Entre 1 y "+numero+" hay "+primos+" numero primos");
    }
}


