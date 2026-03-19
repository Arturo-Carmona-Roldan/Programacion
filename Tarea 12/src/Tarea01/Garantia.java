package Tarea01;

public class Garantia extends Ordenador{
    private String fecha_compra;

    public Garantia(String codigo_reparacion, String codigo_cliente, String descripcion_averia, String fecha_compra) {
        super(codigo_reparacion, codigo_cliente, descripcion_averia);
        this.fecha_compra = fecha_compra;
    }
}
