package pe.edu.idat.proyecto_inventario.model;

public class ProveedorModel {
    private Integer idProveedor;
    private String nombreProveedor;
    private String telefonoProveedor;
    private String correoProveedor;


    public ProveedorModel(){

    }

    public ProveedorModel(Integer idProveedor, String nombreProveedor, String telefonoProveedor, String correoProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.correoProveedor = correoProveedor;
    }

    public String getCorreoProveedor() {
        return correoProveedor;
    }

    public void setCorreoProveedor(String correoProveedor) {
        this.correoProveedor = correoProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
}
