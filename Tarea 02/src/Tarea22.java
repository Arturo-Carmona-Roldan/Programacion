import java.util.Scanner;

public class Tarea22 {
    public static void main(String[] args) {
        Scanner tecclado = new Scanner(System.in);
        double salario1, salario2, aumento;
        int anyos;

        System.out.println("Ingresa el salario");
        salario1 = tecclado.nextDouble();

        System.out.println("Ingresa los años de antigüedad");
        anyos = tecclado.nextInt();

        if (salario1 < 300 && anyos >= 10) {
            aumento = 20;
            salario2 = salario1 * (1 + aumento / 100);
            System.out.printf("El salario aumenta hasta los " + salario2 + "€");
        } else if (salario1 < 300 && anyos < 10) {
            aumento = 5;
            salario2 = salario1 * (1 + aumento / 100);
            System.out.println("El salario aumenta hasta los " + salario2 + "€");
        } else if (salario1 >= 300) {
            salario2 = salario1;
            System.out.println("EL salario es de " + salario2 + "€");
        }
    }
}

