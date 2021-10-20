package U1.Pruebas;

import java.util.Scanner;

public class Calcetines {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        int altura = teclado.nextInt();
        while(  (altura < 4)){
            System.out.print("Dime la altura: ");
            altura = teclado.nextInt();
        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < 14; j++) {
                if (i<altura-2){
                    if ((j>=0) && (j<=2)){
                        System.out.print("*");
                    }else if((j>=8) && (j<=10)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }else {
                    if ((j>=0) && (j<=5)){
                        System.out.print("*");
                    }else if ((j>=8) && (j<=13)){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
