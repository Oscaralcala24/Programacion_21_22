package U4.Entregable_20_21;

public class Main {
    public static void main(String[] args) {
        Enemigo enemigo1 = new Enemigo(Enemigo.tipoEnemigo.BUZZBOMBER);
        Enemigo enemigo2 = new Enemigo(Enemigo.tipoEnemigo.CHOPPER);
        Escenario escenario1 = new Escenario(new Enemigo.tipoEnemigo[]{Enemigo.tipoEnemigo.BUZZBOMBER, Enemigo.tipoEnemigo.CHOPPER});
        escenario1.generarEnemigo();
        escenario1.generarEnemigo();
        escenario1.generarEnemigo();
        escenario1.generarEnemigo();
        escenario1.generarEnemigo();
        escenario1.generarEnemigo();
        escenario1.generarEnemigo();
        escenario1.getArrayEnemigos();
        escenario1.eliminarEnemigo(3);
        System.out.println();
        escenario1.getArrayEnemigos();


    }
}
