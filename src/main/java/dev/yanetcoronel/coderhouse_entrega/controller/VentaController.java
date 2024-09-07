package dev.yanetcoronel.coderhouse_entrega.controller;

import dev.yanetcoronel.coderhouse_entrega.dto.VentaDto;
import dev.yanetcoronel.coderhouse_entrega.model.Venta;
import dev.yanetcoronel.coderhouse_entrega.service.VentaService;
import jakarta.validation.Valid;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @PostMapping
    public ResponseEntity<Object> crearVenta(@RequestBody @Valid VentaDto ventaRequest) {
        try {
            return ResponseEntity.ok(this.ventaService.agregarVenta(ventaRequest));
        }catch (BadRequestException e){
            Map<String, String> error = Map.ofEntries(Map.entry("error", e.getMessage()));
            return ResponseEntity.status(HttpStatus.CONFLICT).body(error);
        }

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
