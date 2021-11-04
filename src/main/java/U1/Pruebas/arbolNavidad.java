package U1.Pruebas;

import java.util.Scanner;

public class arbolNavidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int altura = sc.nextInt();

        for (int i = 0; i < altura/3; i++) {
            for (int j = 0; j < altura*2; j++) {
                if ((j >= altura-i*2) && (j <= altura+i*2)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < altura/3; i++) {
            for (int j = 0; j < altura*2; j++) {
                if ((j >= altura-i*2) && (j <= altura+i*2)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < altura/3+3; i++) {
            for (int j = 0; j < altura*2; j++) {
                if ((j >= altura-i*2) && (j <= altura+i*2) && (i<altura/3)){
                    System.out.print("*");
                }else if ((j>=altura-1) && (j<=altura+1) && (i>=altura/3)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
