import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        double radio, longitud;
        int n;

        System.out.print("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Hola " + nombre);

        System.out.println("Ingrese el radio: ");
        radio = teclado.nextDouble();
        longitud = 2 * Math.PI * radio;
        //math.pi escribe automaticamente el numero pi (3.141592...)
        System.out.println("La longitud es: " + longitud);

        System.out.println("Ingresa un numero: ");
        n = teclado.nextInt();
        System.out.println("El cuadrado del numero es: " + Math.pow(n,2));
        //Math.pow eleva el primero numero (base) al segundo (exponente) siendo en este caso n (el primero) elevado a 2 (el segundo)
        //la funcion math devuelve un numero con decimales
        System.out.println("El cuadrado es: " + n*n);
        //el cuadrado tambien se puede hacer poniendo n*n dentro del mensaje
    }
}
