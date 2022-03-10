package U7.Tarea1;
import java.util.*;

//Actividad 7: Introducir por teclado, hasta que se introduzca "fin",
// una serie de nombres que se insertarán por orden alfabético en una colección que no permita repeticiones.
// Mostrar luego la lista de nombres por pantalla.


public class Ejercicio7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> listaNombres = new TreeSet<>(new OrdenarAlfabetico7());
        String nombre = "";
        int contador = 0;
        while (!nombre.equalsIgnoreCase("fin")){
            System.out.println("Introduce un nombre: ");
            nombre = sc.next();
            if (!nombre.equalsIgnoreCase("fin")){
                listaNombres.add(nombre);
            }
        }
        Collection<String> coleccionLista = new ArrayList<>(listaNombres);
        ArrayList<String> listaArray = new ArrayList<>(coleccionLista);
        listaArray.remove(listaNombres.size()-1);
        mostrarLista(listaNombres);
    }


    private static void mostrarLista(Set<String> listaNombres) {
        for (String i: listaNombres) {
            System.out.println(i + " ");
        }
    }
}
