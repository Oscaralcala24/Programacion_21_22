package U3.U3_Entregable;

import java.util.Scanner;

//Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas (la cadena a adivinar y el resultado parcial) y un carácter a buscar en la cadena a adivinar. Debe devolver el resultado de encontrar ese character en la cadena a adivinar.
//
//La función tendrá el siguiente prototipo:
//
//public static String palabraAhorcado(String a, String b, char c)
//En el programa principal, se debe pedir al usuario que introduzca una palabra a adivinar y un carácter a buscar en la cadena. Se pedirá caracteres hasta que se consiga adivinar la palabra completa.
//
//NOTA: La palabra a adivinar no contendrá tildes ni caracteres extraños, además será en minúsculas para simplificar el ejercicio.


public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraAdivinar = "programacion";
        String palabraGuiones = guiones(palabraAdivinar);
        while (palabraAdivinar != palabraGuiones){
            System.out.println("Palabra a adivinar: "+palabraAdivinar);
            System.out.println("Palabra resolviendo: "+palabraGuiones);
            System.out.println("Introduce letra: ");
            char letraIntroducida = sc.next().charAt(0);
            palabraGuiones = palabraAhorcado(palabraAdivinar, palabraGuiones, letraIntroducida);
        }

    }

    private static String palabraAhorcado(String a, String b, char c) {
        StringBuilder palabra = new StringBuilder(b);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c){
                palabra.setCharAt(i,c);
            }
        }
        return String.valueOf(palabra);
    }

    private static String guiones(String palabraGuiones) {
        String guiones = "";
        for (int i = 0; i < palabraGuiones.length(); i++) {
            guiones = guiones +"-";
        }
        return guiones;
    }
}
