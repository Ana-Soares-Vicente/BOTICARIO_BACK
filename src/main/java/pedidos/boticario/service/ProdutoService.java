package pedidos.boticario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pedidos.boticario.dto.ProdutoDTO;
import pedidos.boticario.entities.Cliente;
import pedidos.boticario.entities.Produto;
import pedidos.boticario.repository.ProdutoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoDTO> listar() {

        List<Produto> produtos = repository.findAll();

        return produtos.stream()
                .map(produto -> ProdutoDTO.builder()
                        .id(produto.getId())
                        .nomeProduto(produto.getNomeProduto())
                        .codigo(produto.getCodigo())
                        .valorCompra(produto.getValorCompra())
                        .valorRevenda(produto.getValorRevenda())
                        .imagemUrl(produto.getImagemUrl())
                        .build())
                .collect(Collectors.toList());
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return repository.save(produto);
    }
    //busca pelo id do produto
    public Produto buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    //deleta o produto
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}