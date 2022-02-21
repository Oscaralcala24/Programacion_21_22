package U6.Tarea1.Ejercicio6;

//Un libro de firmas es útil para recoger todas las personas que han pasado por un determinado lugar.
// Crear una aplicación que permita mostrar el libro de firmas o insertar un nuevo nombre
// (comprobando que no se encuentre repetido). Llamaremos al fichero firmas.txt.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que quieres hacer?");
        System.out.println("1.Mostrar lista de firmas.");
        System.out.println("2.Insertar nueva firma.");
        int decision = sc.nextInt();
        switch (decision){
            case 1:
                mostrarLista();break;
            case 2:
                System.out.println("Introduce un nombre: ");
                String nombre = sc.nextLine();
                insertarNombre(nombre);break;
        }
    }

    private static void insertarNombre(String nombre) {

        try {
            BufferedWriter in = new BufferedWriter(new FileWriter("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio6\\filas.txt"))
            in.newLine();
            in.write(nombre);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void mostrarLista() {
        try {
            Fi
        }
    }
}
