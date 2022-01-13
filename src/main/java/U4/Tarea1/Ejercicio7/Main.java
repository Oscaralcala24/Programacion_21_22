package U4.Tarea1.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Sintonizador s1 = new Sintonizador();
        System.out.println(s1.getFrecuencia());
        s1.bajarFrecuencia();
        System.out.println(s1.getFrecuencia());
        s1.bajarFrecuencia();
        System.out.println(s1.getFrecuencia());
        s1.subirFrecuencia();
        s1.subirFrecuencia();
        s1.subirFrecuencia();
        s1.subirFrecuencia();
        System.out.println(s1.getFrecuencia());
    }
}
