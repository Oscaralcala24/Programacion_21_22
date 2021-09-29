package U1.T8b;

//Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
// El carácter con el que se pinta la pirámide también se debe pedir por teclado

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce altura de la piramide: ");
        int altura = teclado.nextInt();
        System.out.print("Introduce caracter de la piramide: ");
        char caracter = teclado.next().charAt(0);
        for (int i = 0; i < altura; i++) {
            for (int blancos = 1; blancos < altura-i; blancos++) {
                System.out.print(" ");
            }
            for (int asteriscos = 0; asteriscos <=i*2; asteriscos++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
