package dev.yanetcoronel.coderhouse_entrega.repository;

import dev.yanetcoronel.coderhouse_entrega.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
