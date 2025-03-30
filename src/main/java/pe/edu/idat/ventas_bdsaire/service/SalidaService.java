package pe.edu.idat.ventas_bdsaire.service;

import pe.edu.idat.ventas_bdsaire.model.SalidaModel;
import pe.edu.idat.ventas_bdsaire.repository.SalidaRepository;

import java.util.List;

public class SalidaService {
    private final SalidaRepository salidaRepository;

    public SalidaService(SalidaRepository salidaRepository) {
        this.salidaRepository = salidaRepository;
    }

    public List<SalidaModel> obtenerSalida(){
        return salidaRepository.findAll();
    }

    public void guardarSalida(SalidaModel salida){
        salidaRepository.save(salida);
    }
}
