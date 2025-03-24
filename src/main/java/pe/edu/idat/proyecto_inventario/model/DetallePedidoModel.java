package pe.edu.idat.proyecto_inventario.model;

public class DetallePedidoModel {
    private Integer idDetallePedido;
    private Integer productoId;
    private Integer cantidad;
    private Double precio;
    private Double subtotal;

    public DetallePedidoModel(){

    }

    public DetallePedidoModel(Integer idDetallePedido, Integer productoId, Integer cantidad, Double precio, Double subtotal) {
        this.idDetallePedido = idDetallePedido;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }

    public Integer getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(Integer idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}
