package pe.edu.idat.ventas_bdsaire.service;

import pe.edu.idat.ventas_bdsaire.model.UbicacionModel;
import pe.edu.idat.ventas_bdsaire.repository.UbicacionRepository;

import java.util.List;

public class UbicacionService {
    private final UbicacionRepository ubicacionRepository;

    public UbicacionService(UbicacionRepository ubicacionRepository) {
        this.ubicacionRepository = ubicacionRepository;
    }

    public List<UbicacionModel> obtenerUbicacion(){
        return ubicacionRepository.findAll();
    }

    public void guardarUbicacion(UbicacionModel ubicacion){
        ubicacionRepository.save(ubicacion);
    }
}
