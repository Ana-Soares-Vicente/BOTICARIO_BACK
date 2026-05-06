package pedidos.boticario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pedidos.boticario.entities.Pedido;
import pedidos.boticario.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @GetMapping
    public List<Pedido> listar() {
        return service.listar();
    }
}