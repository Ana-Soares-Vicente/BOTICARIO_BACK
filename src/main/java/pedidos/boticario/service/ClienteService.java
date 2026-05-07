package pedidos.boticario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedidos.boticario.dto.ClienteDTO;
import pedidos.boticario.entities.Cliente;
import pedidos.boticario.repository.ClienteRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    //lista os cliente
    public List<ClienteDTO> listar() {

        List<Cliente> clientes = repository.findAll();

        return clientes.stream()
                .map(cliente -> ClienteDTO.builder()
                        .id(cliente.getId())
                        .nome(cliente.getNome())
                        .telefone(cliente.getTelefone())
                        .build())
                .collect(Collectors.toList());
    }
    //salva o cliente
    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }
    //busca pelo id do cliente
    public Cliente buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    //deleta o cliente
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}


