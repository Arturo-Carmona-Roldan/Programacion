package Ejercicio1;

public class Elipse extends Forma {
    protected double radioMayor;
    protected double radioMenor;
    static final double PI = 3.1415;

    public Elipse(String color, Punto coordenadas, double radioMayor, double radioMenor) {
        super(color, coordenadas);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
        this.nombre = "Elipse";
    }

    public double area() {
        return PI * radioMayor * radioMenor;
    }

    public String toString() {
        return super.toString() +
                "radioMayor=" + radioMayor +
                ", radioMenor=" + radioMenor;
    }
}
