package pe.edu.idat.proyecto_inventario.model;

import java.time.LocalDate;

public class UsuarioModel {
    private Integer idUsuario;
    private String nombreUsuario;
    private String correoUsuario;
    private String contrasenia;
    private String rol;
    private LocalDate fechaCreacion;

    public UsuarioModel(){

    }

    public UsuarioModel(Integer idUsuario, String nombreUsuario, String correoUsuario, String contrasenia, String rol, LocalDate fechaCreacion) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
