public class Conversiones {
    public static void main(String[] args) {
        int num = 100;
        long granNum = num;
        System.out.println(granNum);
        // esto transforma el int en un long, siempre que sea de menos a mas tamaño se puede convertir

        double decimal = 2.00003;
        long largo = (long) decimal; // 2
        int i = (int) largo; // 2
        System.out.println(largo);
        System.out.println(i);
        //esto transforma el double (decimal) e un entero, pero no redondea
        //si pasas una sola letra (char) a un numero usa el codigo ASCII

        long a = 100000000000000L;
        int b = (int) a; // le da el valor a "a" de todo lo que puede
        System.out.println(b);
        // la L del final del numero es lo que hace que se pueda convertir porque si no se desborda porque no cabe
        // de double a float se hace lo mismo pero en vez de una L se hace con una F

        //para redondear se usa Math.round(num), si quieres que se redondee para abajo, Math.floor y para arriba Math.celi
    }
}