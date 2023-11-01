package model.domain.entity;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pessoa", discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa {
    @Column
    private String documento;
    @Column
    private String nome;
    @Column
    private String telefone;
    @Column
    private String email;
    @Column
    private String senha;

    public Pessoa() {
    }

    public Pessoa(String documento, String nome, String email, String senha) {
        this.documento = documento;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
