import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double base, altura, area = 0;

        do {
            System.out.println("1.Area del circulo");
            System.out.println("2.Area del rectangulo");
            System.out.println("3.Area del triángulo");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opcion");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Ingresa el radio del circulo");
                    double radio = teclado.nextDouble();
                    area = Math.PI * radio * radio;
                    System.out.println("El area del circulo es: " + area);
                    break;

                case 2:

                    System.out.println("Ingresa el lado corto del rectangulo");
                    base = teclado.nextDouble();
                    System.out.println("Ingresa el lado largo del rectangulo");
                    altura = teclado.nextDouble();
                    area = base * altura;
                    System.out.println("El area del rectangulo es: " + area);
                    break;

                case 3:

                    System.out.println("Ingresa la base del triangulo");
                    base = teclado.nextDouble();
                    System.out.println("Ingresa la altura del triangulo");
                    altura = teclado.nextDouble();
                    area = (base * altura) / 2;
                    System.out.println("El  area del triangulo es: " + area);
                    break;
            }

        } while (opcion != 0);
    }
}