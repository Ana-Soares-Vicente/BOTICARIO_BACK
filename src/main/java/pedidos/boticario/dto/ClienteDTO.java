package pedidos.boticario.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteDTO {
    private Long id;

    private String nome;

    private String telefone;
}
