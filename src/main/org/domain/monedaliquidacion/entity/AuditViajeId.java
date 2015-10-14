package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.validator.Length;

/**
 * AuditViajeId generated by hbm2java
 */
@Embeddable
public class AuditViajeId implements java.io.Serializable {

	private int consecutivo;
	private Date fechainicio;
	private Date fechafin;
	private Integer cupoinicialviajero;
	private Integer cupoinicialinternet;
	private Integer cupoviajero;
	private Integer cupointernet;
	private String cedulatarjetahabiente;
	private Date fechamod;
	private String usuariomod;

	public AuditViajeId() {
	}

	public AuditViajeId(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public AuditViajeId(int consecutivo, Date fechainicio, Date fechafin,
			Integer cupoinicialviajero, Integer cupoinicialinternet,
			Integer cupoviajero, Integer cupointernet,
			String cedulatarjetahabiente, Date fechamod, String usuariomod) {
		this.consecutivo = consecutivo;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.cupoinicialviajero = cupoinicialviajero;
		this.cupoinicialinternet = cupoinicialinternet;
		this.cupoviajero = cupoviajero;
		this.cupointernet = cupointernet;
		this.cedulatarjetahabiente = cedulatarjetahabiente;
		this.fechamod = fechamod;
		this.usuariomod = usuariomod;
	}

	@Column(name = "consecutivo", nullable = false)
	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	@Column(name = "fechainicio", length = 13)
	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	@Column(name = "fechafin", length = 13)
	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	@Column(name = "cupoinicialviajero", precision = 5, scale = 0)
	public Integer getCupoinicialviajero() {
		return this.cupoinicialviajero;
	}

	public void setCupoinicialviajero(Integer cupoinicialviajero) {
		this.cupoinicialviajero = cupoinicialviajero;
	}

	@Column(name = "cupoinicialinternet", precision = 5, scale = 0)
	public Integer getCupoinicialinternet() {
		return this.cupoinicialinternet;
	}

	public void setCupoinicialinternet(Integer cupoinicialinternet) {
		this.cupoinicialinternet = cupoinicialinternet;
	}

	@Column(name = "cupoviajero", precision = 8, scale = 0)
	public Integer getCupoviajero() {
		return this.cupoviajero;
	}

	public void setCupoviajero(Integer cupoviajero) {
		this.cupoviajero = cupoviajero;
	}

	@Column(name = "cupointernet", precision = 8, scale = 0)
	public Integer getCupointernet() {
		return this.cupointernet;
	}

	public void setCupointernet(Integer cupointernet) {
		this.cupointernet = cupointernet;
	}

	@Column(name = "cedulatarjetahabiente", length = 15)
	@Length(max = 15)
	public String getCedulatarjetahabiente() {
		return this.cedulatarjetahabiente;
	}

	public void setCedulatarjetahabiente(String cedulatarjetahabiente) {
		this.cedulatarjetahabiente = cedulatarjetahabiente;
	}

	@Column(name = "fechamod", length = 22)
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AuditViajeId))
			return false;
		AuditViajeId castOther = (AuditViajeId) other;

		return (this.getConsecutivo() == castOther.getConsecutivo())
				&& ((this.getFechainicio() == castOther.getFechainicio()) || (this
						.getFechainicio() != null
						&& castOther.getFechainicio() != null && this
						.getFechainicio().equals(castOther.getFechainicio())))
				&& ((this.getFechafin() == castOther.getFechafin()) || (this
						.getFechafin() != null
						&& castOther.getFechafin() != null && this
						.getFechafin().equals(castOther.getFechafin())))
				&& ((this.getCupoinicialviajero() == castOther
						.getCupoinicialviajero()) || (this
						.getCupoinicialviajero() != null
						&& castOther.getCupoinicialviajero() != null && this
						.getCupoinicialviajero().equals(
								castOther.getCupoinicialviajero())))
				&& ((this.getCupoinicialinternet() == castOther
						.getCupoinicialinternet()) || (this
						.getCupoinicialinternet() != null
						&& castOther.getCupoinicialinternet() != null && this
						.getCupoinicialinternet().equals(
								castOther.getCupoinicialinternet())))
				&& ((this.getCupoviajero() == castOther.getCupoviajero()) || (this
						.getCupoviajero() != null
						&& castOther.getCupoviajero() != null && this
						.getCupoviajero().equals(castOther.getCupoviajero())))
				&& ((this.getCupointernet() == castOther.getCupointernet()) || (this
						.getCupointernet() != null
						&& castOther.getCupointernet() != null && this
						.getCupointernet().equals(castOther.getCupointernet())))
				&& ((this.getCedulatarjetahabiente() == castOther
						.getCedulatarjetahabiente()) || (this
						.getCedulatarjetahabiente() != null
						&& castOther.getCedulatarjetahabiente() != null && this
						.getCedulatarjetahabiente().equals(
								castOther.getCedulatarjetahabiente())))
				&& ((this.getFechamod() == castOther.getFechamod()) || (this
						.getFechamod() != null
						&& castOther.getFechamod() != null && this
						.getFechamod().equals(castOther.getFechamod())))
				&& ((this.getUsuariomod() == castOther.getUsuariomod()) || (this
						.getUsuariomod() != null
						&& castOther.getUsuariomod() != null && this
						.getUsuariomod().equals(castOther.getUsuariomod())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getConsecutivo();
		result = 37
				* result
				+ (getFechainicio() == null ? 0 : this.getFechainicio()
						.hashCode());
		result = 37 * result
				+ (getFechafin() == null ? 0 : this.getFechafin().hashCode());
		result = 37
				* result
				+ (getCupoinicialviajero() == null ? 0 : this
						.getCupoinicialviajero().hashCode());
		result = 37
				* result
				+ (getCupoinicialinternet() == null ? 0 : this
						.getCupoinicialinternet().hashCode());
		result = 37
				* result
				+ (getCupoviajero() == null ? 0 : this.getCupoviajero()
						.hashCode());
		result = 37
				* result
				+ (getCupointernet() == null ? 0 : this.getCupointernet()
						.hashCode());
		result = 37
				* result
				+ (getCedulatarjetahabiente() == null ? 0 : this
						.getCedulatarjetahabiente().hashCode());
		result = 37 * result
				+ (getFechamod() == null ? 0 : this.getFechamod().hashCode());
		result = 37
				* result
				+ (getUsuariomod() == null ? 0 : this.getUsuariomod()
						.hashCode());
		return result;
	}

}