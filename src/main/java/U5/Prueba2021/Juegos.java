package U5.Prueba2021;

import java.util.Arrays;

public class Juegos {
    private int anoCelebracion;
    private String sede;
    private Pais[] paisesParticipantes = new Pais[0];
    private Deporte[] listaDeportes = new Deporte[0];;

    public Juegos(int anoCelebracion, String sede) {
        setAnoCelebracion(anoCelebracion);
        this.sede = sede;
    }

    void anadirDeporte(Deporte deporte){
        this.listaDeportes = Arrays.copyOf(this.listaDeportes,this.listaDeportes.length+1);
        this.listaDeportes[this.listaDeportes.length-1] = deporte;
    }

    void quitarDeporte(Deporte deporte){
        Deporte[] arrayAux = new Deporte[0];
        for (int i = 0; i < this.listaDeportes.length; i++) {
            if (this.listaDeportes[i] != deporte){
                arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
                arrayAux[arrayAux.length-1] = this.listaDeportes[i];
            }
        }
        this.listaDeportes = Arrays.copyOf(arrayAux,arrayAux.length);
        for (int i = 0; i < arrayAux.length; i++) {
            this.listaDeportes[i] = arrayAux[i];
        }
    }

    void anadirPais(Pais pais){
         this.paisesParticipantes = Arrays.copyOf(this.paisesParticipantes,this.paisesParticipantes.length+1);
         this.paisesParticipantes[paisesParticipantes.length-1] = pais;
    }

    void quitarPais(Pais pais){
        Pais[] arrayAux = new Pais[0];
        for (int i = 0; i < paisesParticipantes.length; i++) {
            if (paisesParticipantes[i] != pais){
                arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
                arrayAux[arrayAux.length-1] = this.paisesParticipantes[i];
            }
        }
        this.paisesParticipantes = Arrays.copyOf(arrayAux,arrayAux.length);
        for (int i = 0; i < arrayAux.length; i++) {
            this.paisesParticipantes[i] = arrayAux[i];
        }
    }

    public void setAnoCelebracion(int anoCelebracion) {
        if (anoCelebracion%4==0){
            this.anoCelebracion = anoCelebracion;
        }else {
            this.anoCelebracion = 2024;
        }
    }

    void mostrarPaises(){
        Arrays.sort(paisesParticipantes, new OrdenarXParticipantes());
        for (int i = 0; i < paisesParticipantes.length; i++) {
            System.out.println(paisesParticipantes[i]);
        }
    }

    void mostrarPaisesParaCeremonia(){
        Arrays.sort(paisesParticipantes);
        for (int i = 0; i < paisesParticipantes.length; i++) {
            System.out.println(paisesParticipantes[i]);
        }
    }


}
