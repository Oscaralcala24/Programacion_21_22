package U4.Tarea1.Ejercicio1234546;

//Actividad 1: Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan
// a un objeto de ese tipo son: saldo, límite de descubrimiento
// (cantidad de dinero que se permite sacar de una cuenta que ya está a cero), nombre y DNI del titular.
// Las operaciones típicas con una cuenta corriente son:
//
//Crear la cuenta: se necesita el nombre y DNI del titular.
// El saldo inicial será 0 y el límite de descubierto será de -50 euros.
//
//Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto.
// El método debe indicar, por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación. Además, deberá devolver un valor booleano que indique lo mismo.
//
//Ingresar dinero: se incrementa el saldo.
//
//Mostrar información: muestra la información de la cuenta corriente.

public class Main {
    public static void main(String[] args) {
        Banco b1 = new Banco("La caixa", 7.3, "Calle Alixar");
        CuentaCorriente c1 = new CuentaCorriente("Oscar", "74847587L");
        CuentaCorriente c2 = new CuentaCorriente("Maria", "34458532A");
        CuentaCorriente.setNombreBanco(b1);

        c1.ingresarDinero(500);
        System.out.println(c1.getNombre()+" tiene un saldo de "+c1.getSaldo());
        c1.sacarDinero(600);
        System.out.println(c1.getNombre()+" tiene un saldo de "+c1.getSaldo());
        c1.sacarDinero(400);
        System.out.println(c1.getNombre()+" tiene un saldo de "+c1.getSaldo());
        c2.ingresarDinero(200);
        c2.mostrarInformacion();
        c1.mostrarInformacion();

        Texto txt1 = new Texto("Hey que pasa olvidonaaaaa", 27);
        System.out.println("Este texto tiene "+txt1.getNumVocales()+" vocales");
        txt1.insertarCaracterPrincipio('a');
        txt1.insertarCaracterFinal('<');
        txt1.insertarTextoFinal("ya ni saludas eh... ");
        txt1.insertarTextoPrincipio("Ni dos besos ni nada? ");
        System.out.println("Este texto tiene "+txt1.getNumVocales()+" vocales");



    }
}
