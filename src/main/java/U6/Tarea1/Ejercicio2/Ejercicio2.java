package U6.Tarea1.Ejercicio2;
//Actividad2: Diseñar una aplicación que pida al usuario su nombre y edad.
// Estos datos deben guardarse en el fichero "datos.txt".
// Si este fichero existe, debe borrarse su contenido, y en caso de no existir, debe crearse.


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce su edad: ");
        String edad = sc.nextLine();

        try {
            FileWriter in = new FileWriter("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio2\\DatosIntroducidos.txt", false);
            in.write(nombre);
            in.write("\n");
            in.write(edad);
            System.out.println(in);
            in.close();
        }catch (IOException ex){
            System.out.println("No se ha introducido correctamente");
        }
    }
}
