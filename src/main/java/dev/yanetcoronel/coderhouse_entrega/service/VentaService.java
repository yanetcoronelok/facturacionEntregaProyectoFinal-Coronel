package dev.yanetcoronel.coderhouse_entrega.service;

import dev.yanetcoronel.coderhouse_entrega.model.Venta;
import dev.yanetcoronel.coderhouse_entrega.repository.VentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public Venta agregarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public Optional<Venta> buscarVenta(Long id) {
        return ventaRepository.findById(id);
    }
}