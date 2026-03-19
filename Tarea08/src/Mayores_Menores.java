public class Mayores_Menores {
    public static int[][] matriz = new int[5][3];

    public static void cargar_matriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 31) + 20;
            }
        }
    }

    public static void imprimir_matriz() {
        System.out.println("La matriz es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("( " + matriz[i][j] + " ) ");
            }
            System.out.println();
        }
    }

    public static void mostrar_menores() {

        System.out.println("\nLos menores de cada fila son: ");
        for (int i = 0; i < matriz.length; i++) {
            int menor = 51;
            for (int j = 0; j < matriz[0].length; j++) {
                if (menor > matriz[i][j]) {
                    menor = matriz[i][j];
                }
            }
            System.out.println(menor);
        }
    }

    public static void mostras_mayores() {
        System.out.println("\nLos mayores de cada columna son: ");
        for (int i = 0; i < matriz[0].length; i++) {
            int mayor = 19;
            for (int j = 0; j < matriz.length; j++) {
                if (mayor < matriz[j][i]){
                    mayor = matriz[j][i];
                }
            }
            System.out.println(mayor);
        }
    }

    public static void main(String[] args) {
        cargar_matriz();
        imprimir_matriz();
        mostrar_menores();
        mostras_mayores();
    }
}