package U8.Tarea1Json;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista(1,"Casillas", new String[]{"Portero"},"Real Madrid");
        Futbolista f2 = new Futbolista(15,"Ramos",new String[]{"Lateral Derecho", "Mediocentro"},"Real Madrid");
        Futbolista f3 = new Futbolista(3,"Pique",new String[]{"Central"},"FC Barcelona");
        Futbolista f4 = new Futbolista(5,"Puyol",new String[]{"Central"},"FC Barcelona");
        Futbolista f5 = new Futbolista(11,"Capdevila",new String[]{"Lateral Izquierdo"},"Villareal");
        Futbolista f6 = new Futbolista(14,"Xavi alonso",new String[]{"Mediocentro","Mediocentro Defensivo"},"Real Madrid");
        Futbolista f7 = new Futbolista(14,"Xavi alonso",new String[]{"Mediocentro Defensivo"},"Real Madrid");
        Futbolista f8 = new Futbolista(16, "Busquets", new String[]{"Defensa mediocampo"}, "FC Barcelona");
        Futbolista f9 = new Futbolista(8, "Xavi Hernandez", new String[]{"Mediocampo"}, "FC Barcelona");
        Futbolista f10 = new Futbolista(18, "Pedrito", new String[]{"Extremo izquierdo", "Falso extremo"}, "FC Barcelona");
        Futbolista f11 = new Futbolista(6,"Iniesta", new String[]{"Extremo derecho", "Mediocampo"}, "FC Barcelona");
        Futbolista f12 = new Futbolista(7, "Villa", new String[]{"Delantero centro"}, "FC Barcelona");

        ArrayList<Futbolista> listaFutbolistas = new ArrayList<>();
        listaFutbolistas.add(f1);
        listaFutbolistas.add(f2);
        listaFutbolistas.add(f3);
        listaFutbolistas.add(f4);
        listaFutbolistas.add(f5);
        listaFutbolistas.add(f6);
        listaFutbolistas.add(f7);
        listaFutbolistas.add(f8);
        listaFutbolistas.add(f9);
        listaFutbolistas.add(f10);
        listaFutbolistas.add(f11);
        listaFutbolistas.add(f2);

        Gson gson = new Gson();

        String jsonString = gson.toJson(listaFutbolistas);
        System.out.println(jsonString);
        System.out.println();
        Futbolista[] nuevoFutbolista = gson.fromJson(jsonString, Futbolista[].class);
        System.out.println(Arrays.toString(nuevoFutbolista));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        ArrayList<String> posicionesRamos = new ArrayList<>();
        for (int i = 0; i < nuevoFutbolista.length; i++) {
            if (nuevoFutbolista[i].getNombre().equalsIgnoreCase("Ramos") ){
                posicionesRamos.addAll(Arrays.asList(nuevoFutbolista[i].getPosicionesPosibles()));
                break;
            }
        }
        System.out.println(posicionesRamos);

    }
}
