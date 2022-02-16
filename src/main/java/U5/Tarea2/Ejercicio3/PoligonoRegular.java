package U5.Tarea2.Ejercicio3;

public abstract class PoligonoRegular implements Figura{


    protected int lado;
    public colores colorines;
    protected static int contadorPoligonos;

    public PoligonoRegular(int lado, colores colorines) {
        this.lado = lado;
        this.colorines = colorines;
    }

    public enum colores{
        AZUL,
        ROJO,
        VERDE,
        AMARILLO;
    }

    public colores getColorines() {
        return colorines;
    }

    @Override
    public abstract void getArea();
}
