package dev.yanetcoronel.coderhouse_entrega.repository;

import dev.yanetcoronel.coderhouse_entrega.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
