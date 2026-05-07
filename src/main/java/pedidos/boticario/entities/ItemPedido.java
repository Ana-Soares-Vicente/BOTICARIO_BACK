package pedidos.boticario.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="item_pedidos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Pedido pedido;

    public Double calcularLucro() {
        return (produto.getValorRevenda() - produto.getValorCompra()) * quantidade;
    }
    public Double getLucro() {
        return calcularLucro();
    }
}


