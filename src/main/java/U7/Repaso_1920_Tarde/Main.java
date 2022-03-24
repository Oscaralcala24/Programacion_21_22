package U7.Repaso_1920_Tarde;

public class Main {
    public static void main(String[] args) {
        Coronavirus covid1 = new Coronavirus();
        Coronavirus covid2 = new Coronavirus();
        Coronavirus covid3 = new Coronavirus();
        Medico m1 = new Medico("Pedro", "Mir", "Virgen del Rocio");
        Medico m2 = new Medico("Jesus", "Navas", "Virgen del Rocio");
        Medico m3 = new Medico("Lionel", "Messi", "Macarena");


        Paciente p1 = new Paciente("Oscar",24,73,true,m2,1);
        Paciente p2 = new Paciente("Luis",49,87,false,m1,2);
        Paciente p3 = new Paciente("Ismael",29,65,true,m1,1);
        Paciente p4 = new Paciente("Eva",55,55,true,m3,2);
        Paciente p5 = new Paciente("Jorge",15,45,false,m1,1);
        Paciente p6 = new Paciente("Antonio",25,80,false,m1,3);
        Paciente p7 = new Paciente("Joaquin",60,86,false,m3,1);
        Paciente p8 = new Paciente("Amparo",56,57,false,m3,3);
        Paciente p9 = new Paciente("Miguel",76,87,true,m2,1);
        Paciente p10 = new Paciente("Juanlu",20,67,false,m1,2);

        Coronavirus.addPaciente(2, p1);

        Coronavirus.addPaciente(1, p1);
        Coronavirus.addPaciente(2, p2);
        Coronavirus.addPaciente(1, p3);
        Coronavirus.addPaciente(2, p4);
        Coronavirus.addPaciente(1, p5);
        Coronavirus.addPaciente(3, p6);
        Coronavirus.addPaciente(1, p7);
        Coronavirus.addPaciente(3, p8);
        Coronavirus.addPaciente(1, p9);
        Coronavirus.addPaciente(2, p10);

        Coronavirus.mostrarMapa();
        System.out.println();

        Coronavirus.darDeAltaPaciente(p2);
        Coronavirus.mostrarMapa();
        System.out.println();
        Coronavirus.pacientesDeUnDoctor(1);
        System.out.println();
        Coronavirus.pacientesDeUnDoctor(2);
        System.out.println();

        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Coronavirus.guardarPacientes();
        Coronavirus.cargarPacientes();
        System.out.println();
        System.out.println();
        System.out.println();
        Coronavirus.pacientesporEdad(1);
        Coronavirus.pacientesporPeso(1);

    }
}
