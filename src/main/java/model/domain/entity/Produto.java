package model.domain.entity;

import javax.persistence.*;

@Entity
@Table
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String titulo;
    @Column
    private String descricao;
}
