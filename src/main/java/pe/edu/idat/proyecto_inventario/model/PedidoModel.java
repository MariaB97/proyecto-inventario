package pe.edu.idat.proyecto_inventario.model;

import java.time.LocalDate;

public class PedidoModel {

    private Integer idPedido;
    private Integer ordenFinalId;
    private Integer clienteId;
    private LocalDate fecha;

    public PedidoModel(){

    }

    public PedidoModel(Integer idPedido, Integer ordenFinalId, Integer clienteId, LocalDate fecha) {
        this.idPedido = idPedido;
        this.ordenFinalId = ordenFinalId;
        this.clienteId = clienteId;
        this.fecha = fecha;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getOrdenFinalId() {
        return ordenFinalId;
    }

    public void setOrdenFinalId(Integer ordenFinalId) {
        this.ordenFinalId = ordenFinalId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
