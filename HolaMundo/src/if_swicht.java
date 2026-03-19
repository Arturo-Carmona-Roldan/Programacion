public class if_swicht {
    public static void main(String[] args) {
        int tasaEstandar = 150;
        char categoriaProfesional;
        //el valor de char solo puede ser una letra y tiene que estar entre las comillas que son solo uan ('')
        if (tasaEstandar < 80)
            categoriaProfesional = 'C';
        else if (tasaEstandar < 120)
            categoriaProfesional = 'B';
        else
            categoriaProfesional = 'A';
        System.out.print("Tasa " + tasaEstandar + " euros, ");
        System.out.print("categoría " + categoriaProfesional +
                " de ");
        switch (categoriaProfesional) {
            case 'A':
                System.out.print("Socio ");
                break;
            case 'B':
                System.out.print("Senior ");
                break;
            case 'C':
                System.out.print("Junior ");
                break;
            default:
                System.out.print("¡Indefinida! ");
                //el break hacer que salte has el cierre de la llave del comando que se esta ejecutando, en este caso el switch
        }
    }
}
