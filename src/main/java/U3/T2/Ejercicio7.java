package U3.T2;

//En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor",
// según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador 1- Introduce una contraseña: ");
        String contrasena = sc.nextLine();
        int anchuraContrasena = contrasena.length();
        char primeraLetra = contrasena.charAt(0);
        char ultimaLetra = contrasena.charAt(anchuraContrasena-1);
        boolean menor = false;
        System.out.println("Pistas:\n\nLongitud de contraseña: "+anchuraContrasena+"\nPrimera letra: "+primeraLetra+"\nUltima letra: "+ultimaLetra+"\n");

        System.out.print("Jugador 2- Adivina contraseña: ");
        String intentoAdivinar = sc.nextLine();
        if (contrasena.equals(intentoAdivinar)){
            System.out.println("Acertaste");
        }else{
            for (int i = 0; i < anchuraContrasena; i++) {
                int asciiContrasena = contrasena.charAt(i);
                int asciiIntento = intentoAdivinar.charAt(i);
                if (contrasena.equals(intentoAdivinar)){
                    break;
                }else if (asciiContrasena<asciiIntento){
                    menor = true;
                }
            }
            if (menor){
                System.out.println("Menor");
            }else {
                System.out.println("Mayor");
            }
        }
    }
}
