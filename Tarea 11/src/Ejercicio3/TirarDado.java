package Ejercicio3;

public class TirarDado {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        jugador1.tirada();
        jugador2.tirada();
        System.out.println("Jugador 1: Dado 1 - " + jugador1.getDado1().getPuntos() + " Dado 2 -"
                + jugador1.getDado2().getPuntos());
        System.out.println("Jugador 2: Dado 2 - " + jugador2.getDado1().getPuntos() + " Dado 2 -"
                + jugador2.getDado2().getPuntos());
        System.out.println(jugador1.comprobar_ganador(jugador2));
    }
}
