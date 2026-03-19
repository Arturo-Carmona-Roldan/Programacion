import java.util.Scanner;

public class Tarea10 {
    public static void main(String[] args) {
        double neto=0, bruto = 0, horas, precio, dinero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Como te llamas");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el numero de horas");
        horas = teclado.nextDouble();
        System.out.println("Ingrese cuanto cobra la hora");
        precio = teclado.nextDouble();
        dinero = horas * precio;

        if (horas < 36) {
            bruto = dinero;
        } else if (horas >= 36) {
            bruto = 35 * precio + ((horas - 35) * (precio * 1.25));
        }

        if (bruto <= 50) {
            neto = bruto;
        } else if (bruto > 50 && bruto <= 90) {
            neto = 50 + ((bruto - 50) * 0.75);
        } else if (bruto > 90) {
            neto = 80 + ((bruto - 90) * 0.55);
        }
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario antes de aplicar los impuestos: " + bruto);
        System.out.println("Salario neto: " + neto);
    }
}
