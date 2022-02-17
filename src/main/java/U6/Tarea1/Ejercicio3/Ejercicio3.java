package U6.Tarea1.Ejercicio3;

//Crear un programa que duplique el conenido de un fichero. Realizar dos versiones:
//
//Duplicaremos el fichero original.txt en uno que se llame copia.txt
//Pedir el nombre del fichero fuente y duplicarlo en un fichero con el
// mismo nombre con el prefijo "copia_de".

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre del fichero: ");
        String nombreFichero = sc.nextLine();
        String ficheroDuplicado = "copia_de_"+nombreFichero;
        try {
            BufferedReader out = new BufferedReader(new FileReader("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio3\\"+nombreFichero)) ;
            FileWriter in = new FileWriter("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio3\\"+ficheroDuplicado);
            String line = out.readLine();
            while (line != null){
                in.write(line);
                line = out.readLine();
            }
            out.close();
            in.close();
        }catch (IOException exception){
            System.out.println("Error");
        }
    }
}
