package U7.Repaso_1920_Tarde;

import java.io.*;
import java.util.*;

public class Coronavirus implements Serializable{

    private static List<Paciente> listaInfectados = new ArrayList<>();
    private static final String nombreCientifico = "COVID-19";
    private static final String localidadVirus = "Wuhan";
    private static int contador = 1;
    private static int numeroCepa;
    private static Map<Integer,List<Paciente>> mapaPacientes = new HashMap<>();

    public Coronavirus() {
        this.numeroCepa = contador++;
    }

    public static void addPaciente(int cepa, Paciente paciente) {
        if (paciente.getNumeroCepa() == cepa) {
            if (!mapaPacientes.containsKey(cepa)) {
                List<Paciente> listaAux = new ArrayList<>();
                listaAux.add(paciente);
                mapaPacientes.put(cepa, listaAux);
            } else {
                mapaPacientes.get(cepa).add(paciente);
            }
        } else {
            System.out.println("Cepa incorrecta");
        }
    }

    public static void darDeAltaPaciente(Paciente paciente){
        Iterator<Integer> it0 = mapaPacientes.keySet().iterator();
        while (it0.hasNext()){
            Integer cepaAux = it0.next();
            List<Paciente> listaPacienteAux = mapaPacientes.get(cepaAux);
            Iterator<Paciente> it1 = listaPacienteAux.iterator();
            while (it1.hasNext()){
                Paciente pacienteAux = it1.next();
                if (pacienteAux.equals(paciente)){
                        it1.remove();
                }
            }
        }
    }

    public static void pacientesDeUnDoctor(int numeroColegiado){
        boolean tienePaciente = false;
        Iterator<Integer> it0 = mapaPacientes.keySet().iterator();
        while (it0.hasNext()){
            Integer cepaAux = it0.next();
            List<Paciente> listaPacienteAux = mapaPacientes.get(cepaAux);
            Iterator<Paciente> it1 = listaPacienteAux.iterator();
            while (it1.hasNext()){
                Paciente pacienteAux = it1.next();
                if (pacienteAux.getMedicoAsociado().getNumeroColegiado() == numeroColegiado){
                    tienePaciente = true;
                    System.out.println(pacienteAux);
                }
            }
        }
        if (!tienePaciente){
            System.out.println("Este médico/a no lleva ningún paciente");
        }
    }

    public static void pacientesporPeso(int cepa){
        List<Paciente> listaPacienteAux = mapaPacientes.get(cepa);
        Collections.sort(listaPacienteAux,new OrdenarPacientePeso());
        Iterator<Paciente> it0 = listaPacienteAux.iterator();
        while (it0.hasNext()){
            Paciente pacienteAux = it0.next();
            System.out.println(pacienteAux);
        }
    }
    public static void pacientesporEdad(int cepa){
        List<Paciente> listaPacienteAux = mapaPacientes.get(cepa);
        Collections.sort(listaPacienteAux,new OrdenarPacienteEdad());
        Iterator<Paciente> it0 = listaPacienteAux.iterator();
        while (it0.hasNext()){
            Paciente pacienteAux = it0.next();
            System.out.println(pacienteAux);
        }
    }

    public static void guardarPacientes(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/U7/Repaso_1920_Tarde/pacientes.dat"))){
            Iterator<Integer> it0 = mapaPacientes.keySet().iterator();
            while (it0.hasNext()){
                Integer cepaAux = it0.next();
                listaInfectados.addAll(mapaPacientes.get(cepaAux));
            }
            out.writeObject(listaInfectados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cargarPacientes(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/U7/Repaso_1920_Tarde/pacientes.dat"))) {
            mapaPacientes.clear();
            mostrarMapa();
            List<Paciente> listaPacientesAux = (List<Paciente>) in.readObject();
            Iterator<Paciente> it0= listaPacientesAux.iterator();
            while (it0.hasNext()){
                Paciente pacienteAux = it0.next();
                addPaciente(pacienteAux.getNumeroCepa(), pacienteAux);
            }
            System.out.println();
            mostrarMapa();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarMapa(){
        Iterator<Integer> it0 = mapaPacientes.keySet().iterator();
        while (it0.hasNext()){
            Integer cepaAux = it0.next();
            System.out.println(mapaPacientes.get(cepaAux));
        }
    }
}
