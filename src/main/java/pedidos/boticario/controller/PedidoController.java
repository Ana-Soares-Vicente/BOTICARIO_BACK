package pedidos.boticario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedidos.boticario.dto.PedidoDTO;
import pedidos.boticario.entities.Cliente;
import pedidos.boticario.entities.Pedido;
import pedidos.boticario.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping
    public List<PedidoDTO> listar() {
        return service.listar();
    }
    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido) {
        return service.salvar(pedido);
    }

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
    @PutMapping("/{id}")
    public Pedido atualizar(@PathVariable Long id,
                             @RequestBody Pedido pedido) {
        pedido.setId(id);
        return service.salvar(pedido);
    }
}