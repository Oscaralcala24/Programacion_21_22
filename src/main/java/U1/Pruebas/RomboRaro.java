package U1.Pruebas;

import java.util.Scanner;

public class RomboRaro {
    public static void main(String[] args) {
        String palabra = "PEPITO";
        String palabraInversa = "";
        int anchuraCadena = palabra.length();

        for (int i = anchuraCadena; i >= 1; i--) {
            palabraInversa = palabraInversa.concat(String.valueOf(palabra.charAt(i)));
        }
        System.out.println(palabraInversa);

        /*for (int i = 0; i < anchuraCadena*2; i++) {
            for (int j = 0; j < anchuraCadena*2; j++) {
                if (j==anchuraCadena-i){
                    System.out.print(palabra.substring(0,i));
                }else if (j==anchuraCadena+i){
                    System.out.print(palabra.substring(i,0));
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }*/
    }
}
