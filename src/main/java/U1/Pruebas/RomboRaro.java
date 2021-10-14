package U1.Pruebas;

import java.util.Scanner;

public class RomboRaro {
    public static void main(String[] args) {
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
                        j+=k;
                    }
                }else if (j==anchuraCadena){
                    for (int k = anchuraCadenaInversa; k > 0; k--) {
                        for (int l = k; l < anchuraCadena; l++) {
                            System.out.print(palabraInversa.charAt(l));
                        }
                    }
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

}
