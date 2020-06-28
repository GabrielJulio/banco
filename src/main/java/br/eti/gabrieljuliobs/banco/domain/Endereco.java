package br.eti.gabrieljuliobs.banco.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String cep;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    public Endereco() {
    }

    public Endereco(Integer id, String nome, String cep, Cliente cliente) {
        this.id = id;
        this.nome = nome;
        this.cep = cep;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Endereco)) return false;
        Endereco endereco = (Endereco) o;
        return id.equals(endereco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
