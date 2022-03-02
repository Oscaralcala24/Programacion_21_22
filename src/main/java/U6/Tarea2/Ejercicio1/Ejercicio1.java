package U6.Tarea2.Ejercicio1;

import java.io.*;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero double: ");
        double numeroIntroducido = sc.nextDouble();

        try {
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio1\\datos.dat"));
            fichero.writeDouble(numeroIntroducido);
            fichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
