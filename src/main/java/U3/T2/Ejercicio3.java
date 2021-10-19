package U3.T2;

//Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es o no un espacio.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine();
        int anchuraFrase = frase.length();
        String caracterCentral = String.valueOf(frase.charAt(anchuraFrase/2));

        if (caracterCentral.equalsIgnoreCase(" ")){
            System.out.println("Es un espacio");
        }else{
            System.out.println("No es un espacio");
        }
    }
}
