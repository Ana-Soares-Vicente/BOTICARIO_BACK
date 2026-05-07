package pedidos.boticario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedidos.boticario.entities.Cliente;
import pedidos.boticario.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> listar() {
        return repository.findAll();
    }
    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }
}


