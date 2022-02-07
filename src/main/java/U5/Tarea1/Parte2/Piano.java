package U5.Tarea1.Parte2;

import java.util.Arrays;

public class Piano extends Instrumento{

    private int contadorNotas = 0;

    public Piano() {

    }



    @Override
    public void interpretar() {
        for (int i = 0; i < contadorNotas; i++) {
            System.out.println(getListaNotas()[i].toString());
        }

    }

    @Override
    public void add(notasMusicales nota) {
        if (contadorNotas<getListaNotas().length){
            getListaNotas()[contadorNotas++] = nota;
        }
    }
}
