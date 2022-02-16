package U5.Tarea2.Ejercicio2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("2956314A","Pedro",25,2500);
        Cliente c2 = new Cliente("2956314C","Andres",22,2520);
        Cliente c3 = new Cliente("2956217B","Jose",21,2000);
        Cliente c4 = new Cliente("2956314D","Chema",26,1090);
        Cliente c5 = new Cliente("2956314E","Joze luí",30,2500);
        Cliente.arrayCliente[0] = c1;
        Cliente.arrayCliente[1] = c2;
        Cliente.arrayCliente[2] = c3;
        Cliente.arrayCliente[3] = c4;
        Cliente.arrayCliente[4] = c5;

        Arrays.sort(c1.getArrayCliente(),new CompararNombre());
        System.out.println(Cliente.getArrayCliente());
        Arrays.sort(c1.getArrayCliente(), new CompararEdad());
        System.out.println(Cliente.getArrayCliente());
        Arrays.sort(c1.getArrayCliente(),new CompararDNI());
        System.out.println(Cliente.getArrayCliente());

        System.out.println(c1);
    }

}
