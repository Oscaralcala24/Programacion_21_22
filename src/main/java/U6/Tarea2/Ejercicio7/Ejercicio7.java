package U6.Tarea2.Ejercicio7;

import java.io.*;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce texto a guardar: ");
        String frase = sc.nextLine();
        try {
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio7\\datos.dat"));
            fichero.writeObject(frase);
            fichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream fichero1 = new ObjectInputStream(new FileInputStream("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio7\\datos.dat"));
            String textoLeer = (String) fichero1.readObject();
            System.out.println(textoLeer);
            fichero1.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
