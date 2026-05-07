package pedidos.boticario.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pedidos.boticario.entities.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
