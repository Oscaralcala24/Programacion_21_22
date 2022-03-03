package U5.Prueba2021;

import java.util.Arrays;

public abstract class Deporte{
    private String nombreDeporte;
    private String nombrePabellon;
    private Participante[] participantes = new Participante[0];

    public Deporte(String nombreDeporte, String nombrePabellon) {
        this.nombreDeporte = nombreDeporte;
        this.nombrePabellon = nombrePabellon;
    }

    void anadirParticipante(Participante atleta){
        this.participantes = Arrays.copyOf(this.participantes,this.participantes.length+1);
        this.participantes[this.participantes.length-1] = atleta;
    }

    void quitarParticipante(Participante atleta){
        Participante[] arrayAux = new Participante[0];
        for (int i = 0; i < this.participantes.length; i++) {
            if (this.participantes[i] != atleta){
                arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
                arrayAux[arrayAux.length-1] = this.participantes[i];
            }
        }
        this.participantes = Arrays.copyOf(arrayAux,arrayAux.length);
        for (int i = 0; i < arrayAux.length; i++) {
            this.participantes[i] = arrayAux[i];
        }
    }

    void mostrarParticipantes(){
        Arrays.sort(participantes, new OrdenarXEdad());
        for (int i = 0; i < participantes.length; i++) {
            System.out.println(participantes[i]);
        }
    }

}
