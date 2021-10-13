package U1.T8b;

//Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se debe comprobar que la
// altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce altura de X: ");
        int altura = teclado.nextInt();
        while ((altura%2==0) || (altura<3)) {
            System.out.print("Numero introducido incorrecto. Vuelve a introducir la altura: ");
            altura = teclado.nextInt();
        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j==i){
                    System.out.print("*");
                }else if (j==altura-1-i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
