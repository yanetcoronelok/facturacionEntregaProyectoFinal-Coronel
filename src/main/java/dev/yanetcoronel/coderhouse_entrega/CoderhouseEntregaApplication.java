package dev.yanetcoronel.coderhouse_entrega;

import dev.yanetcoronel.coderhouse_entrega.model.Cliente;
import dev.yanetcoronel.coderhouse_entrega.model.Producto;
import dev.yanetcoronel.coderhouse_entrega.model.Venta;
import dev.yanetcoronel.coderhouse_entrega.repository.ClienteRepository;
import dev.yanetcoronel.coderhouse_entrega.repository.ProductoRepository;
import dev.yanetcoronel.coderhouse_entrega.repository.VentaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class CoderhouseEntregaApplication {
    public static void main(String[] args) {
		SpringApplication.run(CoderhouseEntregaApplication.class, args);
	}
}
