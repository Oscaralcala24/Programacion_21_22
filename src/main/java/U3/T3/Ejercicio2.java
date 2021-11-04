package U3.T3;

//Escribir una aplicación que solicite al usuario cuántos números desea introducir.
// A continuación, se introducirá porteclado esa cantidad de números enteros, y por último,
// los mostrará en el orden inverso al introducido.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros desea introducir: ");
        int numerosAIntroducir = sc.nextInt();
        int numerosIntroducidos[] = new int[numerosAIntroducir];
        int reverso[] = new int[numerosAIntroducir];

        for (int i = 0; i < numerosIntroducidos.length; i++) {
            System.out.print("Introduce un numero: ");
            numerosIntroducidos[i] = sc.nextInt();
        }
        for (int i = 0; i < numerosIntroducidos.length; i++) {
            reverso[numerosIntroducidos.length-1-i] = numerosIntroducidos[i];
        }
        System.out.print(Arrays.toString(reverso));
    }
}
