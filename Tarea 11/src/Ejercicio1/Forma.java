package Ejercicio1;

public class Forma {
    protected String color;
    protected Punto coordenadas;
    protected String nombre;

    public Forma(String color, Punto coordenadas) {
        this.color = color;
        this.coordenadas = coordenadas;
        this.nombre = "";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCoordenadas(Punto coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Forma{" +
                "color='" + color + '\'' + coordenadas +
                ", nombre='" + nombre + '\'' +
                "}";
    }
}
