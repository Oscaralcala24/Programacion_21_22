package U3.T2;

// Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal del nombre.
// Por ejemplo: Alvaro Perez se mostrará como "lvr Prz". Sólo se eliminarán las vocales (mayúsculas, minúsculas y acentuadas).
// El resto de caracteres no se modifican.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce nombre y apellidos: ");
        String nombreApellidos = sc.nextLine();
        String vocales = "AEIOUaeiouáéíóú";
        String sinVocales = "";


        for (int i = 0; i < nombreApellidos.length(); i++) {
            boolean coincide = false;
            for (int j = 0; j < vocales.length(); j++) {
                 if (nombreApellidos.charAt(i) == vocales.charAt(j)){
                     coincide= true;
                 }

            }
           if (!coincide){
               sinVocales=sinVocales+nombreApellidos.charAt(i);
           }
        }
        System.out.println(sinVocales);
    }
}
