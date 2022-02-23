package U5.Examen1920;

public abstract class Material implements Comparable{


    private String nombre;
    private long masa;
    private int capQuemar;
    private int capDiluir;
    private boolean movible;

    public Material(String nombre, long masa, int capQuemar, int capDiluir, boolean movible) {
        this.nombre = nombre;
        setMasa(masa);
        setCapQuemar(capQuemar);
        setCapDiluir(capDiluir);
        this.movible = movible;
    }


    public void setMasa(long masa) {
        if (masa<0 || masa >1000){
            this.masa = 0;
        }else {
            this.masa = masa;
        }
    }

    public void setCapQuemar(int capQuemar) {
        if (capQuemar<0 || capQuemar >100){
            this.capQuemar = 0;
        }else {
            this.capQuemar = capQuemar;
        }
    }

    public void setCapDiluir(int capDiluir) {
        if (capDiluir<0 || capDiluir >100){
            this.capDiluir = 0;
        }else {
            this.capDiluir = capDiluir;
        }
    }


    @Override
    public String toString() {
        return "Material{" +"\n"+
                "nombre='" + nombre + '\'' +"\n"+
                "masa=" + masa +"\n"+
                "capQuemar=" + capQuemar +"\n"+
                "capDiluir=" + capDiluir +"\n"+
                "movible=" + movible +"\n"+
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Material that = (Material) o;
        if (that.getMasa() > this.getMasa()){
            return -1;
        } else if (that.getMasa() < this.getMasa()) {
            return 1;
        }
        return 0;
    }

    public long getMasa() {
        return masa;
    }


    public int getCapQuemar() {
        return capQuemar;
    }

    public int getCapDiluir() {
        return capDiluir;
    }
}
