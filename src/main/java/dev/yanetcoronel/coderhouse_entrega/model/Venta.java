package dev.yanetcoronel.coderhouse_entrega.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<VentaProducto> items;

    public Venta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<VentaProducto> getItems() {
        return new ArrayList<>(items);
    }

    public void setItems(List<VentaProducto> ventaProductos) {
        this.items = ventaProductos;
    }
}
