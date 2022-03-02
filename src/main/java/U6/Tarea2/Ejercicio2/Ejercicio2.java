package U6.Tarea2.Ejercicio2;

import java.io.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio1\\datos.dat"));
            double numero = leerFichero.readDouble();
            System.out.println(numero);
            leerFichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
