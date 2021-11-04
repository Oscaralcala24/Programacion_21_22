package U1.U1_EXAMEN;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Carbonita Volando");
        System.out.println("Introduzca el peso de su figura en gramos: ");
        int pesoFigura = sc.nextInt();
        System.out.println("Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
        int tipoMaterial = sc.nextInt();
        System.out.println("¿Quiere posprocesado? (1=si, 2=no): ");
        int procesado = sc.nextInt();
        System.out.println("¿Pertenece a Enjuto3D Premium? (1=si, 2=no): ");
        int premium = sc.nextInt();
        double gastoMaterial;
        int gastoProcesado = 0;
        int gastoEnvio = 2;
        if (tipoMaterial==1){
            gastoMaterial = 0.2;
        }else if (tipoMaterial==2){
            gastoMaterial = 0.3;
        }else if (tipoMaterial==3){
            gastoMaterial = 0.5;
        }else{
            gastoMaterial = 0.7;
        }
        if (procesado==1){
            gastoProcesado = 3;
        }
        if (premium==1){
            gastoEnvio =0;
        }
        double costeTotal = (gastoMaterial*pesoFigura)+gastoProcesado+gastoEnvio;
        System.out.println("El coste total de la pieza es: "+costeTotal+" €");
    }
}
