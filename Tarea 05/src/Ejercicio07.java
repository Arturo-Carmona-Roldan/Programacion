import java.util.*;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar = "";

        do {
            System.out.println("Introduce la referencia (2 letras mayúsculas y 4 dígitos): ");
            String referencia = teclado.nextLine();

            if (!referencia.matches("^[A-Z]{2}\\d{4}")) {
                System.out.println("Referencia inválida. Debe empezar por 2 letras mayúsculas y tener 4 números");
                continue;
            }

            System.out.println("Introduce la cantidad: ");
            String cantidad = teclado.nextLine();

            if (!cantidad.matches("^\\d+")) {
                System.out.println("Cantidad inválida. Debe ser un número entero positivo");
                continue;
            }

            System.out.println("Introduce el precio: ");
            String precio = teclado.nextLine();

            if (!precio.matches("^\\d+(\\.\\d+)?")) {
                System.out.println("Precio inválido. Debe ser un número positivo");
                continue;
            }

            System.out.println("Producto registrado correctamente.");
            System.out.println("Referencia: " + referencia);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio: " + precio + "€");
            System.out.println("-------------------------------------------");

            System.out.println("¿Desea introducir otro producto? (S/N): ");
            continuar = teclado.nextLine();

            continuar = continuar.replace(" ","");

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Registro de articulos finalizado");
    }
}
