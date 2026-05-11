package pedidos.boticario.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name= "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome obrigatório")
    private String nome;

    @NotBlank(message = "Telefone obrigatório")
    private String telefone;
}


