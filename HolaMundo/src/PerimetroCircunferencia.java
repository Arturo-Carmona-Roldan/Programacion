//este programa va a calcular el perimetro de ua circunferencia segun su radio
public class PerimetroCircunferencia {
    public static void main(String[] args) {
        //vamos a darle los valores a las constantes
        final double PI = 3.141592;
        /*
        Si una variable es final significa que no puede variar despues,
         si solo es doble es un numero decimal que si puede variar
        */
        double radio = 25.0;
        double perimetro;
        perimetro = 2 * PI * radio;
        System.out.print("El perimetro de la circunferencia de radio ");
        System.out.print(radio);
        System.out.print(" es ");
        System.out.print(perimetro);
        /* si ponemos todo junto con un mas podemos ponerlo todo en una sola linea
        asi:  System.out.print("El perimetro de la circunferencia de radio " + radio + " es " +  perimetro); */
             }
}
