package U3.T4;

//Un restaurante nos ha encargado una aplicación para colocar a los clientes ensus mesas.
// En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales(mesa llena).
//Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado para
// colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6,

//Si no quedan mesas libres, se busca donde haya un hueco para tod el grupo, por ejemplo
// si el grupo es dedos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
// las mesas se cargan con valores aleatorios entre 0 y 4.
//
//Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
// Los grupos no se pueden romper aunque haya huecos sueltos suficientes.


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorMesas = 0;
        int contadorOcupacion = 0;
        int numeroIntroducido = 0;
        int [][] arrayMesas = new int[2][10];
        while (numeroIntroducido !=-1){
            System.out.println("¿Cuantos son? Introduzca -1 para salir del programa: ");
            numeroIntroducido = sc.nextInt();
            while (numeroIntroducido>4){
                System.out.println("Lo siento, no admitimos grupos de "+numeroIntroducido+", haga grupos de 4 personas como máximo e intente de nuevo");
                System.out.println("¿Cuantos son? Introduzca -1 para salir del programa: ");
                numeroIntroducido = sc.nextInt();
            }
            if (numeroIntroducido!=-1){
                break;
            }
            arrayMesas[contadorMesas][contadorOcupacion] = arrayMesas[contadorMesas][numeroIntroducido];
            contadorMesas++;
            contadorOcupacion++;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < arrayMesas.length; j++) {
                    System.out.print(" | " + arrayMesas[i][j]+ " | ");
                }
                System.out.println("\n------------------------------------");
            }
        }
    }
}
