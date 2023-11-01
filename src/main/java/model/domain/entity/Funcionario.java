package model.domain.entity;

import javax.persistence.*;

@Entity
@Table
@DiscriminatorValue("pessoa")
public class Funcionario extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String matricula;
    @Column
    private String cargo;
}
