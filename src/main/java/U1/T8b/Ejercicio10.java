package U1.T8b;

//Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
// El programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos
// en la base para simular la curvatura de las esquinas inferiores.

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce altura de U: ");
        int altura = teclado.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 1; j <= altura*2; j++) {
                if (i != altura - 1) {
                    if (j == 1) {
                        System.out.print("*");
                    } else if (j == altura*2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == 1) {
                        System.out.print(" ");
                    } else if (j == altura*2 ) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
