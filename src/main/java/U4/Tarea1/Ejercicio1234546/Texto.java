package U4.Tarea1.Ejercicio1234546;

public class Texto {



    private String texto;
    private int longitudMax;

    public Texto(String texto, int longitudMax){
        this.texto = texto;
        this.longitudMax = longitudMax;
    }

    void insertarCaracterPrincipio(char caracter){
        if (texto.length() < longitudMax){
            this.texto = caracter + getTexto();
            System.out.println(getTexto());
        }else {
            System.out.println("No ha sido posible añadir");
        }
    }

    void insertarCaracterFinal(char caracter){
        if (texto.length() < longitudMax){
            this.texto = getTexto() + caracter;
            System.out.println(getTexto());
        }else {
            System.out.println("No ha sido posible añadir");
        }
    }

    void insertarTextoPrincipio(String textoAnadir){
        if (texto.length() + textoAnadir.length() < longitudMax){
            this.texto = textoAnadir + getTexto();
            System.out.println(getTexto());
        }else {
            System.out.println("No ha sido posible añadir");
        }
    }

    void insertarTextoFinal(String textoAnadir){
        if (texto.length() + textoAnadir.length() < longitudMax){
            this.texto = getTexto() + textoAnadir;
            System.out.println(getTexto());
        }else {
            System.out.println("No ha sido posible añadir");
        }
    }

    public int getNumVocales(){
        int numeroVocales = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < getTexto().length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (getTexto().charAt(i) == vocales.charAt(j)){
                    numeroVocales++;
                }
            }
        }
        return numeroVocales;
    }


    public String getTexto() {
        return texto;
    }
}