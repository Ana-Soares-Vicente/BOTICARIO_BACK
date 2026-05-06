package pedidos.boticario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedidos.boticario.entities.Produto;
import pedidos.boticario.repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listar() {
        return repository.findAll();
    }
}