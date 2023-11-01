package domain.entity;

import javax.persistence.*;

@Entity
@Table
public class Funcionario extends Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String matricula;
    @Column
    private Cargo cargo;
}
