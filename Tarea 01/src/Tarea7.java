import java.util.Scanner;
public class Tarea7 {
    public static void main(String[] args) {
        int horas;
        double salario_hora;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero de horas trabajadas: ");
        horas = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Ingrese el precio por hora trabajada: ");
        salario_hora = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Tieses que cobrar: " + (horas*salario_hora) + "€");
    }
}
