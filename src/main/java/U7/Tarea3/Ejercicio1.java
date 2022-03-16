package U7.Tarea3;

//Actividad 1: Crea un HashMap cuya clave sea un Integer, y cuyos valores sean los nombres de algunos de tus compañeros.
// La clave ha de calcularse mediante un método que reciba un String que represente el dni, y devuelva la suma de sus
// dígitos.
//
//46221877D -> 4+6+2+2+1+8+7+7=37
//Una vez guardados los elementos, deben mostrarse todos los elementos (clave-valor) del HasMap.

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {
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
