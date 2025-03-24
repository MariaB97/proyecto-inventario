package pe.edu.idat.proyecto_inventario.model;

import java.time.LocalDate;

public class EntradasModel {
    private Integer idEntradas;
    private Integer productoId;
    private Integer proveedorId;
    private Integer cantidad;
    private LocalDate fechaEntrada;
    private Integer usuarioId;

    public EntradasModel(){

    }

    public EntradasModel(Integer idEntradas, Integer productoId, Integer proveedorId, Integer cantidad, LocalDate fechaEntrada, Integer usuarioId) {
        this.idEntradas = idEntradas;
        this.productoId = productoId;
        this.proveedorId = proveedorId;
        this.cantidad = cantidad;
        this.fechaEntrada = fechaEntrada;
        this.usuarioId = usuarioId;
    }

    public Integer getIdEntradas() {
        return idEntradas;
    }

    public void setIdEntradas(Integer idEntradas) {
        this.idEntradas = idEntradas;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public Integer getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Integer proveedorId) {
        this.proveedorId = proveedorId;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
}
