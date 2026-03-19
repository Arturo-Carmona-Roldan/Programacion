public class Ejercicio03 {
    public static void main(String[] args) {
        int n = 0;


        while (n <= 999) {
            for (int centena = 0; centena < 10; centena++) {
                System.out.println("x-x-x");
                for (int decena = 0; decena < 10; decena++) {
                    for (int unidad = 0; unidad < 10; unidad++) {
                        n++;
                        System.out.println(centena + "-" + decena + "-" + unidad);

                    }
                }
            }
        }
    }
}

