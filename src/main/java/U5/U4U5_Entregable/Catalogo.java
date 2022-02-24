package U5.U4U5_Entregable;

import java.util.Arrays;

public class Catalogo{

    private Multimedia[] arrayMultimedia = new Multimedia[0];
    private static int contadorIntroducido = 0;

    void add_multimedia(Multimedia elemento){
        this.arrayMultimedia = Arrays.copyOf(this.arrayMultimedia, this.arrayMultimedia.length+1);
        this.arrayMultimedia[this.arrayMultimedia.length-1] = elemento;
        contadorIntroducido++;
    }

    boolean eliminar_multimedia(Multimedia elemento) {
        Multimedia[] arrayAux = new Multimedia[0];
        boolean eliminado = false;
        int contadorAux = 0;

        for (int i = 0; i < this.arrayMultimedia.length; i++) {
            if (!(this.arrayMultimedia[i] == elemento)) {
                arrayAux = Arrays.copyOf(arrayAux, arrayAux.length + 1);
                arrayAux[arrayAux.length - 1] = this.arrayMultimedia[i];
            }else {
                contadorAux++;
            }
        }
        this.arrayMultimedia = Arrays.copyOf(arrayAux, arrayAux.length);
        for (int i = 0; i < arrayAux.length; i++) {
            this.arrayMultimedia[i] = arrayAux[i];
        }
        if (contadorAux == 1){
            eliminado = true;
            contadorIntroducido--;
        }

        return eliminado;
    }
    void ordenar_por_id(){
        Arrays.sort(arrayMultimedia);
    }

    void ordenar_por_titulo(){
        Arrays.sort(arrayMultimedia, new OrdenarTitulo());
    }

    void ordenar_por_anyo(){
        Arrays.sort(arrayMultimedia, new OrdenarAnyo());
    }

    int numero_de_elementos(){
        return contadorIntroducido;
    }

    @Override
    public String toString() {
        return "arrayMultimedia=" + Arrays.toString(arrayMultimedia);
    }

    public Multimedia[] getArrayMultimedia() {
        return arrayMultimedia;
    }

    public void setArrayMultimedia(Multimedia[] arrayMultimedia) {
        this.arrayMultimedia = arrayMultimedia;
    }



}
