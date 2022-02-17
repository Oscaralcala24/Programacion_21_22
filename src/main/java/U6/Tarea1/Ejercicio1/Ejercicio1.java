package U6.Tarea1.Ejercicio1;

//Actividad1: Realizar un programa que solicite al usuario el nombre de un fichero de
// texto y muestre su contenido en pantalla.
// Si no se proporciona ningún nombre de fichero, la aplicación utilizará por defecto "prueba.txt".

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre del fichero de texto: ");
        String nombreFichero = sc.nextLine();
        if (nombreFichero.equalsIgnoreCase("")){
            nombreFichero = "prueba.txt";
        }
        try {
            FileReader file = new FileReader("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio1\\"+nombreFichero);
            String texto = "";
            int c = file.read();
            while (c != -1){
                texto = texto + (char) c;
                c = file.read();
            }
            System.out.println(texto);
            file.close();
        }catch (IOException ex){
            System.out.println("Prueba, no funciona.");
        }
    }

}
