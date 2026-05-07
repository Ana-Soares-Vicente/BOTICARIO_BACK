package pedidos.boticario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedidos.boticario.entities.Cliente;

import java.util.List;

public interface ClienteRepository  extends JpaRepository<Cliente, Long> {
}
