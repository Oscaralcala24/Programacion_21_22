package U7.Tarea3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Traductor {
    private HashMap<String,String> diccionario = new HashMap<>();

    public Traductor(String ruta) {
        anadirPalabras(ruta);
    }

    private void anadirPalabras(String ruta) {
        try {
            BufferedReader leerDiccionario = new BufferedReader(new FileReader(ruta));
            String linea = leerDiccionario.readLine();
            while (linea!= null){
                int coma = linea.indexOf(",");
                String palabraEspanol = linea.substring(0,coma);
                String palabraIngles = linea.substring(coma+2,linea.length());
                diccionario.put(palabraEspanol,palabraIngles);
                linea = leerDiccionario.readLine();
            }
            leerDiccionario.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void traducirPalabra(String clave){
        System.out.println(diccionario.get(clave));
    }

    @Override
    public String toString() {
        return "Traductor{" +
                "diccionario=" + diccionario +
                '}';
    }
}
