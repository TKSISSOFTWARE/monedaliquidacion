package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Autovoz generated by hbm2java
 */
@Entity
@Table(name = "autovoz")
public class Autovoz implements java.io.Serializable {

	private int consecutivo;
	private Establecimiento establecimiento;
	private Tarjeta tarjeta;
	private Date fechatx;
	private String tipotx;
	private BigDecimal valortxpesos;
	private Date fechamod;
	private String usuariomod;
	private Integer numtransaccion;
	private String numautorizacion;
	private BigDecimal valor;
	private String asesor;

	public Autovoz() {
	}

	public Autovoz(int consecutivo, Establecimiento establecimiento,
			Tarjeta tarjeta, Date fechatx) {
		this.consecutivo = consecutivo;
		this.establecimiento = establecimiento;
		this.tarjeta = tarjeta;
		this.fechatx = fechatx;
	}

	public Autovoz(int consecutivo, Establecimiento establecimiento,
			Tarjeta tarjeta, Date fechatx, String tipotx,
			BigDecimal valortxpesos, Date fechamod, String usuariomod,
			Integer numtransaccion, String numautorizacion, BigDecimal valor,
			String asesor) {
		this.consecutivo = consecutivo;
		this.establecimiento = establecimiento;
		this.tarjeta = tarjeta;
		this.fechatx = fechatx;
		this.tipotx = tipotx;
		this.valortxpesos = valortxpesos;
		this.fechamod = fechamod;
		this.usuariomod = usuariomod;
		this.numtransaccion = numtransaccion;
		this.numautorizacion = numautorizacion;
		this.valor = valor;
		this.asesor = asesor;
	}

	@Id
	@Column(name = "consecutivo", unique = true, nullable = false)
	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigounico", nullable = false)
	@NotNull
	public Establecimiento getEstablecimiento() {
		return this.establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "numerotarjeta", nullable = false)
	@NotNull
	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechatx", nullable = false, length = 29)
	@NotNull
	public Date getFechatx() {
		return this.fechatx;
	}

	public void setFechatx(Date fechatx) {
		this.fechatx = fechatx;
	}

	@Column(name = "tipotx", length = 1)
	@Length(max = 1)
	public String getTipotx() {
		return this.tipotx;
	}

	public void setTipotx(String tipotx) {
		this.tipotx = tipotx;
	}

	@Column(name = "valortxpesos", precision = 10)
	public BigDecimal getValortxpesos() {
		return this.valortxpesos;
	}

	public void setValortxpesos(BigDecimal valortxpesos) {
		this.valortxpesos = valortxpesos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechamod", length = 29)
	public Date getFechamod() {
		return this.fechamod;
	}

	public void setFechamod(Date fechamod) {
		this.fechamod = fechamod;
	}

	@Column(name = "usuariomod", length = 15)
	@Length(max = 15)
	public String getUsuariomod() {
		return this.usuariomod;
	}

	public void setUsuariomod(String usuariomod) {
		this.usuariomod = usuariomod;
	}

	@Column(name = "numtransaccion")
	public Integer getNumtransaccion() {
		return this.numtransaccion;
	}

	public void setNumtransaccion(Integer numtransaccion) {
		this.numtransaccion = numtransaccion;
	}

	@Column(name = "numautorizacion", length = 8)
	@Length(max = 8)
	public String getNumautorizacion() {
		return this.numautorizacion;
	}

	public void setNumautorizacion(String numautorizacion) {
		this.numautorizacion = numautorizacion;
	}

	@Column(name = "valor", precision = 10)
	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Column(name = "asesor", length = 15)
	@Length(max = 15)
	public String getAsesor() {
		return this.asesor;
	}

	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}

}