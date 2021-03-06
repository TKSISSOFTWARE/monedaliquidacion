package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Vistacuentasaldo generated by hbm2java
 */
@Entity
@Table(name = "vistacuentasaldo")
public class Vistacuentasaldo implements java.io.Serializable {

	private VistacuentasaldoId id;

	public Vistacuentasaldo() {
	}

	public Vistacuentasaldo(VistacuentasaldoId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "numcuenta", column = @Column(name = "numcuenta", length = 25)),
			@AttributeOverride(name = "nombre", column = @Column(name = "nombre", length = 100)),
			@AttributeOverride(name = "fecha", column = @Column(name = "fecha", length = 29)),
			@AttributeOverride(name = "creditos", column = @Column(name = "creditos", precision = 131089, scale = 0)),
			@AttributeOverride(name = "debitos", column = @Column(name = "debitos", precision = 131089, scale = 0)),
			@AttributeOverride(name = "detalle", column = @Column(name = "detalle")),
			@AttributeOverride(name = "nombrebanco", column = @Column(name = "nombrebanco", length = 50)),
			@AttributeOverride(name = "codbanco", column = @Column(name = "codbanco", length = 3)),
			@AttributeOverride(name = "saldo", column = @Column(name = "saldo", precision = 131089, scale = 0)),
			@AttributeOverride(name = "item", column = @Column(name = "item")),
			@AttributeOverride(name = "sum", column = @Column(name = "sum", precision = 131089, scale = 0)) })
	public VistacuentasaldoId getId() {
		return this.id;
	}

	public void setId(VistacuentasaldoId id) {
		this.id = id;
	}

}
