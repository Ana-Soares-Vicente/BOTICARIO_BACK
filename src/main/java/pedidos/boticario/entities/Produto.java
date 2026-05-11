package pedidos.boticario.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.*;

@Entity
@Table(name = "produto")
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

    @NotBlank(message = "Nome obrigatório")
    private String nomeProduto;
    @NotBlank(message = "Código obrigatório")
    private String codigo;
    @NotNull(message = "Valor de revenda obrigatório")
    private Double valorRevenda;
    @NotNull(message = "Valor de compra obrigatório")
    private Double valorCompra;
    private String imagemUrl;

}
