package U5.Examen1920;

public class Roca extends Material{

    private int dureza;

    public Roca(String nombre, long masa, int capQuemar, int capDiluir, boolean movible, int dureza) {
        super(nombre, masa, capQuemar, capDiluir, movible);
        setDureza(dureza);
    }

    public void setDureza(int dureza) {
        if (dureza<1 || dureza>10){
            this.dureza = 0;
        }else {
            this.dureza = dureza;
        }
    }
}
