package pe.edu.idat.proyecto_inventario.model;

import java.time.LocalDate;

public class LoteModel {

    private Integer idLote;
    private Integer productoId;
    private Integer cantidad;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;

    public LoteModel(){

    }

    public LoteModel(Integer idLote, Integer productoId, Integer cantidad, LocalDate fechaIngreso, LocalDate fechaSalida) {
        this.idLote = idLote;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public Integer getIdLote() {
        return idLote;
    }

    public void setIdLote(Integer idLote) {
        this.idLote = idLote;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
