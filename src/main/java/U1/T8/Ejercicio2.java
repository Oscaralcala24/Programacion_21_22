package U1.T8;

// Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos.
// Se introducirán las edades de los elumnos hasta que una de ellas sea negativa.
// La aplicación mostrará la suma de las edades, la media, de cuántos alumnos hemos introducido su edad,
// y cuántos alumnos son mayores de edad.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una edad: ");
        int edad = teclado.nextInt();
        int sumaEdad = 0;
        int contadorAlumnos=1;
        int contadorMayores=0;

        while (edad>=0){
            sumaEdad = edad+sumaEdad;
            int media = sumaEdad/contadorAlumnos;
            if (edad>=18){
                contadorMayores++;
            }
            System.out.println("La suma de las edades es: "+sumaEdad);
            System.out.println("La media es: "+media);
            System.out.println("Mayores de edad son: "+contadorMayores+" alumnos");
            System.out.println("Introduce otra edad: ");
            edad = teclado.nextInt();
            contadorAlumnos++;
        }
    }

}
