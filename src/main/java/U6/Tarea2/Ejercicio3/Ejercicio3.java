package U6.Tarea2.Ejercicio3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido = 0;
        do {
            System.out.println("Introduce un numero entero: ");
            numeroIntroducido = sc.nextInt();
            if (numeroIntroducido>0){
                try {
                    ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio3\\datos.dat",true));
                    fichero.writeInt(numeroIntroducido);
                    fichero.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }while (numeroIntroducido > 0);


        try {
            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio3\\datos.dat"));
            int numero = leerFichero.readInt();
            while (numero!=-1){
                System.out.println(numero);
                numero = leerFichero.readInt();
            }
            leerFichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
