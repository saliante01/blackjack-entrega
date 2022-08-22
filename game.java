import java.util.Collections;

public class game {
    public static void main (String[] args){ //menu
       // test String[][] baraja = crearBaraja();
        // test System.out.println(baraja);
    }
    public static String[][] crearBaraja(){
        var pintas = new String[]{"Corazon","Diamante","Trebol","Pica"};
        var numerosCartas= new String[]{"AS","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ","ONCE"};
        return new String[][]{pintas,numerosCartas};
    }
    public static String[] crearMano(){
        return new String[2];   //string[2] devuelve dos cartas generadas por una pinta y un nuemro cada uno
    }
    public static void baraja(String[][] baraja){               //no retorna un valor

    }
    public static void barajar{
        Collections.shuffle(crearMano());
    }
    public static String[] pedirCarta(String[][] baraja,String[]mano){

    }
    public static void mostrarMano(String[]mano){

    }
    public static void bajarse(String[]manojugador,String[]manoDealer){

    }
    //boolean si se pasa de 21(String[]mano);
    //boolean si es blackjack(String[]mano(jugador));
    public static String[] verGanador(String[]mano,String[]manoDealer){

    }

    //void jugar();
    //void mostrarmenu();

}
