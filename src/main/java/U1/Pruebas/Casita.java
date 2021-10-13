package U1.Pruebas;

import java.util.Scanner;

public class Casita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 15;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
               if (i<=altura/2){
                   if (i==altura/2){
                       System.out.print("*");
                   }else if (j==altura/2+i){
                       System.out.print("*");
                   }else if (j==altura/2-i){
                       System.out.print("*");
                   }else {
                       System.out.print(" ");
                   }
               }else {
                   if (j==0){
                       System.out.print("*");
                   }else if (j==altura-1){
                       System.out.print("*");
                   }else if (i==altura-1){
                       System.out.print("*");
                   }else{
                       System.out.print(" ");
                   }
               }
            }
            System.out.println();
        }
    }
}
