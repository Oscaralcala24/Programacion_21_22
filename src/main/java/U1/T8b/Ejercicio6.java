package U1.T8b;

//Lo mismo que el 5 pero la pirámide hueca

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce altura de la piramide: ");
        int altura = teclado.nextInt();
        System.out.print("Introduce caracter de la piramide: ");
        char caracter = teclado.next().charAt(0);
        for (int i = 1; i < altura; i++) {
            for (int blancos = 1; blancos < altura-i; blancos++) {
                System.out.print(" ");
            }
            for (int j = altura; j <=altura ; j++) {
                System.out.print(caracter);
            }

            for (int blancos = altura+1; blancos < altura+i*2; blancos++) {
                System.out.print("/");
            }
            if (i!=0)
            for (int k = altura; k <= altura; k++) {
                System.out.print(caracter);
            }
            if (i==altura-1){
                for (int ultimaLinea = 0; ultimaLinea <= i*2; ultimaLinea++) {
                    System.out.print(caracter);
                }
            }


            System.out.println();
        }
    }
}
