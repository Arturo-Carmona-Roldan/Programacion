import java.util.*;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int  tarifabase, recargo;
        double peso = 0,precio;
        String zona;

        do {
            System.out.println("Introduce el peso en kilogramos del paquete:");

            if (!teclado.hasNextDouble()) {
                System.out.println("Los kilogramos tienen que ser un número");
                teclado.nextLine();
                continue;
            }

            peso = teclado.nextDouble();

            if (peso <= 0) {
                System.out.println("El peso debe ser mayor que 0");
            }

            } while (peso <= 0);

            if (peso <= 1) {
            tarifabase = 5;
        } else if (peso > 1 && peso <= 5) {
            tarifabase = 10;
        } else if (peso > 5 && peso <= 10) {
            tarifabase = 15;
        } else {
            tarifabase = 20;
        }

        System.out.println();
        teclado.nextLine();
        do {
            System.out.println("Introduce la zona del envio");
            zona = teclado.nextLine();
            zona = zona.toUpperCase();

            if (!zona.equals("A") && !zona.equals("B") && !zona.equals("C") && !zona.equals("D")) {
                System.out.println("La zona solo puede ser A,B,C o D");
            }

        } while (!zona.equals("A") && !zona.equals("B") && !zona.equals("C") && !zona.equals("D"));

        if (zona.equals("A")) {
            recargo = 0;
        } else if (zona.equals("B")) {
            recargo = 3;
        } else if (zona.equals("C")) {
            recargo = 7;
        } else {
            recargo = 15;
        }

        precio = tarifabase + recargo;

        if (peso > 8 && (zona.equals("C") || zona.equals("D"))) {
            precio = precio * 0.9;
        }


        System.out.print("El precio total del envio es: " );
        System.out.printf("%.2f", precio);
        System.out.print("€");

    }
}



