package pedidos.boticario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedidos.boticario.entities.Pedido;
import pedidos.boticario.repository.PedidoRepository;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> listar() {
        return repository.findAll();
    }
}