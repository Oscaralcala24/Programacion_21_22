package U5.Tarea2.Ejercicio3;

public class Circulo implements Figura{


    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    public Circulo() {
        this.radio = 10;
    }


    @Override
    public void getArea() {
        System.out.println(Math.PI*Math.pow(radio,2));
    }
    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

}
