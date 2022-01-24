package U4.Tarea1.Ejercicio10;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
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
        if (hora<=24){
            this.hora =hora;
        }else {
            this.hora = 0;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    private void setMinuto(int minuto) {
        if (minuto<=60){
            this.minuto = minuto;
        }else {
            this.minuto = 0;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    private void setSegundo(int segundo) {
        if (segundo<=60){
            this.segundo = segundo;
        }else {
            this.segundo = 0;
        }
    }
}
