package UnidadExtra;

//Repite la actividad anterior, pero en vez de mostrar por pantalla las
// palabras, construye una cadena con las palabras de más de tres letras.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce frase: ");
        String frase = sc.nextLine();
        List<String> listaPalabras = separarFrase(frase);
        Stream<String> cadenaMostrar = listaPalabras.stream().filter(x -> x.length()>3);
        cadenaMostrar.forEach(System.out::println);

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
