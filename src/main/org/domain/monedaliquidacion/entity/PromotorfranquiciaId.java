package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * PromotorfranquiciaId generated by hbm2java
 */
@Embeddable
public class PromotorfranquiciaId implements java.io.Serializable {

	private String codfranquicia;
	private String documento;

	public PromotorfranquiciaId() {
	}

	public PromotorfranquiciaId(String codfranquicia, String documento) {
		this.codfranquicia = codfranquicia;
		this.documento = documento;
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

	@Column(name = "documento", nullable = false, length = 15)
	@NotNull
	@Length(max = 15)
	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PromotorfranquiciaId))
			return false;
		PromotorfranquiciaId castOther = (PromotorfranquiciaId) other;

		return ((this.getCodfranquicia() == castOther.getCodfranquicia()) || (this
				.getCodfranquicia() != null
				&& castOther.getCodfranquicia() != null && this
				.getCodfranquicia().equals(castOther.getCodfranquicia())))
				&& ((this.getDocumento() == castOther.getDocumento()) || (this
						.getDocumento() != null
						&& castOther.getDocumento() != null && this
						.getDocumento().equals(castOther.getDocumento())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodfranquicia() == null ? 0 : this.getCodfranquicia()
						.hashCode());
		result = 37 * result
				+ (getDocumento() == null ? 0 : this.getDocumento().hashCode());
		return result;
	}

}
