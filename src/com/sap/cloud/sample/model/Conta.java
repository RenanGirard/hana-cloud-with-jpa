package com.sap.cloud.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CONTAS")
@SequenceGenerator(name= "CONTAS_SEQUENCE", sequenceName = "CONTAS_SEQ", initialValue=1, allocationSize = 1)
public class Conta {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONTAS_SEQUENCE")
	@Column(name="ID")
	private Long id;
	
	@Column(name="NUMERO")
	private int numero;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="BANCO_ID", foreignKey=@ForeignKey(name="CONTA_BANCO_FK"))
	private Banco banco;
	
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}

}
