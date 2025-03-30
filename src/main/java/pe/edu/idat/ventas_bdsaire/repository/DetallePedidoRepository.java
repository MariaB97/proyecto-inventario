package pe.edu.idat.ventas_bdsaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.ventas_bdsaire.model.DetallePedidoModel;

public interface DetallePedidoRepository extends JpaRepository<DetallePedidoModel,Integer> {
}
