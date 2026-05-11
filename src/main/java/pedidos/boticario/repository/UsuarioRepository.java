package pedidos.boticario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedidos.boticario.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);
}
