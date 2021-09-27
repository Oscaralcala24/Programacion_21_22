package U1.T8;

//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

public class Ejercicio13 {
    public static void main(String[] args) {
        int aprobados=0;
        int condicionados=0;
        int suspensos=0;
        for (int i = 1; i <= 6; i++) {
            int nota = (int) (Math.random()*10);
            while ((nota>10) || (nota<0)){
                nota=0;
            }
            if (nota>4){
                aprobados++;
            }else if (nota==4){
                condicionados++;
            } else{
                suspensos++;
            }
        }
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Condicionados: "+condicionados);
        System.out.println("Suspensos: "+suspensos);
    }
}
