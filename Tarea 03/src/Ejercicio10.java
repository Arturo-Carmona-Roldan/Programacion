import java.util.concurrent.TimeUnit;

public class Ejercicio10 {
    public static void main(String args[]) throws InterruptedException {
        int n=1;

        while (n>0) {
            for (int hora = 0; hora < 24; hora++) {
                for (int minuto = 0; minuto < 60; minuto++) {
                    for (int segundo = 0; segundo < 60; segundo++) {
                        System.out.printf("%02d:%02d:%02d", hora, minuto, segundo);

                        TimeUnit.SECONDS.sleep(1);
                        System.out.print("\b\b\b\b\b\b\b\b");
                    }
                }
            }
        }
    }
}
