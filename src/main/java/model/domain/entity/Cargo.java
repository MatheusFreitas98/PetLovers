package model.domain.entity;

import javax.persistence.*;

@Entity
@Table
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private double salario;
}
