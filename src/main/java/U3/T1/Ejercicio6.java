package U3.T1;

//Crear una función que, mediante un booleano,indique si el carácter
// que se pasa como parámetro de entrada corresponde con una vocal.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce caracter: ");
        String caracter = sc.next();
        String vocales = "aeiou";
        boolean vocal = false;

        if (vocalOConsonante(caracter,vocales,vocal)){
            System.out.println("Es vocal");
        } else{
            System.out.println("Es consonante");
        }
    }
    static boolean vocalOConsonante(String caracter, String vocales, boolean vocal){
        for (int i = 0; i < 5 ; i++) {
            char vocalesSueltas = vocales.charAt(i);
            if (caracter.equalsIgnoreCase(String.valueOf(vocalesSueltas))){
                vocal = true;
            }
        }
        return vocal;
    }
}
