package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * ClasetarjetaId generated by hbm2java
 */
@Embeddable
public class ClasetarjetaId implements java.io.Serializable {

	private String codbanco;
	private String codfranquicia;
	private String clase;

	public ClasetarjetaId() {
	}

	public ClasetarjetaId(String codbanco, String codfranquicia, String clase) {
		this.codbanco = codbanco;
		this.codfranquicia = codfranquicia;
		this.clase = clase;
	}

	@Column(name = "codbanco", nullable = false, length = 3)
	@NotNull
	@Length(max = 3)
	public String getCodbanco() {
		return this.codbanco;
	}

	public void setCodbanco(String codbanco) {
		this.codbanco = codbanco;
	}

	@Column(name = "codfranquicia", nullable = false, length = 1)
	@NotNull
	@Length(max = 1)
	public String getCodfranquicia() {
		return this.codfranquicia;
	}

	public void setCodfranquicia(String codfranquicia) {
		this.codfranquicia = codfranquicia;
	}

	@Column(name = "clase", nullable = false, length = 1)
	@NotNull
	@Length(max = 1)
	public String getClase() {
		return this.clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClasetarjetaId))
			return false;
		ClasetarjetaId castOther = (ClasetarjetaId) other;

		return ((this.getCodbanco() == castOther.getCodbanco()) || (this
				.getCodbanco() != null
				&& castOther.getCodbanco() != null && this.getCodbanco()
				.equals(castOther.getCodbanco())))
				&& ((this.getCodfranquicia() == castOther.getCodfranquicia()) || (this
						.getCodfranquicia() != null
						&& castOther.getCodfranquicia() != null && this
						.getCodfranquicia()
						.equals(castOther.getCodfranquicia())))
				&& ((this.getClase() == castOther.getClase()) || (this
						.getClase() != null
						&& castOther.getClase() != null && this.getClase()
						.equals(castOther.getClase())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodbanco() == null ? 0 : this.getCodbanco().hashCode());
		result = 37
				* result
				+ (getCodfranquicia() == null ? 0 : this.getCodfranquicia()
						.hashCode());
		result = 37 * result
				+ (getClase() == null ? 0 : this.getClase().hashCode());
		return result;
	}

}
