package U6.Tarea2.Ejercicio4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce anchura tabla: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce numero: ");
            array[i] = sc.nextInt();
        }
        try {
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio4\\datos.dat",true));
            fichero.writeObject(array);
            fichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
