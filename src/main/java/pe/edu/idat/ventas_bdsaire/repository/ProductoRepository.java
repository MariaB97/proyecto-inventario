package pe.edu.idat.ventas_bdsaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.ventas_bdsaire.model.ProductoModel;

public interface ProductoRepository extends JpaRepository<ProductoModel,Integer> {
}
