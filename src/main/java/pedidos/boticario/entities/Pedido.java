package pedidos.boticario.entities;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "Pedido")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clienteNome;
    private String fone;
    private Boolean pago;

    @ManyToOne
    private Produto produto;
}
