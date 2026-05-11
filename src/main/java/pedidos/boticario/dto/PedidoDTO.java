package pedidos.boticario.dto;

import lombok.*;
import pedidos.boticario.enums.StatusPedido;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PedidoDTO {

    private Long id;

    private StatusPedido status;

    private String clienteNome;
}
