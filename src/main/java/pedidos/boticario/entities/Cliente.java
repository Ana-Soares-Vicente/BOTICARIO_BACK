package pedidos.boticario.entities;

import lombok.*;

import javax.persistence.*;

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

    private String nome;

    private String telefone;
}


