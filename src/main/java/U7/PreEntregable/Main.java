package U7.PreEntregable;

public class Main {
    public static void main(String[] args) {
        Coordenadas c1 = new Coordenadas(20,30);
        Coordenadas c2 = new Coordenadas(43,45);
        Medicion m1 = new Medicion(30,24,1000);
        Medicion m2 = new Medicion(23,23,1020);
        Medicion m3 = new Medicion(14,45,1001);
        Medicion m4 = new Medicion(43,43,1006);
        Medicion m5 = new Medicion(35,67,1043);
        Medicion m6 = new Medicion(22,21,1021);
        Medicion m7 = new Medicion(20,4,1004);
        Medicion m8 = new Medicion(45,65,1014);
        EstacionMeteorologica e1 = new EstacionMeteorologica(c1);

        e1.addMedicion(m1);
        e1.addMedicion(m2);
        e1.addMedicion(m3);
        e1.addMedicion(m4);
        e1.addMedicion(m5);
        e1.addMedicion(m6);
        e1.addMedicion(m7);
        e1.addMedicion(m8);
        System.out.println(e1.buscaMedicion(m4));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(e1.ordenaTemperaturasAsc());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(e1.ordenaHumedadesDesc());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(e1.presionMaxima());
        e1.guardarFichero("src/main/java/U7/PreEntregable/datos.dat");

        EstacionMeteorologica e2 = new EstacionMeteorologica("src/main/java/U7/PreEntregable/datos.dat",c2);

        System.out.println(e2.ordenaHumedadesDesc());


    }
}
