package com.expresscheff.ExpressCheffAPI.repository;

import com.expresscheff.ExpressCheffAPI.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {

    private final List<Cliente> clientes = new ArrayList<>();
    private Long idCounter = 1L;

    public List<Cliente> findAll() {
        return clientes;
    }

    public Optional<Cliente> findById(Long id) {
        return clientes.stream().filter(cliente -> cliente.getId().equals(id)).findFirst();
    }

    public Cliente save(Cliente cliente) {
        cliente.setId(idCounter++);
        clientes.add(cliente);
        return cliente;
    }

    public void deleteById(Long id) {
        clientes.removeIf(cliente -> cliente.getId().equals(id));
    }
}
