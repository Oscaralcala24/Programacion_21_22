package U1.U1_Entregable;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce altura: ");
        int altura = sc.nextInt();

        while ((altura<4) || (altura % 2 == 0)){
            System.out.println("Introduce altura: ");
            altura = sc.nextInt();
        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura*2)+4; j++) {
                if (i<=altura/2){
                    if ((j==0) || (j==altura-1) || (j==i) || (j==altura-1-i) || (j== altura+3+i) || (j == altura*2-1-i+3)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }else {
                    if ((j==0) || (j==altura-1) || (j==(altura+3)+(altura/2))){
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
