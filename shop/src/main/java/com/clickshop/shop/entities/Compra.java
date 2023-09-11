package com.clickshop.shop.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="tb_compra")
public class Compra implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	
	@ManyToOne
	@JoinColumn(name = "user_id") 
	private User usuario;  // Referência ao usuário que fez a compra
	@JsonIgnore
	@OneToMany
	private List<Produto> produtos; // Lista de produtos na compra
    private double valorSemDesconto; // Valor total da compra antes dos descontos
    private double valorDesconto; // Valor total dos descontos aplicados
    private double valorAPagar; // Valor a ser pago após os descontos
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    // Construtor
    public Compra(User usuario, List<Produto> produtos, double valorSemDesconto, double valorDesconto, double valorAPagar, Instant moment) {
        this.usuario = usuario;
        this.produtos = produtos;
        this.valorSemDesconto = valorSemDesconto;
        this.valorDesconto = valorDesconto;
        this.valorAPagar = valorAPagar;
        this.moment = moment;
    }
    public Compra() {
        // Construtor padrão vazio
    }

    @Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		return id == other.id;
	}

	// Getters e Setters
    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValorSemDesconto() {
        return valorSemDesconto;
    }

    public void setValorSemDesconto(double valorSemDesconto) {
        this.valorSemDesconto = valorSemDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}
    
}
