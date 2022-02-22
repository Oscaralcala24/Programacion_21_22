package U6.Tarea1.Ejercicio6;

//Un libro de firmas es útil para recoger todas las personas que han pasado por un determinado lugar.
// Crear una aplicación que permita mostrar el libro de firmas o insertar un nuevo nombre
// (comprobando que no se encuentre repetido). Llamaremos al fichero firmas.txt.

import java.io.*;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que quieres hacer?");
        System.out.println("1.Mostrar lista de firmas.");
        System.out.println("2.Insertar nueva firma.");
        int decision = sc.nextInt();
        switch (decision){
            case 1:
                mostrarLista();break;
            case 2:
                System.out.println("Introduce un nombre: ");
                String nombre = sc.next();
                insertarNombre(nombre);break;
        }
    }

    private static void insertarNombre(String nombre) {
        if (!comprobarNombre(nombre)){
            try {
                BufferedWriter in = new BufferedWriter(new FileWriter("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio6\\firmas.txt",true));
                in.newLine();
                in.write(nombre);
                in.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }else{
            System.out.println("El nombre ya esta repetido");
        }

    }

    private static boolean comprobarNombre(String nombre) {
        boolean repetido = false;
        try {
            BufferedReader out = new BufferedReader(new FileReader("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio6\\firmas.txt"));
            String c = out.readLine();

            while (c != null){
                if (c.equalsIgnoreCase(nombre)){
                    repetido = true;
                }
                c = out.readLine();
            }
                out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return repetido;
    }

    private static void mostrarLista() {
        try {
            BufferedReader out = new BufferedReader(new FileReader("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio6\\firmas.txt"));
            String c = out.readLine();
            while (c != null){
                System.out.println(c);
                c = out.readLine();
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
