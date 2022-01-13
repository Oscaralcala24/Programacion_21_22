package U4.Tarea1.Ejercicio1234546;

public class CuentaCorriente {

    public String nombre;
    protected String DNI;
    private long saldo = 0;
    private long limiteDeDescubrimiento = -50;
    public static Banco nombreBanco;


    public CuentaCorriente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;

    }

    public CuentaCorriente(long saldo) {
        this.saldo = saldo;
        this.limiteDeDescubrimiento = 0;
    }

    public CuentaCorriente(long saldo, long limiteDeDescubrimiento, String DNI) {
        this.saldo = saldo;
        this.limiteDeDescubrimiento = limiteDeDescubrimiento;
        this.DNI = DNI;

    }

    boolean sacarDinero(long dineroRetirar){
        boolean retirado = false;
        if (dineroRetirar<=this.saldo-limiteDeDescubrimiento){
            this.saldo = this.saldo-dineroRetirar;
            retirado = true;
        }
        if (retirado){
            System.out.println("La retirada ha sido posible");
        }else {
            System.out.println("La retirada no ha sido posible");
        }
        return retirado;
    }

    void ingresarDinero(long cantidadIngresada){
        System.out.println("El ingreso se ha realizado con exito");
        setSaldo(cantidadIngresada);
    }

    private void setSaldo(long cantidadIngresada) {
        this.saldo = this.saldo+cantidadIngresada;
    }

    void mostrarInformacion(){
        System.out.println(getNombre()+ " con DNI "+getDNI()+" tiene un saldo de "+getSaldo()+"€ en su cuenta corriente");
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public long getSaldo() {
        return saldo;
    }

    public static void setNombreBanco(Banco nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }
}
