package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

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

/**
 * Cuentacredito generated by hbm2java
 */
@Entity
@Table(name = "cuentacredito")
public class Cuentacredito implements java.io.Serializable {

	private int consecutivo;
	private Cuenta cuenta;
	private Long valor;
	private Date fecha;
	private String usuario;
	private Date fechamod;
	private String usuariomod;
	private Byte tipo;
	private String observacion;

	public Cuentacredito() {
	}

	public Cuentacredito(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Cuentacredito(int consecutivo, Cuenta cuenta, Long valor,
			Date fecha, String usuario, Date fechamod, String usuariomod,
			Byte tipo, String observacion) {
		this.consecutivo = consecutivo;
		this.cuenta = cuenta;
		this.valor = valor;
		this.fecha = fecha;
		this.usuario = usuario;
		this.fechamod = fechamod;
		this.usuariomod = usuariomod;
		this.tipo = tipo;
		this.observacion = observacion;
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
	@JoinColumn(name = "numcuenta")
	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Column(name = "valor", precision = 10, scale = 0)
	public Long getValor() {
		return this.valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", length = 13)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "usuario", length = 20)
	@Length(max = 20)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechamod", length = 29)
	public Date getFechamod() {
		return this.fechamod;
	}

	public void setFechamod(Date fechamod) {
		this.fechamod = fechamod;
	}

	@Column(name = "usuariomod", length = 20)
	@Length(max = 20)
	public String getUsuariomod() {
		return this.usuariomod;
	}

	public void setUsuariomod(String usuariomod) {
		this.usuariomod = usuariomod;
	}

	@Column(name = "tipo", precision = 2, scale = 0)
	public Byte getTipo() {
		return this.tipo;
	}

	public void setTipo(Byte tipo) {
		this.tipo = tipo;
	}

	@Column(name = "observacion", length = 500)
	@Length(max = 500)
	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}