package com.clickshop.shop.entities;

import java.io.Serializable;
import java.util.List;

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

	@OneToMany
	private List<Produto> produtos; // Lista de produtos na compra
    private double valorSemDesconto; // Valor total da compra antes dos descontos
    private double valorDesconto; // Valor total dos descontos aplicados
    private double valorAPagar; // Valor a ser pago após os descontos

    // Construtor
    public Compra(User usuario, List<Produto> produtos, double valorSemDesconto, double valorDesconto, double valorAPagar) {
        this.usuario = usuario;
        this.produtos = produtos;
        this.valorSemDesconto = valorSemDesconto;
        this.valorDesconto = valorDesconto;
        this.valorAPagar = valorAPagar;
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
    
}
