package U4.Entregable_20_21;

import java.util.Arrays;

public class Escenario {

    private int pixelesAltura;
    private int pixelesLongitud;
    private int numAnillos;
    private int numGemas;
    private Enemigo.tipoEnemigo[] arrayTipoEnemigo = new Enemigo.tipoEnemigo[5];
    private Enemigo [] arrayEnemigo = new Enemigo[0];
    private int contadorEnemigos = 0;

    public Escenario(Enemigo.tipoEnemigo[] arrayTipoEnemigo) {
        if (arrayTipoEnemigo.length<=5){
            this.arrayTipoEnemigo = arrayTipoEnemigo;
            this.pixelesAltura = 100;
            this.pixelesLongitud = 100;
            this.numAnillos = 500;
            this.numGemas = 2;
        }else {
            System.out.println("No puede haber mas de 5 tipos de enemigos");
        }

    }

    public void generarEnemigo(){
        if (arrayEnemigo.length<10){
            arrayEnemigo = Arrays.copyOf(arrayEnemigo,arrayEnemigo.length+1);
            arrayEnemigo[contadorEnemigos++] = new Enemigo(arrayTipoEnemigo[(int) (Math.random()*comprobarNumTipos())]);
        }
    }

    private int comprobarNumTipos() {
        int contadorTipos = 0;
        for (int i = 0; i < arrayTipoEnemigo.length; i++) {
            if (arrayTipoEnemigo[i] != null){
                contadorTipos++;
            }
        }
        return contadorTipos;
    }

    public void eliminarEnemigo(int posicion){
        if (posicion>arrayEnemigo.length-1){
            System.out.println("No se puede eliminar");
        }else {
            for (int i = 0; i < arrayEnemigo.length-1; i++) {
                if (posicion<=i){
                    arrayEnemigo[i] = arrayEnemigo[i+1];
                }
            }
            arrayEnemigo = Arrays.copyOf(arrayEnemigo, arrayEnemigo.length-1);
        }
    }

    public void getArrayTipoEnemigo() {
        for (int i = 0; i < arrayTipoEnemigo.length; i++) {
            System.out.println(arrayTipoEnemigo[i]);
        }
    }
    public void getArrayEnemigos() {
        for (int i = 0; i < arrayEnemigo.length; i++) {
            System.out.println(arrayEnemigo[i].getNombreEnemigo());
        }
    }


    public void mostrarInfoEscenario(){
        System.out.println("La altura del escenario es: "+ this.pixelesAltura);
        System.out.println("La longitud del escenario es: "+ this.pixelesLongitud);
        System.out.println("El escenario tiene: "+ this.numAnillos + " anillos");
        System.out.println("El escenario tiene: "+ this.numGemas + " gemas");
        System.out.println("Los tipos de enemigos que puede tener son: ");
        getArrayTipoEnemigo();
        System.out.println("Los enemigos que tiene son: ");
        getArrayEnemigos();
    }

}
