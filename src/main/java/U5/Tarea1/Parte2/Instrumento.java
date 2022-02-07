package U5.Tarea1.Parte2;

import java.util.Arrays;

public abstract class Instrumento {


    private notasMusicales[] listaNotas;

    public Instrumento() {
        this.listaNotas = new notasMusicales[100];
    }




    public abstract void interpretar();
    public abstract void add(notasMusicales nota);

    public enum notasMusicales{
        DO,
        RE,
        MI,
        FA,
        SOL,
        LA,
        SI
    }

    public notasMusicales[] getListaNotas() {
        return listaNotas;
    }


}
