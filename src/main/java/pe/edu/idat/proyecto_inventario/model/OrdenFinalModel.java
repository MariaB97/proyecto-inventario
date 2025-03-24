package pe.edu.idat.proyecto_inventario.model;

import java.time.LocalDate;

public class OrdenFinalModel {
    private  Integer idOrdenFinal;
    private Integer clienteId;
    private LocalDate fechaOrdenFinal;
    private String estadoOrdenFinal;
    private Double totalOrdenFinal;

    public OrdenFinalModel(){

    }

    public OrdenFinalModel(Integer idOrdenFinal, Integer clienteId, LocalDate fechaOrdenFinal, String estadoOrdenFinal, Double totalOrdenFinal) {
        this.idOrdenFinal = idOrdenFinal;
        this.clienteId = clienteId;
        this.fechaOrdenFinal = fechaOrdenFinal;
        this.estadoOrdenFinal = estadoOrdenFinal;
        this.totalOrdenFinal = totalOrdenFinal;
    }

    public Integer getIdOrdenFinal() {
        return idOrdenFinal;
    }

    public void setIdOrdenFinal(Integer idOrdenFinal) {
        this.idOrdenFinal = idOrdenFinal;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getFechaOrdenFinal() {
        return fechaOrdenFinal;
    }

    public void setFechaOrdenFinal(LocalDate fechaOrdenFinal) {
        this.fechaOrdenFinal = fechaOrdenFinal;
    }

    public String getEstadoOrdenFinal() {
        return estadoOrdenFinal;
    }

    public void setEstadoOrdenFinal(String estadoOrdenFinal) {
        this.estadoOrdenFinal = estadoOrdenFinal;
    }

    public Double getTotalOrdenFinal() {
        return totalOrdenFinal;
    }

    public void setTotalOrdenFinal(Double totalOrdenFinal) {
        this.totalOrdenFinal = totalOrdenFinal;
    }
}
