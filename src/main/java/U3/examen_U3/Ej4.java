package U3.examen_U3;

//Crea una función con la siguiente cabecera:
//
//public String convierteEnPalabras(int n)
//Esta función convierte los dígitos del número n en las correspondientes palabras y
// lo devuelve en una cadena de caracteres

//
//cuatro, siete, cero, dos, uno, tres
//Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se
// debe mostrar nada por pantalla, solo se debe usar print desde el programa principal.
// Fíjate que hay una coma detrás de cada palabra salvo al final.

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        System.out.println("El numero en palabras es: "+convierteEnPalabras(n));
    }

    private static String convierteEnPalabras(int n) {
        String numeroPalabra = "";
        String numeroString = String.valueOf(n);
        for (int i = 0; i < numeroString.length(); i++) {
            switch (numeroString.charAt(i)){
                case '0': numeroPalabra += "cero";break;
                case '1': numeroPalabra += "uno";break;
                case '2': numeroPalabra += "dos";break;
                case '3': numeroPalabra += "tres";break;
                case '4': numeroPalabra += "cuatro";break;
                case '5': numeroPalabra += "cinco";break;
                case '6': numeroPalabra += "seis";break;
                case '7': numeroPalabra += "siete";break;
                case '8': numeroPalabra += "ocho";break;
                case '9': numeroPalabra += "nueve";break;
            }
            numeroPalabra += ", ";
        }
         return numeroPalabra =numeroPalabra.substring(0,numeroPalabra.length()-2);
    }
}
