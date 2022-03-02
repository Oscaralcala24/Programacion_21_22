package U6.Tarea2.Ejercicio6;

import java.io.*;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeroIntroducido = 0;
        try {
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio6\\datos.dat",false));
            do {
                System.out.println("Introduce un numero entero: ");
                numeroIntroducido = sc.nextDouble();
                if (numeroIntroducido>0) {
                    fichero.writeDouble(numeroIntroducido);
                }
            }
            while (numeroIntroducido > 0);
            fichero.close();
        }catch (IOException e) {
            e.printStackTrace();
        }



        try {
            ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio6\\datos.dat"));
            double numero = leerFichero.readDouble();
            while (numero!=-1){
                System.out.println(numero);
                numero = leerFichero.readDouble();
            }
            leerFichero.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
