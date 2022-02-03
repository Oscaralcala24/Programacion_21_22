package U5.Tarea1.Parte2;

import java.util.Arrays;

public class Instrumento {

    notasMusicales[] listaNotas = new notasMusicales[0];

    public Instrumento() {

    }

    void add(notasMusicales notas){
        if (listaNotas.length<100){
            listaNotas = Arrays.copyOf(listaNotas, listaNotas.length+1);
            listaNotas[listaNotas.length-1] = notas;
        }
    }

    public enum notasMusicales{
        DO,
        RE,
        MI,
        FA,
        SOL,
        LA,
        SI
    }
}
