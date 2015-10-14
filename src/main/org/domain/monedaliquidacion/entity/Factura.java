package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.validator.NotNull;

/**
 * Factura generated by hbm2java
 */
@Entity
@Table(name = "factura", uniqueConstraints = @UniqueConstraint(columnNames = "numfactura"))
public class Factura implements java.io.Serializable {

	private FacturaId id;
	private Transaccion transaccion;
	private Set<Detallefactura> detallefacturas = new HashSet<Detallefactura>(0);

	public Factura() {
	}

	public Factura(FacturaId id) {
		this.id = id;
	}

	public Factura(FacturaId id, Transaccion transaccion,
			Set<Detallefactura> detallefacturas) {
		this.id = id;
		this.transaccion = transaccion;
		this.detallefacturas = detallefacturas;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "numfactura", column = @Column(name = "numfactura", unique = true, nullable = false, length = 10)),
			@AttributeOverride(name = "codigounico", column = @Column(name = "codigounico", nullable = false, length = 8)) })
	@NotNull
	public FacturaId getId() {
		return this.id;
	}

	public void setId(FacturaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "consecutivo")
	public Transaccion getTransaccion() {
		return this.transaccion;
	}

	public void setTransaccion(Transaccion transaccion) {
		this.transaccion = transaccion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "factura")
	public Set<Detallefactura> getDetallefacturas() {
		return this.detallefacturas;
	}

	public void setDetallefacturas(Set<Detallefactura> detallefacturas) {
		this.detallefacturas = detallefacturas;
	}

}