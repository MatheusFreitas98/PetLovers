package model.domain.entity;

import javax.persistence.*;

@Entity
@Table
@DiscriminatorValue("pessoa")
public class Cliente extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String titulo;
}
