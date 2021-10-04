package U1.T5_II;

//Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras.
// Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias
// (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
//
//
//Ejemplo 1:
//Por favor, introduzca el número de horas trabajadas durante la semana: 36
//El sueldo semanal que le corresponde es de 432 euros
//Ejemplo 2:
//Por favor, introduzca el número de horas trabajadas durante la semana: 40
//El sueldo semanal que le corresponde es de 480 euros
//Ejemplo 3:
//Por favor, introduzca el número de horas trabajadas durante la semana: 55
//El sueldo semanal que le corresponde es de 720 euros

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce horas de trabajo: ");
        int horasDeTrabajo = teclado.nextInt();
        int salarioTrabajador;
        int horasExtras;
        if (horasDeTrabajo<40){
            salarioTrabajador=horasDeTrabajo*12;
        }else{
            horasExtras=horasDeTrabajo-40;
            horasDeTrabajo=horasDeTrabajo-horasExtras;
            salarioTrabajador=(horasDeTrabajo*12)+(horasExtras*16);
        }
        System.out.println("El sueldo semanal que le corresponde es de "+salarioTrabajador+" euros");
    }
}
