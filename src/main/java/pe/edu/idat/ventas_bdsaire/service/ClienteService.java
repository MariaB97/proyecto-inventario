package pe.edu.idat.ventas_bdsaire.service;

import pe.edu.idat.ventas_bdsaire.model.ClienteModel;
import pe.edu.idat.ventas_bdsaire.repository.ClienteRepository;

import java.util.List;

public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteModel> obtenerCliente() {
        return clienteRepository.findAll();
    }

    public void guardarCliente(ClienteModel cliente) {
        clienteRepository.save(cliente);
    }
}
