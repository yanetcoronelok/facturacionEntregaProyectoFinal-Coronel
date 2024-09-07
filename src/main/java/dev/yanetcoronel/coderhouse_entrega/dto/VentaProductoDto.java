package dev.yanetcoronel.coderhouse_entrega.dto;

public class VentaProductoDto {
    private final Long productoId;
    private final Integer cantidad;

    public VentaProductoDto(Long productoId, Integer cantidad) {
        this.productoId = productoId;
        this.cantidad = cantidad;
    }

    public Long getProductoId() {
        return productoId;
    }

    public Integer getCantidad() {
        return cantidad;
    }
}
