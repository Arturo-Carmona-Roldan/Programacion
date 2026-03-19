public class Ejercicio11 {

    public static int[] botellas = new int[100];

    public static void inicializarBotellas() {
        for (int i = 0; i < botellas.length; i++) {
            botellas[i] = 0;
        }
    }

    public static void repartirImpurezas() {
        for (int i = 0; i < 50; i++) {
            int posicion = (int) (Math.random() * 100);
            botellas[posicion]++;
        }
    }

    public static void mostrarEstadoBotellas() {
        System.out.println("\n--- Estado de las botellas ---");

        for (int i = 0; i < botellas.length; i++) {
            if (botellas[i] == 0) {
                System.out.println("Botella " + i + ": Aceptada (0 impurezas)");
            } else {
                System.out.println("Botella " + i + ": Defectuosa (" + botellas[i] + " impurezas)");
            }
        }
    }

    public static void mostrarResumen() {
        int aceptadas = 0;

        for (int i = 0; i < botellas.length; i++) {
            if (botellas[i] == 0) {
                aceptadas++;
            }
        }

        System.out.println("\nBotellas aceptadas: " + aceptadas);
        System.out.println("Botellas defectuosas: " + (100 - aceptadas));
    }

    public static void main(String[] args) {
        inicializarBotellas();
        repartirImpurezas();
        mostrarEstadoBotellas();
        mostrarResumen();
    }
}
