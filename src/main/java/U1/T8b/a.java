package U1.T8b;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce altura de rombo: ");
        int altura = teclado.nextInt();
        while ((altura%2==0) || (altura<3)) {
            System.out.print("Numero introducido incorrecto. Vuelve a introducir la altura: ");
            altura = teclado.nextInt();
        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if ((i==0) || (i==altura-1)){
                    if (j==(altura-1)/2){
                        System.out.print("*");
                    }
                } else if ((j==altura/2-i) || (j==altura/2+i)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
