package U4.Tarea1.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla(true);
        Bombilla b2 = new Bombilla(false);
        Bombilla b3 = new Bombilla(false);
        System.out.println(b2.isEncendida());
        System.out.println(b1.isEncendida());
        System.out.println(b3.isEncendida());
        Bombilla.apagon();
        System.out.println();
        System.out.println(b2.isEncendida());
        System.out.println(b1.isEncendida());
        System.out.println(b3.isEncendida());
        Bombilla.reparado();
        System.out.println();
        System.out.println(b2.isEncendida());
        System.out.println(b1.isEncendida());
        System.out.println(b3.isEncendida());
    }
}
