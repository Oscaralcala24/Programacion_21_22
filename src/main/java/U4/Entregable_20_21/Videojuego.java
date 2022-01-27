package U4.Entregable_20_21;

import java.time.LocalDateTime;

public class Videojuego {
    private Personaje personaje;
    private Escenario escenario;
    private LocalDateTime fechaHora = LocalDateTime.now();

    public Videojuego(Personaje personaje, Escenario escenario) {
        this.personaje = personaje;
        this.escenario = escenario;
    }
}
