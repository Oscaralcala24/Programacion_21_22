package U5.Tarea1.Parte1;

import java.util.Objects;

public class HoraExacta extends Hora{


    int segundo;


    public HoraExacta(int hora, int minutos, int segundo) {
        super(hora, minutos);
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
        if((segundo>59 || segundo<0)){
            this.segundo = 0;
        }else {
            this.segundo = segundo;
        }
    }



    public void inc(){
        setSegundo(this.segundo+1);
        if (this.segundo == 60){
            setMinutos(this.minutos+1);
            setSegundo(0);
        }
    }


    @Override
    public String toString(){
        return this.hora + ":" + this.minutos + ":" + this.segundo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraExacta that = (HoraExacta) o;
        return this.segundo == that.segundo && this.hora == that.hora && that.minutos == this.minutos;
    }


    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
