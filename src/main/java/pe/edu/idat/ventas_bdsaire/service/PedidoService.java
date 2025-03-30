package pe.edu.idat.ventas_bdsaire.service;

import pe.edu.idat.ventas_bdsaire.model.PedidoModel;
import pe.edu.idat.ventas_bdsaire.repository.PedidoRepository;

import java.util.List;

public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<PedidoModel> obtenerPedido(){
        return pedidoRepository.findAll();
    }

    public void guardarPedido(PedidoModel pedido){
        pedidoRepository.save(pedido);
    }
}
