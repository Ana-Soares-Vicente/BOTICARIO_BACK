package pedidos.boticario.entities;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "Produto")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeProduto;
    private String codigo;
    private Double valorRevenda;
    private Double valorCompra;
    private String imagemUrl;

}
