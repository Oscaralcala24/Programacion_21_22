package UnidadExtra;

//A partir de una cadena con palabras separadas por espacios introducida por teclado, construye una tabla con las palabras.
// A partir de ella, crea un Stream con las palabras ordenadas por orden alfabético y muéstralas por pantalla.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce frase: ");
        String frase = sc.nextLine();
        List<String> listaPalabras = separarFrase(frase);

        listaPalabras.stream().sorted(String::compareTo).forEach(System.out::println);
    }

    private static List<String> separarFrase(String frase) {
        List<String> listaDevolver = new ArrayList<>();
        String fraseGuardar = "";
        for (int i = 0; i < frase.length(); i++) {
            String letraFrase = String.valueOf(frase.charAt(i));
            if (letraFrase.equals(" ")){
                listaDevolver.add(fraseGuardar);
                fraseGuardar = "";
            }else {
                fraseGuardar+=letraFrase;
            }
        }
        listaDevolver.add(fraseGuardar);
        return listaDevolver;
    }
}
