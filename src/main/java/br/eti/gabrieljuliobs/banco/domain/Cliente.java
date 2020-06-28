package br.eti.gabrieljuliobs.banco.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String nome;

    @NotNull
    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos;

    @NotNull
    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private List<Conta> contas;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, List<Endereco> enderecos, List<Conta> contas) {
        this.id = id;
        this.nome = nome;
        this.enderecos = enderecos;
        this.contas = contas;
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

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
