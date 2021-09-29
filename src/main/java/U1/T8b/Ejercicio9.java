package U1.T8b;

//Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura.
// El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce altura de la piramide: ");
        int altura = teclado.nextInt();
        for (int i = 1; i < altura; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("*");
            }
            if (i==altura-1) {
                for (int j = 0; j < (altura/2)+1; j++) {
                    System.out.print("* ");
                }
            }
        }
    }
}
