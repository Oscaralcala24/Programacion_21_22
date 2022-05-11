package U9.Docker.Tarea3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Insertar cliente");
            System.out.println("2. Asignar empleado a cliente");
            System.out.println("3. Añadir producto a pedido");
            System.out.println("4. Mostrar con detalle un pedido");
            respuesta = sc.nextInt();
            switch (respuesta){
                case 1 :
                    GestionarDatosCliente.insertarCliente();
                case 2 :
                    System.out.println("Dime numero del empleado: ");
                    int numEmple = sc.nextInt();
                    System.out.println("Dime numero del cliente: ");
                    int numClien = sc.nextInt();
                    GestionarRelacionEmpleClien.asignarEmpleadoCLiente(numEmple,numClien);
                case 3 :
                    anadirProductoPedido();
                case 4 :
                    mostrarDetallePedido();

            }
        }while(respuesta!=5);
    }





    private static void anadirProductoPedido() {
    }

    private static void mostrarDetallePedido() {
    }

}
