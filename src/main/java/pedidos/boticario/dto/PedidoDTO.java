package pedidos.boticario.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PedidoDTO {

    private Long id;

    private Boolean pago;

    private String clienteNome;
}
