package dev.yanetcoronel.coderhouse_entrega.service;

import dev.yanetcoronel.coderhouse_entrega.model.Producto;

import dev.yanetcoronel.coderhouse_entrega.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public Producto buscarProducto(Long id) {
        return productoRepository.findById(id).orElseGet(() -> null);
    }

    public void borrarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}