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
                    GestionarDatosCliente.insertarCliente();break;
                case 2 :
                    System.out.println("Dime numero del empleado: ");
                    int numEmple = sc.nextInt();
                    sc.nextLine();;
                    System.out.println("Dime numero del cliente: ");
                    int numClien = sc.nextInt();
                    GestionarRelacionEmpleClien.asignarEmpleadoCLiente(numEmple,numClien);break;
                case 3 :
                    System.out.println("Dime numero del producto: ");
                    String numProducto = sc.next();
                    System.out.println("Dime numero del pedido: ");
                    int numPedido = sc.nextInt();
                    sc.nextLine();;
                    System.out.println("Dime cantidad del producto: ");
                    int cantidadProducto =sc.nextInt();
                    sc.nextLine();;
                    GestionarProducto.anadirProductoPedido(numProducto,numPedido,cantidadProducto);break;
                case 4 :
                    System.out.println("Dime numero del pedido: ");
                    int numPedido1 = sc.nextInt();
                    sc.nextLine();;
                    DetallePedido.mostrarDetallePedido(numPedido1);break;

            }
        }while(respuesta!=5);
    }









}
