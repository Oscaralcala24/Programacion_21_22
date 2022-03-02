package U6.Tarea2.Ejercicio8;

import java.io.*;
import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1+Math.random()*100);
        }
        Arrays.sort(array);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio8\\datos.dat"));
            out.writeObject(array);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio8\\datos.dat"));
            int[] arrayAux = (int[]) leerFichero.readObject();
            for (int i = 0; i < arrayAux.length; i++) {
                System.out.println(arrayAux[i]);
            }
            leerFichero.close();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
