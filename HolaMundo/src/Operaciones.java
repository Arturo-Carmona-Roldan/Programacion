public class Operaciones {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        y = x++;
        //si el ++ va antes de la x es un pre incremento y se opera antes de pasar a la siguiente instruccion
        //si el ++ va despues de la x es un post incremento y se opera despues de la instruccion
        /*para meter un double(decimal) en un int(entero) como son distinntos tipos hay que dejar claro que el double
        se transforma en int asi:
        double x=24.5
        int y=0
        y= (int)x
        y asi se hace un redondeo que transforma la x en un numero entero
        */
        System.out.println("y vale " + y);
        System.out.println("x vale " + x);
    }
}
