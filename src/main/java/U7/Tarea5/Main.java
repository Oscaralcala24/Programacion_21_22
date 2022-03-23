package U7.Tarea5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main implements Serializable {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int respuesta = 0;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Introducir datos de aspirantes");
            System.out.println("2. Calificar prueba");
            System.out.println("3. Aprobados");
            System.out.println("4. Salir");

            respuesta = sc.nextInt();
            switch (respuesta){
                case 1 :
                    IntroducirAspirantes.InsertaAspirante();
                    IntroducirAspirantes.guardarFicheros();break;
                case 2 :
                    CalificacionPruebas.cargarID();
                    CalificacionPruebas.calificarPrueba();
                    CalificacionPruebas.guardarFicheros();break;
                case 3 : break;
            }
        }while (respuesta!=4);

    }



}
