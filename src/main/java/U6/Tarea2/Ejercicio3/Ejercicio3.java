package U6.Tarea2.Ejercicio3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido = 0;
        try {
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio3\\datos.dat",false));
            do {
                System.out.println("Introduce un numero entero: ");
                numeroIntroducido = sc.nextInt();
                if (numeroIntroducido>0) {
                    fichero.writeInt(numeroIntroducido);
                }
            }
            while (numeroIntroducido > 0);
            fichero.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio3\\datos.dat"));
            int numero = leerFichero.readInt();
            while (true){
                System.out.println(numero);
                numero =leerFichero.readInt();
            }
        }catch (EOFException e){
            System.out.println("Fin de fichero");
        }catch (IOException e) {
            System.out.println("Error");
        }

    }
}
