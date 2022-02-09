package U5.Tarea1.Parte4;

public class Electrodomestico {

    protected double precioBase = 100;
    protected coloresDisponibles color = coloresDisponibles.BLANCO;
    protected consumoEnergetico consumoLetra = consumoEnergetico.F;
    protected double peso = 5;

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, coloresDisponibles color, consumoEnergetico consumoLetra, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoLetra = consumoLetra;
        this.peso = peso;
    }

    public enum consumoEnergetico{
        A,
        B,
        C,
        D,
        E,
        F;
    }

    public enum coloresDisponibles{
        BLANCO,
        NEGRO,
        AZUL,
        ROJO,
        GRIS;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase= " + precioBase +
                ", color= " + color +
                ", consumoLetra= " + consumoLetra +
                ", peso= " + peso +
                ", precioFinal= " + getPrecioFinal() +
                '}';
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public coloresDisponibles getColor() {
        return color;
    }

    public consumoEnergetico getConsumoLetra() {
        return consumoLetra;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioFinal(){
        double precioFinal = this.precioBase;
        switch (this.consumoLetra){
            case A: precioFinal+=100;
            case B: precioFinal+=80;
            case C: precioFinal+=60;
            case D: precioFinal+=50;
            case E: precioFinal+=30;
            case F: precioFinal+=10;
        }
        if (getPeso() >= 0 && getPeso()<= 29){
            precioFinal+=10;
        }else if (getPeso() >= 30 && getPeso() <= 49){
            precioFinal+=60;
        }else if (getPeso()>=50 && getPeso()<=79 ){
            precioFinal+=80;
        }else{
            precioFinal+=100;
        }
        return precioFinal;
    }
}
