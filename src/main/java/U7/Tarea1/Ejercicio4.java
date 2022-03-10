package U7.Tarea1;

//Actividad 4: Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios.
// Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por pantalla las palabras que estén repetidas.
// A continuación, mostrar las que no lo estén.

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        ArrayList<String> palabrasLista = new ArrayList<>();
        int contadorPalabras = 0;
        String fraseAnadir = "";
        for (int i = 0; i < frase.length(); i++) {
            String recorrerFrase = String.valueOf(frase.charAt(i));
            if(!recorrerFrase.equalsIgnoreCase(" ")){
                fraseAnadir += recorrerFrase;
                if (i ==  frase.length()-1){
                    palabrasLista.add(contadorPalabras, fraseAnadir);
                }
            }else {
                palabrasLista.add(contadorPalabras, fraseAnadir);
                contadorPalabras++;Set<Integer> set = new HashSet<Integer>();
                fraseAnadir = "";
            }
        }
        mostrarRepetidas(palabrasLista);
        mostrarNoRepetidas(palabrasLista);
    }

    private static void mostrarNoRepetidas(ArrayList<String> palabrasLista) {
        Iterator<String> it = palabrasLista.iterator();
        Set<String> set = new HashSet<>();
        while (it.hasNext()){
            int contador = 0;
            String palabra = it.next();
            for (int i = 0; i < palabrasLista.size(); i++) {
                if (palabra.equalsIgnoreCase(palabrasLista.get(i))){
                    contador++;
                    if (contador >= 2){
                        set.add(palabrasLista.get(i));
                    }
                }
            }
        }
        for (String s: set) {
            System.out.println(s);
        }
    }

    private static void mostrarRepetidas(ArrayList<String> palabrasLista) {
        Iterator<String> it = palabrasLista.iterator();
        Set<String> set = new HashSet<>();
        while (it.hasNext()){
            int contador = 0;
            String palabra = it.next();
            for (int i = 0; i < palabrasLista.size(); i++) {
                if (palabra.equalsIgnoreCase(palabrasLista.get(i))){
                    contador++;
                    if (contador >= 2){
                        set.add(palabrasLista.get(i));
                    }
                }
            }
        }
        for (String s: set) {
            System.out.println(s);
        }
    }
}
