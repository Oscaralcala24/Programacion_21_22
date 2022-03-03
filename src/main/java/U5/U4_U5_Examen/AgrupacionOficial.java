package U5.U4_U5_Examen;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion{

    private Integrante[] integrantes = new Integrante[0];
    private int puntosObtenidos;

    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
        this.puntosObtenidos = puntosObtenidos;
    }

    void anadirIntegrante(Integrante integrante){
        this.integrantes = Arrays.copyOf(this.integrantes,this.integrantes.length+1);
        this.integrantes[this.integrantes.length-1] = integrante;
    }
    boolean eliminarIntegrante(Integrante integrante){
        boolean borrado = false;
        int longitudInicial = integrantes.length;
        int longitudFinal = 0;
        Integrante[] arrayAux = new Integrante[0];
        for (int i = 0; i < this.integrantes.length; i++) {
            if (this.integrantes[i] != integrante){
                arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
                arrayAux[arrayAux.length-1] = this.integrantes[i];
            }
        }
        this.integrantes = Arrays.copyOf(arrayAux,arrayAux.length);
        for (int i = 0; i < arrayAux.length; i++) {
            this.integrantes[i] = arrayAux[i];
        }
        longitudFinal = this.integrantes.length;
        if (longitudFinal != longitudInicial){
            borrado = true;
        }
        return borrado;
    }

    abstract void caminito_del_falla();

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                "integrantes=" + Arrays.toString(integrantes) +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }
}
