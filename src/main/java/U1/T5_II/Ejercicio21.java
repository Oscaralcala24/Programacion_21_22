package U1.T5_II;

//Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones:
//
//
//• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto),
// los días que ha estado de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado).
//• El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog. junior, un prog.
// senior o un jefe de proyecto respectivamente.
//• Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas.
// Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en caso de estar casado.
//
//
//Ejemplo:
//1 - Programador junior
//2 - Prog. senior
//3 - Jefe de proyecto
//Introduzca el cargo del empleado (1 - 3): 2
//¿Cuántos días ha estado de viaje visitando clientes? 5
//Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
//
//
//----------------------------------
//| Sueldo base 1200,00 |
//| Dietas ( 5 viajes) 150,00 |
//|--------------------------------|
//| Sueldo bruto 1350,00 |
//| Retención IRPF (20%) 270,00 |
//|--------------------------------|
//| Sueldo neto 1080,00 |
//---------------------------------

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("1 - Prog. junior \n 2 - Prog. senior \n 3 - Jefe de proyecto: ");
        int cargo = teclado.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
        int visitas = teclado.nextInt();
        System.out.print("Introduzca su estado civil \n (1 - Soltero\n 2 - Casado):");
        int  estadoCivil = teclado.nextInt();
        double sueldoBase = 0;
        double pagasExtras = visitas*30;
        double sueldoNeto = 0;
        switch (cargo){
            case 1:
                sueldoBase = 950;
                if (estadoCivil==1){
                    sueldoNeto =((sueldoBase+pagasExtras)-((sueldoBase+pagasExtras)*0.25));
                }else {
                    sueldoNeto =((sueldoBase+pagasExtras)-((sueldoBase+pagasExtras)*0.20));
                }break;

            case 2:
                sueldoBase = 1200;
                if (estadoCivil==1){
                    sueldoNeto =((sueldoBase+pagasExtras)-((sueldoBase+pagasExtras)*0.25));
                }else {
                    sueldoNeto =((sueldoBase+pagasExtras)-((sueldoBase+pagasExtras)*0.20));
                }break;
            case 3:
                sueldoBase = 1600;
                if (estadoCivil==1){
                    sueldoNeto = ((sueldoBase+pagasExtras)-((sueldoBase+pagasExtras)*0.25));
                }else {
                    sueldoNeto =((sueldoBase+pagasExtras)-((sueldoBase+pagasExtras)*0.20));
                }break;
        }
        System.out.println("Sueldo neto: "+sueldoNeto);

    }
}
