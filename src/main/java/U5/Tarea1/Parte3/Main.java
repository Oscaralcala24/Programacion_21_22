package U5.Tarea1.Parte3;

public class Main {
    public static void main(String[] args) {
        Caja C1 = new Caja(25,67,23, Caja.Unidades.M);
        Caja C2 = new Caja(3,7,23,Caja.Unidades.M);
        Caja C3 = new Caja(25,67,23, Caja.Unidades.CM);

        CajaCarton CC1 = new CajaCarton(67,21,2);
        CajaCarton CC2 = new CajaCarton(2,22,1);
        CajaCarton CC3 = new CajaCarton(64,231,5);

        System.out.println(C1);
        System.out.println(C1.getVolumen());
        C1.setEtiqueta("Esto es una etiqueta");
        System.out.println(C1);
        System.out.println(CC1);
    }
}
