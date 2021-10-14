package U1.Pruebas;

import java.util.Scanner;

public class RomboRaro {
    /*public static void main(String[] args) {
        String palabra = "PEPITO";
        String palabraInversa = "";
        int anchuraCadena = palabra.length();
        for (int i = anchuraCadena-2; i >= 0; i--) {
            palabraInversa = palabraInversa.concat(String.valueOf(palabra.charAt(i)));
        }
        int anchuraCadenaInversa = palabraInversa.length();



        for (int i = 0; i < anchuraCadena*2; i++) {
            for (int j = 0; j < anchuraCadena*2; j++) {
                if (j==anchuraCadena-i){
                    for (int k = 0; k < i; k++) {
                        System.out.print(palabra.charAt(k));
                    }
                }else if (j==anchuraCadena-1){
                    for (int k = anchuraCadenaInversa-i+1; k < anchuraCadenaInversa; k++) {
                        System.out.print(palabraInversa.charAt(k));
                    }
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }*/
    public static void main(String[] args) {
        String palabra = "PEPITO";
        String palabraInversa = "";
        int anchuraCadena = palabra.length();
        for (int i = anchuraCadena - 2; i >= 0; i--) {
            palabraInversa = palabraInversa.concat(String.valueOf(palabra.charAt(i)));
        }
        int anchuraCadenaInversa = palabraInversa.length();


        for (int i = 0; i < anchuraCadena * 2; i++) {
            for (int blancos = 0; blancos < anchuraCadena - i; blancos++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                if (j<anchuraCadena*2){
                    for (int k = 0; k <= j; k++) {
                        System.out.print(palabra.charAt(k));
                    }
                }
                 /*else if (j == (i * 2)){
                    System.out.print(caracter);
                }else if (i==anchuraCadena-1){
                    System.out.print(caracter);
                }*/ else {
                    System.out.print(" ");
                }
                System.out.println();
            }

        }
    }
}
