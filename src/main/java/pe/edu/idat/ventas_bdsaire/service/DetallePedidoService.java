package pe.edu.idat.ventas_bdsaire.service;

import pe.edu.idat.ventas_bdsaire.model.DetallePedidoModel;
import pe.edu.idat.ventas_bdsaire.repository.DetallePedidoRepository;

import java.util.List;

public class DetallePedidoService {
    private final DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoService(DetallePedidoRepository detallePedidoRepository) {
        this.detallePedidoRepository = detallePedidoRepository;
    }

    public List<DetallePedidoModel> obtenerDetallePedido(){
        return detallePedidoRepository.findAll();
    }

    public void guardarDetallePedido(DetallePedidoModel detallepedido){
        detallePedidoRepository.save(detallepedido);
    }
}
