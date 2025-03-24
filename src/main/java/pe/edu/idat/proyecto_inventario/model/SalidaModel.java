package pe.edu.idat.proyecto_inventario.model;

import java.time.LocalDate;

public class SalidaModel {

    private Integer idSalida;
    private Integer productoId;
    private Integer cantidad;
    private LocalDate fechaSalida;
    private  String motivo;
    private Integer usuarioId;

    public SalidaModel(){

    }

    public SalidaModel(Integer idSalida, Integer productoId, Integer cantidad, LocalDate fechaSalida, String motivo, Integer usuarioId) {
        this.idSalida = idSalida;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.fechaSalida = fechaSalida;
        this.motivo = motivo;
        this.usuarioId = usuarioId;
    }

    public Integer getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(Integer idSalida) {
        this.idSalida = idSalida;
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

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
}
