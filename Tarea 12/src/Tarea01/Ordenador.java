package Tarea01;

public class Ordenador {
    protected String codigo_reparacion, codigo_cliente , descripcion_averia;

    public Ordenador(String codigo_reparacion, String codigo_cliente, String descripcion_averia) {
        this.codigo_reparacion = codigo_reparacion;
        this.codigo_cliente = codigo_cliente;
        this.descripcion_averia = descripcion_averia;
    }
}
