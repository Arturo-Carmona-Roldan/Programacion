package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Forma f = new Forma("Azul", new Punto(12, 12));
        Rectangulo r = new Rectangulo("Verde", new Punto(34, 34), 12, 5);
        System.out.println(f);
        System.out.println(r);
        System.out.println("Area del rectangulo:" + r.area());
        System.out.println("Perimetro del rectangulo:" + r.perimetro());
        r.cambiarTamanyo(2);
        System.out.println(r);
        Cuadrado c = new Cuadrado("Amarillo", new Punto(23, 45), 22);
        System.out.println(c);
        System.out.println("Perimetro del cuadrado:" + c.perimetro());
        Elipse e = new Elipse("Verde", new Punto(12, 55), 20, 4);
        System.out.println(e);
        System.out.println("Radio mayor de la elipse: " + e.radioMayor);
        System.out.println("Radio menor de la elipse: " + e.radioMenor);
        System.out.println("Area de la elipse: " + e.area());
        Circulo cir = new Circulo("Naranja", new Punto(66, 44), 33);
        System.out.println(cir.area());
    }
}
