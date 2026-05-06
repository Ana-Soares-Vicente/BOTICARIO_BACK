package pedidos.boticario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedidos.boticario.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}