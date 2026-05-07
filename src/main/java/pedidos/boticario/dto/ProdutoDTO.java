package pedidos.boticario.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProdutoDTO {

    private Long id;

    private String nomeProduto;

    private String codigo;

    private Double valorCompra;

    private Double valorRevenda;

    private String imagemUrl;
}
