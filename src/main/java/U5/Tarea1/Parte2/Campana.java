package U5.Tarea1.Parte2;

public class Campana extends Instrumento{

    private int contadorNotas = 0;

    public Campana() {

    }

    @Override
    public void interpretar() {
        for (int i = 0; i < contadorNotas; i++) {
            System.out.println(getListaNotas()[i].toString());
        }

    }

    @Override
    public void add(Instrumento.notasMusicales nota) {
        if (contadorNotas<getListaNotas().length){
            getListaNotas()[contadorNotas++] = nota;
        }
    }
}
