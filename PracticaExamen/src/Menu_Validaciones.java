import java.util.Scanner;

public class Menu_Validaciones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        // MENÚ
        System.out.println("=== MENU ===");
        System.out.println("1. Ingresar un número");
        System.out.println("2. Ingresar letras/frase");
        System.out.print("Elige una opción: ");

        // Validar que la opción sea un número
        while (!sc.hasNextInt()) {
            System.out.println("Error: ingresa un número válido (1 o 2).");
            sc.next(); // limpieza
        }
        opcion = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea

        // EJECUTAR SEGÚN OPCIÓN
        switch (opcion) {

            case 1:
                // VALIDAR ENTERO
                System.out.print("Introduce un número: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error: eso no es un número. Intenta otra vez.");
                    sc.next(); // tirar texto inválido
                }
                int numero = sc.nextInt();
                System.out.println("Número ingresado correctamente: " + numero);
                break;

            case 2:
                // VALIDAR SOLO LETRAS O FRASE (permitimos espacios)
                System.out.print("Introduce texto solo con letras y espacios: ");
                String texto = sc.nextLine();

                while (!texto.matches("[a-zA-Z ]+")) {
                    System.out.println("Error: solo se permiten letras y espacios. Intenta nuevamente:");
                    texto = sc.nextLine();
                }

                System.out.println("Texto ingresado correctamente: " + texto);
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}
//Scanner sc = new Scanner(System.in);
//
//System.out.print("Introduce un texto SIN números: ");
//String texto = sc.nextLine();
//
//while (!texto.matches("^[^0-9]+$")) {
//    System.out.println("Error: no se permiten números. Intenta de nuevo:");
//    texto = sc.nextLine();
//}
//System.out.println("Texto válido: " + texto);

//(int)(Math.random() * (MAX - MIN + 1)) + MIN
//int aleatorio2 = (int)(Math.random() * 7) + 6;
//System.out.println("Número aleatorio entre 6 y 12: " + aleatorio2);