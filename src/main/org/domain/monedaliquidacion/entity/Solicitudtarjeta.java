package org.domain.monedaliquidacion.entity;

// Generated 21/06/2012 01:37:44 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.validator.NotNull;

/**
 * Solicitudtarjeta generated by hbm2java
 */
@Entity
@Table(name = "solicitudtarjeta", schema = "public")
public class Solicitudtarjeta implements java.io.Serializable {

	private SolicitudtarjetaId id;
	private Solicitudtransferencia solicitudtransferencia;
	private Tarjeta tarjeta;
	private Integer valor;

	public Solicitudtarjeta() {
	}

	public Solicitudtarjeta(SolicitudtarjetaId id,
			Solicitudtransferencia solicitudtransferencia, Tarjeta tarjeta) {
		this.id = id;
		this.solicitudtransferencia = solicitudtransferencia;
		this.tarjeta = tarjeta;
	}

	public Solicitudtarjeta(SolicitudtarjetaId id,
			Solicitudtransferencia solicitudtransferencia, Tarjeta tarjeta,
			Integer valor) {
		this.id = id;
		this.solicitudtransferencia = solicitudtransferencia;
		this.tarjeta = tarjeta;
		this.valor = valor;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "consecutivo", column = @Column(name = "consecutivo", nullable = false)),
			@AttributeOverride(name = "numerotarjeta", column = @Column(name = "numerotarjeta", nullable = false, length = 16)) })
	@NotNull
	public SolicitudtarjetaId getId() {
		return this.id;
	}

	public void setId(SolicitudtarjetaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "consecutivo", nullable = false, insertable = false, updatable = false)
	@NotNull
	public Solicitudtransferencia getSolicitudtransferencia() {
		return this.solicitudtransferencia;
	}

	public void setSolicitudtransferencia(
			Solicitudtransferencia solicitudtransferencia) {
		this.solicitudtransferencia = solicitudtransferencia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numerotarjeta", nullable = false, insertable = false, updatable = false)
	@NotNull
	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Column(name = "valor", precision = 9, scale = 0)
	public Integer getValor() {
		return this.valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

}
