package pedidos.boticario.entities;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import pedidos.boticario.enums.StatusPedido;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pedido")
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

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido")
    @JsonIgnoreProperties("pedido")
    private List<ItemPedido> itens;

    private LocalDate dataPedido;

    public Double calcularLucroTotal() {

        return itens.stream()
                .mapToDouble(ItemPedido::calcularLucro)
                .sum();
    }
}
