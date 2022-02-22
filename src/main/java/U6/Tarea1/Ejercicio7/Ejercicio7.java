package U6.Tarea1.Ejercicio7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numeroFilas  = 24;
        int contadoFilas;
        try {
            BufferedReader out = new BufferedReader(new FileReader("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio7\\24Lineas.txt"));
            String c = "";
            String respuesta = "";
            boolean repetir = false;
            do {
                for (int i = 0; i < numeroFilas; i++) {
                    c = out.readLine();
                    if (c != null){
                        System.out.println(c);
                    }
                }
                System.out.println("¿Quieres ver mas filas? s/n: ");
                respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("s")){
                    repetir = true;
                }else {
                    repetir = false;
                }
            }while (repetir);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
