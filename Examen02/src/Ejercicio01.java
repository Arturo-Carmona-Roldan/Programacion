import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {
        int[] vector = new int[30];
        int[] aux = new int[10];
        int mayor = 0, x = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < aux.length; i++) {
            aux[i] = 0;
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                aux[0] = aux[0] + 1;
            } else if (vector[i] == 1) {
                aux[1] = aux[1] + 1;
            } else if (vector[i] == 2) {
                aux[2] = aux[2] + 1;
            } else if (vector[i] == 3) {
                aux[3] = aux[3] + 1;
            } else if (vector[i] == 4) {
                aux[4] = aux[4] + 1;
            } else if (vector[i] == 5) {
                aux[5] = aux[5] + 1;
            } else if (vector[i] == 6) {
                aux[6] = aux[6] + 1;
            } else if (vector[i] == 7) {
                aux[7] = aux[7] + 1;
            } else if (vector[i] == 8) {
                aux[8] = aux[8] + 1;
            } else if (vector[i] == 9) {
                aux[9] = aux[9] + 1;
            }
        }

        for (int i = 0; i < aux.length; i++) {
            if (mayor < aux[i]) {
                mayor = aux[i];
                x = i;
            }
        }

        System.out.println("El vector es: " + Arrays.toString(vector));
        System.out.println(Arrays.toString(aux));
        System.out.println("El numero que más se repite, se repite " + mayor + " veces y es el " + x);
    }
}
//else if (aux[i] == mayor){
//               int y = i;
//               int mayor2 = aux[i];
//            }