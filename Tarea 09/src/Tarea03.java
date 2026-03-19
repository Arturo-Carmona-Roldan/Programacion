import java.util.Scanner;

public class Tarea03 {

    public static final double PI = 3.1416;

    private double radio;

    public double CalcularArea() {
        return radio * radio * PI;
    }

    public double CalcularPerimetro() {
        return 2 * PI * radio;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Tarea03 circulo = new Tarea03();
        System.out.println("Ingresa el radio del círculo: ");
        circulo.radio = teclado.nextInt();

        double area = circulo.CalcularArea();
        double perimetro = circulo.CalcularPerimetro();

        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
}

