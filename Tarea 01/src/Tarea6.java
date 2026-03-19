import java.util.Scanner;

public class Tarea6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base, porcentaje, IVA;

        System.out.println("Ingrese el valor de la base imponible: ");
        base = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Ingrese el porcentaje de descuento: ");
        porcentaje = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Ingrese el tipo de IVA a aplicar");
        IVA = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("La base imponible es: " + base + " €");
        System.out.println("El porcentaje de descuento es: " + porcentaje + " %");
        System.out.println("El IVA a aplicar es: " + IVA + " %");
        System.out.println("El total de la factura es de: " + (((base * ((100 - porcentaje) / 100)) + ((base * ((100 - porcentaje) / 100)) *  IVA / 100))) + " 100€");

    }
}
