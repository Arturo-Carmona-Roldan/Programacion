import java.util.Arrays;

public class Suma_Filas_Columnas {
    public static int [][] matriz = new int [3][4];
    public static int [] sumafilas = new int [3];
    public static int [] sumacolumnas = new int [4];

    public static void cargarmatriz(){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = (int) ((Math.random() * 39 ) + 2);
            }
        }
    }

    public static void mostrar_matriz(){
        System.out.println("La matriz es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("( " + matriz[i][j] + " ) ");
            }
            System.out.println();
        }
    }

    public static void suma_filas(){
        for(int i = 0; i < matriz.length; i++){
            int suma = 0;
            for(int j = 0; j < matriz[0].length; j++){
                suma += matriz[i][j];
            }
            sumafilas[i] += suma;
        }
        System.out.print("\nLa suma de las filas es: ");
        System.out.println(Arrays.toString(sumafilas));
    }

    public static void suma_columnas(){
        for(int i = 0; i < matriz[0].length; i++){
            int suma = 0;
            for(int j = 0; j < matriz.length; j++){
                suma += matriz[j][i];
            }
            sumacolumnas[i] += suma;
        }
        System.out.print("\nLa suma de las columnas es: ");
        System.out.println(Arrays.toString(sumacolumnas));
    }

    public static void main(String[] args) {
        cargarmatriz();
        mostrar_matriz();
        suma_filas();
        suma_columnas();
    }
}
