package br.eti.gabrieljuliobs.banco.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date data;
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "cartao_id")
    private Cartao cartao;

    public Fatura() {
    }

    public Fatura(Integer id, Date data, Double valor, Cartao cartao) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.cartao = cartao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fatura)) return false;
        Fatura fatura = (Fatura) o;
        return id.equals(fatura.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
