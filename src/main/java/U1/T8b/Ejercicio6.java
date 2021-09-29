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
            for (int blancos = 1; blancos < altura - i; blancos++) {
                System.out.print(" ");
            }
            for (int asteriscos = 0; asteriscos <= i * 2; asteriscos++) {
                if ((asteriscos == 0) && (i!=0)) {
                    System.out.print(caracter);
                } else if (asteriscos == (i * 2)){
                    System.out.println(caracter);
                }else if (i==altura-1){
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
