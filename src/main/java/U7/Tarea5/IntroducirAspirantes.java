package U7.Tarea5;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class IntroducirAspirantes extends Aspirante implements Serializable {
    private static int contador = 1;
    private int numeroId;
    private static Map<Integer,IntroducirAspirantes> aspirantesMap = new LinkedHashMap<>();
    private static ArrayList<Integer> listaParticipantes =  new ArrayList<>();


    public IntroducirAspirantes(String nombre, String dni, String telefono) {
        super(nombre, dni, telefono);
        this.numeroId = contador;
        contador++;
    }

    static void InsertaAspirante(){
        Scanner sc = new Scanner(System.in);
        boolean introducirMas = false;
        do {
            System.out.println("Introduce nombre: ");
            String nombre = sc.next();
            System.out.println("Introduce dni: ");
            String dni = sc.next();
            System.out.println("Introduce telefono: ");
            String telefono = sc.next();
            IntroducirAspirantes i1 = new IntroducirAspirantes(nombre,dni,telefono);
            aspirantesMap.put(i1.getNumeroId(), i1);
            listaParticipantes.add(i1.getNumeroId());
            System.out.println("Desea introducir mas? s/n");
            String respuestaMas = sc.next();
            if (respuestaMas.equalsIgnoreCase("s")){
                introducirMas = true;
            }else {
                introducirMas = false;
            }
        }while (introducirMas);
    }

    static void guardarFicheros(){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/U7/Tarea5/aspirantes.dat",true));
            ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream("src/main/java/U7/Tarea5/ids_aspirantes.dat",true));
            out.writeObject(aspirantesMap);
            out1.writeObject(listaParticipantes);
            out.close();
            out1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getNumeroId() {
        return numeroId;
    }
}
