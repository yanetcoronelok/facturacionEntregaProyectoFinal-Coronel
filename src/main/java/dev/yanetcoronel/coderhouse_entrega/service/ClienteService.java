package dev.yanetcoronel.coderhouse_entrega.service;

import dev.yanetcoronel.coderhouse_entrega.model.Cliente;
import dev.yanetcoronel.coderhouse_entrega.repository.ClienteRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente buscarCliente(Long id) {
        return clienteRepository.findById(id).orElseGet(() -> null);
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public void borrarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}