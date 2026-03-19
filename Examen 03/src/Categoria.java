import java.util.*;

public class Categoria {

    private int codcat;
    private double sueldobase;
    private int porcentajeretencion;

    public ArrayList<Profesor> Profesorado;
    public ArrayList<Categoria> Categorias;

    HashMap<Integer, String> mapa = new HashMap<>();


    public Categoria(int codcat, double sueldobase, int porcentajeretencion) {
        this.codcat = codcat;
        this.sueldobase = sueldobase;
        this.porcentajeretencion = porcentajeretencion;
        Profesorado = new ArrayList<Profesor>();
        Categorias = new ArrayList<Categoria>();
        Categorias.add(new Categoria(1, 1000, 17));

    }

    public Categoria() {

    }

    public int getCodcat() {
        return codcat;
    }

    public double getSueldobase() {
        return sueldobase;
    }

    public int getPorcentajeretencion() {
        return porcentajeretencion;
    }


    public void nuevoProfesor(Profesor p) {
        Profesorado.add(p);
        System.out.println("Se ha añadido el nuevo profesor");
    }

    public int contarProfesores() {
        int cont = 0;
        for (Profesor i : Profesorado) {
            if (i instanceof Profesorinterino) cont++;
        }
        return cont;
    }

    public double Salario(int codcat, int codpro) {
        double salario = 0;
        for (Profesor p : Profesorado) {
            if (p.getCodpro() == (codpro) && p.getCodcat() == (codcat)) {

                salario = getSueldobase() * (getPorcentajeretencion() / 100);
            }
            System.out.println(salario);
        }


        return salario;
    }

    public void listadoPorNombre() {
        Collections.sort(Profesorado, Comparator.comparing(Profesor::getNombre));

        for (Profesor p : Profesorado) {
            System.out.println(p);
        }
    }

    public void mapa(int i) {
        Scanner sc = new Scanner(System.in);

        Integer codpro = i;
        System.out.println("Introduce las siglas de las 3 asignaturas que imparte");
        String siglas = sc.nextLine();

        mapa.put(codpro, siglas);


    }

    public void vermapa(int codigopro) {
        for (Profesor p : Profesorado) {
            if (p.getCodpro() == codigopro) {
                System.out.println(p.getNombre() + ": " + mapa.values().toArray()[p.getCodpro()]);
            }
        }

    }
}









