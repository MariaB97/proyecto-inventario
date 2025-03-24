package pe.edu.idat.proyecto_inventario.model;

public class ClienteModel {
    private String idCliente;
    private String nombreCliente;
    private String correoCliente;
    private String telefonoCliente;
    private String direccionCliente;

    public  ClienteModel() {
    }

    public ClienteModel(String idCliente, String nombreCliente, String correoCliente, String telefonoCliente, String direccionCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.telefonoCliente = telefonoCliente;
        this.direccionCliente = direccionCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
}
