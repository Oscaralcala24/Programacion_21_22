package U6.Tarea2.Ejercicio5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio4\\datos.dat"));
            double[] arrayAux = (double[]) leerFichero.readObject();
            for (int i = 0; i < arrayAux.length; i++) {
                System.out.println(arrayAux[i]);
            }
            leerFichero.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
