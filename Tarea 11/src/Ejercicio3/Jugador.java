package Ejercicio3;

public class Jugador {
    protected Dado dado1;
    protected Dado dado2;

    public Jugador() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
    }

    public Dado getDado1() {
        return dado1;
    }

    public Dado getDado2() {
        return dado2;
    }

    public void tirada() {
        dado2.tirar();
        dado1.tirar();
    }

    public String comprobar_ganador(Jugador jugador2) {
        if ((this.dado1.getPuntos() == 6 || this.dado2.getPuntos() == 6) && jugador2.dado2.getPuntos() != 6 &&
                jugador2.dado1.getPuntos() != 6)
            return "Jugador 1";
        else if (dado1.getPuntos() != 6 && dado2.getPuntos() != 6 && (jugador2.dado2.getPuntos() == 6 ||
                jugador2.dado1.getPuntos() == 6))
            return "Jugador 2";
        else if ((dado1.getPuntos() + dado2.getPuntos()) == (jugador2.dado2.getPuntos() +
                jugador2.dado1.getPuntos()))
            return "Empate";
        else if ((dado1.getPuntos() + dado2.getPuntos()) > (jugador2.dado2.getPuntos() +
                jugador2.dado1.getPuntos()))
            return "Jugador 1";
        else
            return "Jugador 2";
    }
}
