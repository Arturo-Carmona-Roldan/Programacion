import java.util.Scanner;

public class Triangulo {
    public double lado1;
    public double lado2;
    public double lado3;

    public void  InicializarTriangulo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el lado 1:");
        lado1 = teclado.nextDouble();
        System.out.println("Introduce el lado 2:");
        lado2 = teclado.nextDouble();
        System.out.println("Introduce el lado 3:");
        lado3 = teclado.nextDouble();
    }

    public void LadoMayor(){
        double mayor = 0 ;
        if (lado1 > lado2 && lado1 > lado3){
            mayor = lado1;
            System.out.println("El lado mayor es el lado 1 con " + lado1 + " cm");
        }else if (lado2 > lado1 && lado2 > lado3){
            mayor = lado2;
            System.out.println("El lado mayor es el lado 2 con " + lado1 + " cm");
        }else if (lado3 > lado1 && lado3 > lado2){
            mayor = lado3;
            System.out.println("El lado mayor es el lado 3 con " + lado1 + " cm");
        }else {
            System.out.println("Los tres lados son iguales");
        }
    }

    public void Equilatero(){
        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("El triangulo es equilatero");
        }else {
            System.out.println("No es equilatero");
        }
    }

    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo();
        triangulo1.InicializarTriangulo();
        triangulo1.LadoMayor();
        triangulo1.Equilatero();
    }
}
