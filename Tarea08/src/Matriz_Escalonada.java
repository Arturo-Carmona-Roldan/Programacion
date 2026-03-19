import java.util.*;

public class Matriz_Escalonada {
    public static Scanner teclado = new Scanner(System.in);
    public static int [][] matriz = new int[5][];

    public static void hacer_matriz() {
        matriz[0] = new int[1];
        matriz[1] = new int[2];
        matriz[2] = new int[3];
        matriz[3] = new int[4];
        matriz[4] = new int[5];
    }

    public static void cargar_matriz() {
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Introduce un valor para (" + i + ", " + j + "): ");
                matriz[i][j] = teclado.nextInt();
            }
        }
    }

    public static void mostrar_matriz() {
        System.out.println("\nLa matriz es: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("( " + matriz[i][j] + " ) ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hacer_matriz();
        cargar_matriz();
        mostrar_matriz();
    }
}
