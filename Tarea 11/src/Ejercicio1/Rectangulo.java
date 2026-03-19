package Ejercicio1;

public class Rectangulo extends Forma {
    protected double ladoMayor;
    protected double ladoMenor;

    public Rectangulo(String color, Punto coordenadas, double ladoMayor, double ladoMenor) {
        super(color, coordenadas);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
        this.nombre = "Rectángulo";
    }

    public String toString() {
        return super.toString() + "ladoMayor=" + ladoMayor +
                ", ladoMenor=" + ladoMenor;
    }

    public double area() {
        return ladoMayor * ladoMenor;
    }

    public double perimetro() {
        return 2 * (ladoMenor + ladoMayor);
    }

    public void cambiarTamanyo(double factor) {
        this.ladoMayor = factor * this.ladoMayor;
        this.ladoMenor = factor * this.ladoMenor;
    }
}