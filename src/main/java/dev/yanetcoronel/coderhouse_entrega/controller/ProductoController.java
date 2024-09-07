package dev.yanetcoronel.coderhouse_entrega.controller;

import dev.yanetcoronel.coderhouse_entrega.model.Producto;
import dev.yanetcoronel.coderhouse_entrega.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping
    public Producto create(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping("/{id}")
    public Producto getProducto(@PathVariable Long id) {
        return productoService.buscarProducto(id);
    }

    @DeleteMapping("/{id}")
    public void borrarCliente(@PathVariable Long id) {
        productoService.borrarProducto(id);
    }
}