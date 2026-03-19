import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int max, min, sum = 0, iguales = 0, fuera = 0, n;

        do {
            System.out.println("Ingresa el valor mínimo");
            min = teclado.nextInt();
            System.out.println("Ingresa el valor máximo");
            max = teclado.nextInt();
            if (max < min) {
                System.out.println("El valor mínimo no puede ser mayor que el valor máximo");
            }
        } while (max < min);

        do {
            System.out.println("Introduce un numero");
            n = teclado.nextInt();
            sum = sum + n;
            if (n > max || n < min) {
                fuera++;
            }
            if (n == max || n == min) {
                iguales++;
            }

        } while (n != 0);
        System.out.println("Hay " + fuera + " números fuera de los intervalos");
        System.out.println("Hay " + iguales + " números iguales a los límites de los intervalos");
        System.out.println("El total de la suma de los números es: " + sum);
    }
}
