package Ejercicio1;

public class Cuadrado extends Rectangulo {
    public Cuadrado(String color, Punto coordenadas, double lado) {
        super(color, coordenadas, lado, lado);
        this.nombre = "Cuadrado";
    }

    public String toString() {
        String cadena = super.toString();
        cadena = cadena.replace("ladoMayor", "lado");
        int pos = cadena.lastIndexOf(",");
        cadena = cadena.substring(0, pos);
        return cadena;
    }
}
