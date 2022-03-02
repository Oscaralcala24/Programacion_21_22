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
        double [] array = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce numero: ");
            array[i] = sc.nextDouble();
        }
        try {
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio4\\datos.dat"));
            fichero.writeObject(array);
            fichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
