package U7.U6U7_Entregable;

public class Main {
    public static void main(String[] args) {
        Exchange Binance = new Exchange();

        Criptomoneda cripto1 = new Criptomoneda("Vechain","Vet",0.04,19930,"2010",20);
        Criptomoneda cripto2 = new Criptomoneda("Elrond","EGLD",156,2456,"2016",45);
        Criptomoneda cripto3 = new Criptomoneda("Bitcoin","BTC",39000,7843759,"2008",1);

        Fiat fiat1 = new Fiat("Euro","EUR",1.2,"Belgica");
        Fiat fiat2 = new Fiat("Yuan","YN",123,"China");

        ParCotizacion par1 = new ParCotizacion(100,20,cripto1,fiat1);
        ParCotizacion par2 = new ParCotizacion(120,-17,cripto1,fiat2);

        ParCotizacion par3 = new ParCotizacion(85,-12,cripto2,fiat2);
        ParCotizacion par4 = new ParCotizacion(23,78,cripto2,cripto3);

        ParCotizacion par5 = new ParCotizacion(256,2,cripto3,fiat2);
        ParCotizacion par6 = new ParCotizacion(345,-5,cripto3,fiat1);

        ParCotizacion par7 = new ParCotizacion(1.6,1,fiat1,fiat2);
        ParCotizacion par8 = new ParCotizacion(0.4,34,fiat1,cripto1);

        ParCotizacion par9 = new ParCotizacion(130,13,fiat2,fiat1);
        ParCotizacion par10 = new ParCotizacion(75,54,fiat2,cripto2);

        Binance.addCotizacion(par1);
        Binance.addCotizacion(par2);
        Binance.addCotizacion(par3);
        Binance.addCotizacion(par4);
        Binance.addCotizacion(par5);
        Binance.addCotizacion(par6);
        Binance.addCotizacion(par7);
        Binance.addCotizacion(par8);
        Binance.addCotizacion(par9);
        Binance.addCotizacion(par10);
        System.out.println("Obtiene cotizaciones de cada moneda");
        System.out.println();
        System.out.println(Binance.obtenerCotizaciones("Vet"));
        System.out.println();
        System.out.println(Binance.obtenerCotizaciones("EGLD"));
        System.out.println();
        System.out.println(Binance.obtenerCotizaciones("BTC"));
        System.out.println();
        System.out.println(Binance.obtenerCotizaciones("EUR"));
        System.out.println();
        System.out.println(Binance.obtenerCotizaciones("YN"));

        System.out.println();
        System.out.println();

        System.out.println("Muestra cotizaciones al alza una hora");
        System.out.println();
        Binance.mostrarCotizacionesAlAlzaUnaHora();

        System.out.println();
        System.out.println();

        System.out.println("Muestra divisas ordenadas");
        System.out.println();
        Binance.mostrarDivisasOrdenadas();

        System.out.println();
        System.out.println();

        System.out.println("Guarda y carga las cotizaciones");
        Binance.guardarCotizaciones();
        System.out.println();
        Binance.recuperarCotizaciones();

    }
}
