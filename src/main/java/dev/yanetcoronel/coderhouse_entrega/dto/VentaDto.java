package dev.yanetcoronel.coderhouse_entrega.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class VentaDto {
    @NotNull
    private final Long clienteId;
    @NotEmpty
    private final List<VentaProductoDto> items;

    public VentaDto(Long clienteId, List<VentaProductoDto> items) {
        this.clienteId = clienteId;
        this.items = items;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public List<VentaProductoDto> getItems() {
        return items;
    }
}
