package pe.edu.idat.proyecto_inventario.model;

public class ProductoModel {

    private Integer idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private Double precioProducto;
    private Integer cantidadProducto;
    private Integer categoriaId;
    private Integer proveedorId;
    private Integer ubicacionId;

    public ProductoModel(){

    }

    public ProductoModel(Integer idProducto, String nombreProducto, String descripcionProducto, Double precioProducto, Integer cantidadProducto, Integer categoriaId, Integer proveedorId, Integer ubicacionId) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
        this.categoriaId = categoriaId;
        this.proveedorId = proveedorId;
        this.ubicacionId = ubicacionId;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Integer getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Integer proveedorId) {
        this.proveedorId = proveedorId;
    }

    public Integer getUbicacionId() {
        return ubicacionId;
    }

    public void setUbicacionId(Integer ubicacionId) {
        this.ubicacionId = ubicacionId;
    }
}
