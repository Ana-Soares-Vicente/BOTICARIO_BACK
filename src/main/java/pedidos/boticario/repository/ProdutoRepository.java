package pedidos.boticario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedidos.boticario.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}