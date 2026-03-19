import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        double x, y, resultado;

        do {
            System.out.println("1. Sumar dos números");
            System.out.println("2. Multiplicar 2 números");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opcion");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Ingresa el primer número");
                    x = teclado.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    y = teclado.nextDouble();
                    resultado = x + y;
                    System.out.println("El resultado es: " + resultado);
                    System.out.println();
                    break;

                case 2:

                    System.out.println("Ingresa el primer número");
                    x = teclado.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    y = teclado.nextDouble();
                    resultado = x * y;
                    System.out.println("El resultado es: " + resultado);
                    System.out.println();
                    break;
            }

        } while (opcion != 0);
    }
}
