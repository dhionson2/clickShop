package com.clickshop.shop.entities;

import java.io.Serializable;
import java.util.Objects;

import com.clickshop.shop.entities.pk.OrderCompraProdutoPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_compra_item")
public class CompraItem  implements Serializable{

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private OrderCompraProdutoPK id;
	private Integer quantidade;
	private Double preco;
	public CompraItem() {

	}
	public CompraItem(Compra compra,Produto produto,Integer quantidade, Double preco) {
		super();
		id.setCompra(compra);
		id.setProduto(produto);
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public Compra getCompra() {
		return id.getCompra();
	}
	public void setCompra(Compra compra) {
		 id.setCompra(compra);
	}	
	public Produto getProduto() {
		return id.getProduto();
	}
	public void setProduto(Produto produto) {
		 id.setProduto(produto);
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
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
		CompraItem other = (CompraItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
