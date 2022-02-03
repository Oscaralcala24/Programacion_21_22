package U5.Tarea1.Parte1;

import java.util.Objects;

public class Hora {

    int hora;
    int minutos;



    public Hora(int hora, int minutos) {
        if((hora>23 || hora<0)){
            this.hora = 0;
        }else {
            this.hora = hora;
        }
        if((minutos>59 || minutos<0)){
            this.minutos = 0;
        }else {
            this.minutos = minutos;
        }
    }

    public void inc(){
        setMinutos(this.minutos+1);
        if (this.minutos == 60){
            setHora(this.hora+1);
            setMinutos(0);
        }
    }


    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString(){
        return this.hora + ":" + this.minutos;
    }

}
