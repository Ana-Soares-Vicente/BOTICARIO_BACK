package pedidos.boticario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedidos.boticario.entities.ItemPedido;
import pedidos.boticario.service.ItemPedidoService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/item_pedidos")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService service;

    @GetMapping
    public List<ItemPedido> listar() {
        return service.listar();
    }

    @PostMapping
    public ItemPedido salvar(@Valid @RequestBody ItemPedido itemPedido) {
        return service.salvar(itemPedido);
    }
}