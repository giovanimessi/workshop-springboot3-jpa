package com.treinamentospring.curso.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedidos")
public class Pedido implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Long id;
	private Instant momento;
	
	//associacao 
	//Relacionamento
	//muitos
	
	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private User pedido;

	public Pedido() {
		super();
	}

	public Pedido(Long id, Instant momento, User client) {
		super();
		this.id = id;
		this.momento = momento;
		pedido = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public User getClient() {
		return pedido;
	}

	public void setClient(User client) {
		pedido = client;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pedido, id, momento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(pedido, other.pedido) && Objects.equals(id, other.id)
				&& Objects.equals(momento, other.momento);
	}
	
	
	

}
