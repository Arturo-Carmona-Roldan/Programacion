import java.util.*;

public class Matriz_Irregular {
    public static Scanner teclado = new Scanner(System.in);

    public static String[] empleados = new String[3];
    public static int[][] faltas = new int[3][];

    public static void cargar_empleados() {
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            empleados[i] = teclado.nextLine();
        }
    }

    public static void cargar_faltas() {
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("¿Cuántos días faltó " + empleados[i] + "?: ");
            int cant = teclado.nextInt();

            faltas[i] = new int[cant];

            for (int j = 0; j < cant; j++) {
                System.out.print("Día de falta " + (j + 1) + ": ");
                faltas[i][j] = teclado.nextInt();
            }
        }
    }

    public static void mostrar_faltas() {
        System.out.println("\nFaltas registradas:");
        for (int i = 0; i < empleados.length; i++) {
            System.out.print(empleados[i] + " faltó " + faltas[i].length + " día(s): ");
            for (int j = 0; j < faltas[i].length; j++) {
                System.out.print(faltas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void empleado_menos_faltas() {
        int menor = faltas[0].length;
        int indice = 0;

        for (int i = 1; i < empleados.length; i++) {
            if (faltas[i].length < menor) {
                menor = faltas[i].length;
                indice = i;
            }
        }

        System.out.println("\nEmpleado con menos faltas: " + empleados[indice] +
                " (" + menor + " día(s))");
    }

    public static void main(String[] args) {
        cargar_empleados();
        cargar_faltas();
        mostrar_faltas();
        empleado_menos_faltas();
    }
}
