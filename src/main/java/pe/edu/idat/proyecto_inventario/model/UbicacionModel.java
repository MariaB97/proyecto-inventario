package pe.edu.idat.proyecto_inventario.model;

public class UbicacionModel {

    private Integer idUbicacion;
    private String nombreUbicacion;
    private String descripcionUbicacion;
    private String direccionUbicacion;

    public UbicacionModel(){

    }

    public UbicacionModel(Integer idUbicacion, String nombreUbicacion, String descripcionUbicacion, String direccionUbicacion) {
        this.idUbicacion = idUbicacion;
        this.nombreUbicacion = nombreUbicacion;
        this.descripcionUbicacion = descripcionUbicacion;
        this.direccionUbicacion = direccionUbicacion;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getNombreUbicacion() {
        return nombreUbicacion;
    }

    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }

    public String getDescripcionUbicacion() {
        return descripcionUbicacion;
    }

    public void setDescripcionUbicacion(String descripcionUbicacion) {
        this.descripcionUbicacion = descripcionUbicacion;
    }

    public String getDireccionUbicacion() {
        return direccionUbicacion;
    }

    public void setDireccionUbicacion(String direccionUbicacion) {
        this.direccionUbicacion = direccionUbicacion;
    }
}
