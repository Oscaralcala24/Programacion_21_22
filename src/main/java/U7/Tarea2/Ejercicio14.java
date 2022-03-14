package U7.Tarea2;

//Actividad 14: Implementar la función leeCadena con el siguiente prototipo:
//
//List<Character> leeCadena()
//Dicha función lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada nodo.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println(leeCadena());

    }

    private static List<Character> leeCadena() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un frase");
        String fraseIntroducida = sc.nextLine();
        List<Character> listaFrase = new ArrayList<>();
        for (int i = 0; i < fraseIntroducida.length(); i++) {
            Character caracterFrase = fraseIntroducida.charAt(i);
            if (!String.valueOf(caracterFrase).equals(" ")){
                listaFrase.add(caracterFrase);
            }
        }
        return listaFrase;
    }
}
