package U5.Tarea1.Parte1;

public class Main {
    public static void main(String[] args) {
        Hora hora1 = new Hora(20,34);
        Hora hora2 = new Hora(17,27);
        Hora hora3 = new Hora(2,24);

        Hora12 hora4 = new Hora12(1,32, "am");
        Hora12 hora5 = new Hora12(11,56, "pm");
        Hora12 hora6 = new Hora12(6,43,"pm");

        HoraExacta hora7 = new HoraExacta(2,24,34);
        HoraExacta hora8 = new HoraExacta(2,24,34);

        System.out.println(hora1);
        System.out.println(hora2);
        System.out.println(hora3);
        System.out.println(hora4);
        System.out.println(hora5);
        System.out.println(hora6);
        System.out.println(hora7);
        System.out.println(hora8);

        if (hora7.equals(hora8)){
            System.out.println("Las horas son iguales");
        }else {
            System.out.println("Las horas son distintas");
        }
        if (hora5.equals(hora8)){
            System.out.println("Las horas son iguales");
        }else {
            System.out.println("Las horas son distintas");
        }

    }


}
