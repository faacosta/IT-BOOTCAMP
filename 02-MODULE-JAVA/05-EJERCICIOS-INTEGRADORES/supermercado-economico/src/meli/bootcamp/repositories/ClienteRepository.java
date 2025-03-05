package meli.bootcamp.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import meli.bootcamp.core.Repository;
import meli.bootcamp.models.Cliente;

public class ClienteRepository implements Repository<String, Cliente> {

    private Map<String, Cliente> clientes;

    public ClienteRepository() {
        this.clientes = new HashMap<>();
        this.clientes.put("10234978", new Cliente("10234978", "Juan", "Perez"));
        this.clientes.put("63102418", new Cliente("63102418", "Maria", "Paz"));
        this.clientes.put("20354178", new Cliente("20354178", "Lorena", "Juarez"));
        this.clientes.put("51243310", new Cliente("51243310", "Jazmin", "Carrizo"));
        this.clientes.put("41230051", new Cliente("41230051", "Pedro", "Capdevilla"));
    }

    @Override
    public void save(Cliente cliente) {
        this.clientes.computeIfAbsent(cliente.getDocumento(), key -> cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return this.clientes.values()
            .stream()
            .toList();
    }

    @Override
    public Cliente findByKey(String key) {
        return this.clientes.getOrDefault(key, null);
    }

    @Override
    public void remove(String key) {
        if (this.clientes.containsKey(key)) {
            this.clientes.remove(key);
        }
    }

    @Override
    public Boolean exists(String key) {
        return this.clientes.containsKey(key);
    }
    
}
