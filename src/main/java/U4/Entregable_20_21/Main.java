package U4.Entregable_20_21;

import U1.Pruebas.V;

public class Main {
    public static void main(String[] args) {
        Enemigo enemigo1 = new Enemigo(Enemigo.tipoEnemigo.BUZZBOMBER);
        Enemigo enemigo2 = new Enemigo(Enemigo.tipoEnemigo.CHOPPER);
        Enemigo enemigo3 = new Enemigo(Enemigo.tipoEnemigo.MOTOBUG);
        Enemigo enemigo4 = new Enemigo(Enemigo.tipoEnemigo.CRABMEAT);
        Enemigo enemigo5 = new Enemigo(Enemigo.tipoEnemigo.CRABMEAT);
        Personaje personaje1 = new Personaje(Personaje.tiposPersonajes.KNUCKLES,100,250,200);
        Escenario escenario1 = new Escenario(new Enemigo.tipoEnemigo[]{Enemigo.tipoEnemigo.BUZZBOMBER,
                Enemigo.tipoEnemigo.CHOPPER,
                Enemigo.tipoEnemigo.MOTOBUG,
                Enemigo.tipoEnemigo.CRABMEAT});
        escenario1.generarEnemigo();
        escenario1.generarEnemigo();
        escenario1.generarEnemigo();
        escenario1.generarEnemigo();
        escenario1.generarEnemigo();

        Videojuego vid1 = new Videojuego();
        Videojuego vid2 = new Videojuego(personaje1,escenario1);
        vid2.estadoVideojuego();
        escenario1.eliminarEnemigo(2);
        System.out.println();
        vid2.estadoVideojuego();




    }
}
