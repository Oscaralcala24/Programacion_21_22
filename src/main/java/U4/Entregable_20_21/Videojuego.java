package U4.Entregable_20_21;

import java.time.LocalDateTime;

public class Videojuego {
    private Personaje personaje;
    private Escenario escenario;
    private LocalDateTime fechaHora = LocalDateTime.now();
    private static String ip = "192.168.1."+(int) (0 + Math.random()*256);

    public Videojuego() {
        this.personaje = new Personaje();
        this.escenario = new Escenario(new Enemigo.tipoEnemigo[]{Enemigo.tipoEnemigo.BUZZBOMBER, Enemigo.tipoEnemigo.COCONUTS});
       }

    public Videojuego(Personaje personaje, Escenario escenario) {
        this.personaje = personaje;
        this.escenario = escenario;
       }

    public void estadoVideojuego(){
        System.out.println("La fecha de inicio es: "+ this.fechaHora);
        personaje.mostarInfoPersonaje();
        escenario.mostrarInfoEscenario();
    }


    public static void setIp(int ipNum) {
        Videojuego.ip = "192.168.1."+(ipNum);
    }

}
