package U5.U4_U5_Examen;
public class Main {
    public static void main(String[] args) {
        COAC coac1 = new COAC();
        Chirigota ch1 = new Chirigota("aaaaaaaaaa","bbbbbbbb","ccccccc","dddd","zzzzzz",4,5);
        Chirigota ch2 = new Chirigota("fdfdsagfda","bfdgdfbbbfdgfdg","cfdgccc","fghdd","zgbzz",6,2);
        Comparsa com1 = new Comparsa("uuuuuuuu","wwwwww","hhhhhh","ñlllll","aaaas","uofdjf",78);
        Coro coro1 = new Coro("jflsñd","jhdsl","pfdm","krekrp","jofjedf",7,3,50);
        Romancero rom1 = new Romancero("pfpkg","gkdmcv","3irkg","idjf","irmncn","jsodjf");

        Integrante int1 = new Integrante("pepe",15,"Cadiz");
        Integrante int2 = new Integrante("Jose",45,"Huelva");
        Integrante int3 = new Integrante("Oscar",34,"Sevilla");

        ch1.amo_a_escucha();
        ch1.caminito_del_falla();
        ch1.hacer_tipo();
        ch1.cantar_la_presentacion();
        ch1.anadirIntegrante(int1);
        ch1.anadirIntegrante(int2);
        ch1.anadirIntegrante(int3);

        System.out.println(ch1);
        System.out.println();
        ch1.eliminarIntegrante(int1);
        System.out.println(ch1);
        ch1.inscribir_agrupacion(ch1);
        ch1.inscribir_agrupacion(ch2);
        ch1.inscribir_agrupacion(coro1);

        coac1.mostrarArrayAgrupaciones();

    }
}
