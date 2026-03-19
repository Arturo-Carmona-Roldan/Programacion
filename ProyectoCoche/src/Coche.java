public class Coche {
    private static int kilometrajeTotal = 0;
    private String marca;
    private String modelo;
    private int kilometraje;

    public static int getKilometrajeTotal() {
        return kilometrajeTotal;
    }

    public Coche(String ma, String mo) {
        marca = ma;
        modelo = mo;
        kilometraje = 0;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void recorre(int km) {
        kilometraje += km;
        kilometrajeTotal += km;
    }

    public static void main(String[] args) {
        Coche cocheDeCarmen = new Coche("Saab", "93");
        Coche cocheDeSergio = new Coche("Toyota", "Avensis");
        cocheDeCarmen.recorre(30);
        cocheDeCarmen.recorre(40);
        cocheDeCarmen.recorre(220);
        cocheDeSergio.recorre(60);
        cocheDeSergio.recorre(150);
        cocheDeSergio.recorre(90);
        System.out.println("Carmen ha recorrido: " + cocheDeCarmen.getKilometraje() + " Km");
        System.out.println("Sergio ha recorrido " + cocheDeSergio.getKilometraje() + " Km");
        System.out.println("El kilometraje total ha sido de " + Coche.getKilometrajeTotal() + "Km");
    }
}

