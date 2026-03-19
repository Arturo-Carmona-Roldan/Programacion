package Ejercicio1;

public class Circulo extends Elipse {
    public Circulo(String color, Punto coordenadas, double radio) {
        super(color, coordenadas, radio, radio);
        this.nombre = "Circulo";
    }

    public String toString() {
        String cadena = super.toString();
        cadena = cadena.replace("radioMayor", "radio");
        int pos = cadena.lastIndexOf(",");
        cadena = cadena.substring(0, pos);
        return cadena;
    }
}
