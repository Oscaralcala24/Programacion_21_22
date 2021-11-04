package U1.Alcala_Espigares_U1_EXAMEN;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca altura: ");
        int altura = sc.nextInt();
        while (altura<=3){
            System.out.print("Introduzca altura: ");
            altura = sc.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura*2)+2+altura; j++) {
                if ((j==altura-i) || (j== altura+i) || (j== altura*2+2) ){
                    System.out.print("*");
                }else if ((i==0) && (j>=altura*2+2) && (j<(altura*2)+2+altura-1)){
                    System.out.print("*");
                }else if ((i==altura/2) && (j>=altura*2+2) && (j<(altura*2)+2+altura-1)){
                    System.out.print("*");
                }else if ((i==altura-1) && (j>=altura*2+2) && (j<(altura*2)+2+altura-1)){
                    System.out.print("*");
                }else if ((j == (altura*2)+2+altura-1) && (i>0) && (i<altura/2)){
                    System.out.print("*");
                }else if ((j == (altura*2)+2+altura-1) && (i>altura/2) && (i<altura-1)){
                    System.out.print("*");
                }
                else if ((i== altura/2+1) && (j<= altura+i) && (j>=altura-i)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
