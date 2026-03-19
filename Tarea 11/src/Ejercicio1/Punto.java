package Ejercicio1;

public class Punto {
    private int coorX;
    private int coorY;

    public Punto(int coorX, int coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public String toString() {
        return "coorX=" + coorX +
                ", coorY=" + coorY;
    }
}
