import java.util.Scanner;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Categoria categoria = new Categoria();

        int opcion = 0;

        do {
            System.out.println();
            System.out.println("\n--- MENU PROFESORES ---");
            System.out.println("1. Añadir profesor");
            System.out.println("2. Cantidad de interinos");
            System.out.println("3. Calculo de la nomina");
            System.out.println("4. Lista profesores");
            System.out.println("6. Introduccion de asignaturas a un profesor");
            System.out.println("7. Consulta asignaturas");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                /* me da error en la entrada de datos de algun profesor por lo que no puedo acceder a los datos de ninguno,
                  como el resto de metodos trabajan con los datos introducidos aqui da un error de que la lista de profesores esta vacia*/
                case 1:
                    System.out.println("Introduce el nombre del profesor:");
                    String nombre = sc.nextLine();
                    System.out.println("Fecha de nacimiento (dd/MM/yyyy):");
                    String fechaTexto = sc.nextLine();
                    LocalDate fecha = LocalDate.parse(fechaTexto, formato);
                    System.out.println("Introduce el codigo de profesor");
                    int codprof = sc.nextInt();

                    System.out.println("Introduce el codigo de la categoria: ");
                    int codcat = sc.nextInt();

                    System.out.println("¿Es interino? (s/n):");
                    String resp = sc.nextLine();

                    if (resp.equalsIgnoreCase("s")) {
                        System.out.println("Introduce la fecha de inicio:");
                        String fechaInicio = sc.nextLine();
                        LocalDate inicio = LocalDate.parse(fechaInicio, formato);
                        categoria.nuevoProfesor(new Profesorinterino(nombre, fecha, codprof, codcat, inicio));
                    } else {
                        categoria.nuevoProfesor(new Profesor(nombre, fecha, codprof, codcat));
                    }
                    break;

                case 2:
                    System.out.println("Número de profesores Interinos: " + categoria.contarProfesores());
                    break;

                case 3:
                    System.out.println("Introduce el codigo del profesor");
                    int codigoprofesor = sc.nextInt();
                    System.out.println("Introduce el codigo del la categoria: ");
                    int codigocategoria = sc.nextInt();

                    categoria.Salario(codigoprofesor, codigocategoria);

                    System.out.println("El salario es: ");

                case 4:
                    categoria.listadoPorNombre();
                    break;

                case 5:

                case 6:
                    System.out.println("Introduce el codigo de profesor");
                    int codigoprof = sc.nextInt();
                    categoria.mapa(codigoprof);
                    break;

                case 7:
                    System.out.println("Introduce el codigo del profesor que quieres buscar");
                    int codigopro = sc.nextInt();
                    categoria.vermapa(codigopro);
                    break;
            }

        } while (opcion != 0);
    }
}

