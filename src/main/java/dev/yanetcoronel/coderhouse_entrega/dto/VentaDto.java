package dev.yanetcoronel.coderhouse_entrega.dto;

import java.util.List;

public class VentaDto {
    private final Long clienteId;
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
