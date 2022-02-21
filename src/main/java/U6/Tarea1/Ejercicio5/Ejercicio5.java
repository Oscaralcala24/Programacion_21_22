package U6.Tarea1.Ejercicio5;

//En el archivo numeros.txt disponemos de una serie de números (uno por cada línea).
// Diseñar un programa que procese el fichero y nos muestre el menor y el mayor.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            BufferedReader out = new BufferedReader(new FileReader("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio5\\numeros.txt"));
            String c = out.readLine();
            int numeroMayor =Integer.parseInt(c);
            int numeroMenor = Integer.parseInt(c);
            c = out.readLine();
            while (c != null){
                int numeroAUX = Integer.parseInt(c);
                if (numeroMayor < numeroAUX){
                    numeroMayor = numeroAUX;
                }
                if (numeroMenor > numeroAUX){
                    numeroMenor = numeroAUX;
                }
                c = out.readLine();
            }
            System.out.println("El numero mas grande es: "+ numeroMayor);
            System.out.println("El numero mas pequeño es: "+ numeroMenor);
            out.close();
        }catch (IOException ex){
            System.out.println("Error");
        }
    }
}
