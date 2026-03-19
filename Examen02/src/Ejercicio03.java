import java.util.Scanner;

public class Ejercicio03 {
    public static Scanner teclado = new Scanner(System.in);
    public static int[][] matriz = new int[10][10];
    public static int[][] aux = new int[10][10];
    public static int[][] sumas = new int[10][10];

    public static void CargarMatriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public static void MostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("( " + matriz[i][j] + " ) ");
            }
            System.out.println();
        }
    }

    public static void Alrededor() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == 0 && j == 0) {
                    sumas[i][j] += matriz[i][j + 1] + matriz[i + 1][j] + matriz[i + 1][j + 1];
                } else if (j == 0 && i < 9) {
                    sumas[i][j] += matriz[i - 1][j] + matriz[i + 1][j] + matriz[i][j + 1] + matriz[i + 1][j + 1] + matriz[i - 1][j + 1];
                } else if (i == 0 && j < 9) {
                    sumas[i][j] += matriz[i][j - 1] + matriz[i][j + 1] + matriz[i + 1][j + 1] + matriz[i + 1][j - 1] + matriz[i + 1][j];
                } else if (i == 9 && j == 0) {
                    sumas[i][j] += matriz[i - 1][j] + matriz[i - 1][j + 1] + matriz[i][j + 1];
                } else if (i == 9 && j < 9) {
                    sumas[i][j] += matriz[i - 1][j] + matriz[i - 1][j + 1] + matriz[i - 1][j - 1] + matriz[i][j - 1] + matriz[i][j + 1];
                } else if (i == 0 && j == 9) {
                    sumas[i][j] += matriz[i][j - 1] + matriz[i + 1][j - 1] + matriz[i + 1][j];
                } else if (i > 0 && i < 9 && j == 9) {
                    sumas[i][j] += matriz[i][j - 1] + matriz[i - 1][j - 1] + matriz[i - 1][j] + matriz[i + 1][j] + matriz[i + 1][j - 1];
                } else if (i == 9 && j == 9) {
                    sumas[i][j] += matriz[i - 1][j] + matriz[i - 1][j - 1] + matriz[i][j - 1];
                } else {
                    sumas[i][j] += matriz[i - 1][j - 1] + matriz[i - 1][j] + matriz[i - 1][j + 1] + matriz[i][j - 1] + matriz[i][j + 1] + matriz[i + 1][j - 1] + matriz[i + 1][j] + matriz[i + 1][j + 1];
                }

            }
        }
    }

    public static void Supervivencia() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == 1) {
                    if (sumas[i][j] == 2 || sumas[i][j] == 3) {
                        aux[i][j] = 1;
                    }
                }
            }
        }
    }

    public static void MuerteSoledad() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == 1) {
                    if (sumas[i][j] < 2) {
                        aux[i][j] = 0;
                    }
                }
            }
        }
    }

    public static void MuerteSobrepoblacion() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == 1) {
                    if (sumas[i][j] > 3) {
                        aux[i][j] = 0;
                    }
                }
            }
        }
    }

    public static void Nacimiento() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == 0) {
                    if (sumas[i][j] == 3) {
                        aux[i][j] = 1;
                    }
                }
            }
        }
    }

    public static void MostrarAux() {
        System.out.println();
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[0].length; j++) {
                System.out.print("( " + aux[i][j] + " ) ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CargarMatriz();
        MostrarMatriz();
        Alrededor();
        Supervivencia();
        MuerteSoledad();
        MuerteSobrepoblacion();
        Nacimiento();
        MostrarAux();

        do {
            System.out.println("\n¿Quieres generar otra nueva generación? (si o no)");
            teclado.nextLine();

            if (teclado.nextLine().equalsIgnoreCase("Si")) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        sumas[i][j] = 0;
                        matriz[i][j] = aux[i][j];
                    }
                }
            }
            MostrarMatriz();
            Alrededor();
            Supervivencia();
            MuerteSoledad();
            MuerteSobrepoblacion();
            Nacimiento();
            MostrarAux();

        } while (teclado.nextLine().equalsIgnoreCase("Si"));
    }
}