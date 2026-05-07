package pedidos.boticario.entities;
import javax.persistence.*;
import lombok.*;

import java.util.List;

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
    private Boolean pago;
    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens;

    public Double calcularLucroTotal() {

        return itens.stream()
                .mapToDouble(ItemPedido::calcularLucro)
                .sum();
    }
}
