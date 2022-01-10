package U3.examen_U3;

//Desarrolla dos funciones para trabajar con cadenas. La primera tendrá la siguiente cabecera:
//
//public static String[] invertir(String cadena)
//Recibe una cadena (String), y devuelve esa cadena invertida y en mayúsculas pero colocada en un array
// (una letra por posición)

import java.util.Arrays;

public class Ej3 {
    public static void main(String[] args) {

        String cadena = "hola";
        String cadenaAux = cadena;
        StringBuilder cadenaBuilder = new StringBuilder(cadena.toUpperCase());
        cadenaBuilder.reverse();
        cadena = String.valueOf(cadenaBuilder);
        System.out.println(Arrays.toString(invertir(cadena)));
        System.out.println(Arrays.toString(desplazarVocales(cadenaAux)));
    }

    private static String[] desplazarVocales(String cadena) {
        String[] arrayAux = new String[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            arrayAux[i] = cambiar(i, cadena);
        }
        return arrayAux;
    }

    private static String cambiar(int i, String cadena) {
        String vocal = "";
        if (cadena.charAt(i) == 'a'){
            vocal = "e";
        }else if (cadena.charAt(i) == 'e'){
            vocal = "i";
        }else if (cadena.charAt(i) == 'i'){
            vocal = "o";
        }else if (cadena.charAt(i) == 'o'){
            vocal = "u";
        }else if (cadena.charAt(i) == 'u'){
            vocal = "a";
        }else {
            vocal = String.valueOf(cadena.charAt(i));
        }
        return vocal;
    }

    private static String[] invertir(String cadena) {
        String[] arrayAux = new String[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            arrayAux[i] = String.valueOf(cadena.charAt(i));
        }
        return arrayAux;
    }
}
