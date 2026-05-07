package pedidos.boticario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pedidos.boticario.dto.PedidoDTO;
import pedidos.boticario.entities.Cliente;
import pedidos.boticario.entities.Pedido;
import pedidos.boticario.repository.PedidoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<PedidoDTO> listar() {

        List<Pedido> pedidos = repository.findAll();

        return pedidos.stream()
                .map(pedido -> PedidoDTO.builder()
                        .id(pedido.getId())
                        .pago(pedido.getPago())
                        .clienteNome(pedido.getCliente().getNome())
                        .build())
                .collect(Collectors.toList());
    }

    public Pedido salvar(@RequestBody Pedido pedido) {
        return repository.save(pedido);
    }
    //busca pelo id do pedido
    public Pedido buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    //deleta o pedido
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}