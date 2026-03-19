import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Sout_Matriz {
    public static int [][] matriz = new int [2][5];
    public static Scanner teclado = new Scanner(System.in);

    public static void cargarMatriz() {
        for (int i = 0; i < matriz[0].length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                do {
                    System.out.println("Introduce un número entero");
                    if (!teclado.hasNextInt()){
                        System.out.println("Error, tiene que ser un número entero");
                        teclado.nextLine();
                    }
                }while (!teclado.hasNextInt());
                matriz[j][i] = teclado.nextInt();

            }
        }
    }

    public static void mostrarMatriz() {
        System.out.println("La matriz es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("( " + matriz[i][j] + " ) ");
            }

            System.out.println();
        }
    }
// si pones System.out.println(Array.deepToString(nombre de la matriz));

    public static void main(String[] args) {
         cargarMatriz();
         mostrarMatriz();
     }
}
