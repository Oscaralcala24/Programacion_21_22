package U1.Pruebas;

import java.util.Scanner;

public class RomboHueco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce altura: ");
        int altura = sc.nextInt();


        for (int i = 0; i < altura/2; i++) {
            for (int j = 0; j < altura; j++) {
                if (j == altura/2 - i){
                    System.out.print("*");
                }else if (j == altura/2 + i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i <= altura/2; i++) {
            for (int j = 0; j < altura; j++) {
                if (j==i){
                    System.out.print("*");
                }else if(j == altura - i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

