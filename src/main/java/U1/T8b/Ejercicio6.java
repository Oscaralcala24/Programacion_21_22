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
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura*2; j++) {
                if (i<altura-1){
                    if (j == altura - i){
                        System.out.print("*");
                    }else if (j == altura+i){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }else {
                    if ((i == altura-1) && (j>=1)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }



            }
            System.out.println();
        }
    }
}
