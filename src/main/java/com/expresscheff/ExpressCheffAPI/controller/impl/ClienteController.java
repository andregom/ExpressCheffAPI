package com.expresscheff.ExpressCheffAPI.controller;

import com.expresscheff.ExpressCheffAPI.model.Cliente;
import com.expresscheff.ExpressCheffAPI.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    @PostMapping
    public Cliente adicionarCliente(@RequestBody Cliente cliente) {
        return clienteService.adicionarCliente(cliente);
    }

    @GetMapping("/{id}")
    public Optional<Cliente> buscarClientePorId(@PathVariable Long id) {
        return clienteService.buscarClientePorId(id);
    }

    @DeleteMapping("/{id}")
    public void removerCliente(@PathVariable Long id) {
        clienteService.removerCliente(id);
    }
}
