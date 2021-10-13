package U1.Pruebas;

import java.util.Scanner;

public class RomboRaro {
    public static void main(String[] args) {
        String palabra = "PEPITO";
        String palabraInversa = "";
        int anchuraCadena = palabra.length();
        for (int i = anchuraCadena-1; i >= 0; i--) {
            palabraInversa = palabraInversa.concat(String.valueOf(palabra.charAt(i)));
        }
        String palabraConcatenada = palabra.concat(palabraInversa)



        for (int i = 0; i < anchuraCadena*2; i++) {
            for (int j = 0; j < anchuraCadena*2; j++) {
                if (j==anchuraCadena-i){
                    System.out.print(palabra.substring(0,i));
                }else if (i == anchuraCadena+j){
                    System.out.print(palabra.substring(0,anchuraCadena*2-i));
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
