package dev.yanetcoronel.coderhouse_entrega.service;

import dev.yanetcoronel.coderhouse_entrega.dto.VentaDto;
import dev.yanetcoronel.coderhouse_entrega.dto.VentaProductoDto;
import dev.yanetcoronel.coderhouse_entrega.model.Cliente;
import dev.yanetcoronel.coderhouse_entrega.model.Producto;
import dev.yanetcoronel.coderhouse_entrega.model.Venta;
import dev.yanetcoronel.coderhouse_entrega.model.VentaProducto;
import dev.yanetcoronel.coderhouse_entrega.repository.VentaRepository;

import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;
    private final ClienteService clienteService;
    private final ProductoService productoService;

    public VentaService(VentaRepository ventaRepository, ClienteService clienteService, ProductoService productoService) {
        this.ventaRepository = ventaRepository;
        this.clienteService = clienteService;
        this.productoService = productoService;
    }

    public Venta agregarVenta(VentaDto ventaDto) throws BadRequestException {
        Venta nuevaVenta = new Venta();

        Cliente cliente = clienteService.buscarCliente(ventaDto.getClienteId());

        List<VentaProducto> items = new ArrayList<>();
        for(VentaProductoDto item: ventaDto.getItems()){
            Producto producto = productoService.buscarProducto(item.getProductoId());

            if(item.getCantidad() <= producto.getStock()){
                items.add(new VentaProducto(nuevaVenta, producto, item.getCantidad()));
            } else {
                throw new BadRequestException("No hay suficiente stock de uno de los productos");
            }
        }

        nuevaVenta.setCliente(cliente);
        nuevaVenta.setItems(items);

        productoService.reducirStocks(items);

        return ventaRepository.save(nuevaVenta);
    }

    public Optional<Venta> buscarVenta(Long id) {
        return ventaRepository.findById(id);
    }

    public List<Venta> buscarVentas() {
        return ventaRepository.findAll();
    }
}