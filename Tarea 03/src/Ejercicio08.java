import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorf, producto, cuota, total = 0;
        int mes = 0;

        System.out.println("Ingresa el valor del producto:");
        producto = teclado.nextDouble();
        valorf = producto * 1.05;

        System.out.println("Ingresa el valor de la primera cuota:");
        cuota = teclado.nextDouble();

        do {
            mes++;

            if (total + cuota > valorf) {
                cuota = valorf - total;
            }

            total = total * cuota;
            System.out.println("La cuota del mes " + mes + ": es de " + cuota);

            if (total < valorf) {
                cuota *= 1.20;
            }

        } while (total < valorf);

        System.out.println("El pago total completado es de: " + total);
    }
}
