package U5.Tarea1.Parte1;

public class Hora12 extends Hora{

    private String parteDia = "";

    public Hora12(int hora, int minutos, String parteDia) {
        super(hora, minutos);
        if((hora>12 || hora<0)){
            this.hora = 0;
        }else {
            this.hora = hora;
        }
        if((minutos>59 || minutos<0)){
            this.minutos = 0;
        }else {
            this.minutos = minutos;
        }
        this.parteDia = parteDia;
    }

    @Override
    public String toString(){
        return this.hora + ":" + this.minutos +" "+ this.parteDia;
    }

}
