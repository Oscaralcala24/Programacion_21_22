package U7.Tarea3;

//Actividad 2: Añada al programa anterior la siguiente funcionalidad.
// El programa pedirá al usuario un dni, calculará la clave que ha de consultar, comprobará que dicha clave existe,
// y, en tal caso, mostrará el valor asociado a esa clave en el HashMap.

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Map<Integer, String> mapDNI = new HashMap<>();
        mapDNI.put(convertirDNI("54180755T"), "Jose");
        mapDNI.put(convertirDNI("56546675T"), "Oscar");
        mapDNI.put(convertirDNI("23456535L"), "Juanlu");
        mapDNI.put(convertirDNI("73959275M"), "Jose");
        System.out.println(mapDNI.get(convertirDNI("54180755T")));
        mapDNI.put(convertirDNI("54180755T"), "Oscar");
        System.out.println(mapDNI.get(convertirDNI("54180755T")));
        System.out.println(mapDNI.toString());
        System.out.println("Introduce una dni :");
        Scanner sc = new Scanner(System.in);
        String dniString = sc.next();
        int dniInt = convertirDNI(dniString);
        System.out.println(mapDNI.get(dniInt));
    }

    private static Integer convertirDNI(String s) {
        s = s.substring(0,s.length()-1);
        Integer numeroDNI = Integer.valueOf(s);
        Integer numeroDevolver = 0;
        while (numeroDNI>0){
            int numeroAux = numeroDNI % 10;
            numeroDevolver +=numeroAux;
            numeroDNI /= 10;
        }

            return numeroDevolver;
        }
}
