package pedidos.boticario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedidos.boticario.entities.ItemPedido;
import pedidos.boticario.repository.ItemPedidoRepository;

import java.util.List;

@Service
public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository repository;

    public List<ItemPedido> listar() {
        return repository.findAll();
    }

    public ItemPedido salvar(ItemPedido itemPedido) {
        return repository.save(itemPedido);
    }
}