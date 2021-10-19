package U3.T2;

//Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine();
        int anchuraFrase = frase.length();
        int contadorEspacios = 0;
        for (int i = 0; i < anchuraFrase; i++) {
            String caracter = String.valueOf(frase.charAt(i));
            if (caracter.equalsIgnoreCase(" ")){
                contadorEspacios++;
            }
        }
        System.out.println("Esta frase tiene "+contadorEspacios+" espacios");
    }
}
