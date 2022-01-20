package U4.Tarea2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Lista {

    private int capacidad;
    private Integer[] arrayList;
    private int elementosInsertados = 0;

    public Lista() {
        this.capacidad = 10;
        this.arrayList = new Integer[this.capacidad];
    }

    public Lista(int capacidad) {
        this.capacidad = capacidad;
        this.arrayList = new Integer[this.capacidad];
    }

    void insertarNumPrincipio(Integer numeroInsertar){
        Integer[] arrayAux = Arrays.copyOf(arrayList, arrayList.length);
        boolean esNulo = comprobarNulo();
        if (!esNulo) {
            arrayList = Arrays.copyOf(arrayList, arrayList.length + 1);
            arrayAux = Arrays.copyOf(arrayList, arrayList.length);
        }
        for (int i = 0; i < arrayList.length-1; i++) {
            arrayList[i+1] = arrayAux[i];
        }
        arrayList[0] = numeroInsertar;
        elementosInsertados++;
    }

    void insertarNumFinal(Integer numeroInsertar){
        Integer[] arrayAux = Arrays.copyOf(arrayList, arrayList.length);
        boolean esNulo = comprobarNulo();
        if (!esNulo) {
            arrayList = Arrays.copyOf(arrayList, arrayList.length + 1);
            arrayAux = Arrays.copyOf(arrayList, arrayList.length);
        }
        arrayList[elementosInsertados] = numeroInsertar;
        elementosInsertados++;
    }

    void insertarNumPosicion(Integer numeroInsertar, int posicion) {
        Integer[] arrayAux = Arrays.copyOf(arrayList, arrayList.length);
        boolean esNulo = comprobarNulo();
        if (!esNulo) {
            arrayList = Arrays.copyOf(arrayList, arrayList.length + 1);
            arrayAux = Arrays.copyOf(arrayList, arrayList.length);
        }
        for (int i = posicion; i < arrayList.length-1; i++) {
            arrayList[i+1] = arrayAux[i];
        }
        arrayList[posicion] = numeroInsertar;
        elementosInsertados++;
    }

    void insertarListaFinal(Integer[] listaInsertar){
        Integer[] arrayAux = Arrays.copyOf(arrayList, arrayList.length);
        boolean esNulo = false;
        int contadorNulo = 0;
        int contadorlistaInsertar = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] == null){
                contadorNulo++;
            }
        }
        if (contadorNulo >= listaInsertar.length){
            esNulo = true;
        }
        if (!esNulo){
            arrayList = Arrays.copyOf(arrayList, arrayList.length + contadorNulo);
        }
        for (int i = 0; i < arrayList.length; i++) {
            if (i<=elementosInsertados){
                    arrayList[i] = arrayAux[i];
            }else {
                    arrayList[i] = listaInsertar[contadorlistaInsertar];
                    elementosInsertados++;
            }
        }
    }

    private boolean comprobarNulo() {
        boolean esNulo = false;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] == null){
                esNulo = true;
            }
        }
        return esNulo;
    }

    public Integer[] getArrayList() {
        return arrayList;
    }

    public int getElementosInsertados() {
        return elementosInsertados;
    }


}
