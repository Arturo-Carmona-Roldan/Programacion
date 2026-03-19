package Ejercicio3;

public class Dado {
    protected byte puntos;

    public Dado() {
        this.puntos = (byte) ((Math.random() * 6) + 1);
    }

    public byte getPuntos() {
        return this.puntos;
    }

    public void tirar() {
        this.puntos = (byte) ((Math.random() * 6) + 1);
    }
}
