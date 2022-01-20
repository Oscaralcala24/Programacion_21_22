package U4.Tarea1.Ejercicio10;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    void sumarHora(int segundos){

         while (segundos+this.segundo>=60){
            setMinuto(this.minuto+1);
            segundos -= 60;
        }
        while (this.minuto>=60){
            setHora(this.hora+1);
            this.minuto -= 60;
        }
        if (segundos+this.segundo<60){
            setSegundo((segundos+this.segundo));

        }
    }

    void motrarHora(){
        System.out.println(hora+":"+minuto+":"+segundo);
    }

    public int getHora() {
        return hora;
    }

    private void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    private void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    private void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
