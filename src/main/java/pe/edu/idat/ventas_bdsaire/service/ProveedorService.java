package pe.edu.idat.ventas_bdsaire.service;

import pe.edu.idat.ventas_bdsaire.model.ProveedorModel;
import pe.edu.idat.ventas_bdsaire.repository.ProveedorRepository;

import java.util.List;

public class ProveedorService {
    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<ProveedorModel> obtenerProveedor(){
        return proveedorRepository.findAll();
    }

    public void guardarProveedor(ProveedorModel proveedor){
        proveedorRepository.save(proveedor);
    }
}
