package U7.Tarea3;

//Actividad 3: Recorre el Map anterior, extrayendo cada pareja clave-valor, y mostrándolas,
// de tal forma que se escriban los datos así:
//
//La clave 37 está asociada al nombre "Pedro Gonzalez Jimenez".
//
//La clave ... está asociada al nombre ....

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio3 {
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
        Iterator<Integer> it0 = mapDNI.keySet().iterator();
        while (it0.hasNext()){
            int clave = it0.next();
            System.out.println("La clave " + clave + " está asociada al nombre: "+ mapDNI.get(clave));
        }
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
