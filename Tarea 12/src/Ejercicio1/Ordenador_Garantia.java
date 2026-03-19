package Ejercicio1;

import java.time.LocalDate;
public class Ordenador_Garantia extends Ordenador {
 private LocalDate fecha_compra;
 public Ordenador_Garantia(String cod_rep, String cod_cli, String descripcion, LocalDate fecha_compra) {
 super(cod_rep, cod_cli, descripcion);
 this.fecha_compra = fecha_compra;
 }
 @Override
 public String toString() {
 return "Ordenador_Garantia{" +
 "fecha_compra=" + fecha_compra +
 ", cod_rep='" + cod_rep + '\'' +
 ", cod_cli='" + cod_cli + '\'' +
 ", descripcion='" + descripcion + '\'' +
 ", presupuesto=" + presupuesto +
 ", estado=" + estado +
 '}';
 }
 public Ordenador_Garantia(String cod_rep, String cod_cli, String descripcion) {
 super(cod_rep, cod_cli, descripcion);
 }
 public LocalDate getFecha_compra() {
 return fecha_compra;
 }
 public void setFecha_compra(LocalDate fecha) {
 this.fecha_compra = fecha;
 }
}