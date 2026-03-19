import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el código del producto");
        String codigo = teclado.nextLine();

        if (codigo.matches("^[A-Z]{2}\\-\\d{5}[A-Z]?")){
            System.out.println("El código del producto es valido");
        }else{
            System.out.println("El codigo del producto tiene que empezar por 2 letras mayúsculas, un guion y tener 5 dígitos (puede tener una letra mayúscula al final)");
        }


    }
}
