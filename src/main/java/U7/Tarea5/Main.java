package U7.Tarea5;

import java.util.Scanner;

public class Main {
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
                    boolean introducirMas = false;
                    do {
                        System.out.println("Introduce nombre: ");
                        String nombre = sc.nextLine();
                        System.out.println("Introduce dni: ");
                        String dni = sc.nextLine();
                        System.out.println("Introduce telefono: ");
                        String telefono = sc.nextLine();
                        IntroducirAspirantes i1 = new IntroducirAspirantes(nombre,dni,telefono);
                        System.out.println("Desea introducir mas? s/n");
                        String respuestaMas = sc.next();
                        if (respuestaMas.equalsIgnoreCase("s")){
                            introducirMas = true;
                        }
                    }while (introducirMas); break;
                case 2 :
                    break;
                case 3 : break;
            }
        }while (respuesta!=4);

    }
}
