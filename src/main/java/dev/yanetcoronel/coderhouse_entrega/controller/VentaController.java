package dev.yanetcoronel.coderhouse_entrega.controller;

import dev.yanetcoronel.coderhouse_entrega.dto.VentaDto;
import dev.yanetcoronel.coderhouse_entrega.model.Venta;
import dev.yanetcoronel.coderhouse_entrega.service.VentaService;
import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @PostMapping
    public Venta crearVenta(@RequestBody VentaDto ventaRequest) throws BadRequestException {
        return this.ventaService.agregarVenta(ventaRequest);
    }

    @GetMapping
    public List<Venta> getVentas(){
        return this.ventaService.buscarVentas();
    }

    @GetMapping("/{id}")
    public Venta getVenta(@PathVariable Long id){
        return this.ventaService.buscarVenta(id).orElseGet(() -> null);
    }
}
