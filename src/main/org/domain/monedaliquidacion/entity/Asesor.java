package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Asesor generated by hbm2java
 */
@Entity
@Table(name = "asesor")
public class Asesor implements java.io.Serializable {

	private String documento;
	private Personal personal;
	private BigDecimal comision;
	private String telefonooficina;
	private String extension;
	private Set<Promotor> promotors = new HashSet<Promotor>(0);
	private Set<Envios> envioses = new HashSet<Envios>(0);

	public Asesor() {
	}

	public Asesor(Personal personal) {
		this.personal = personal;
	}

	public Asesor(Personal personal, BigDecimal comision,
			String telefonooficina, String extension, Set<Promotor> promotors,
			Set<Envios> envioses) {
		this.personal = personal;
		this.comision = comision;
		this.telefonooficina = telefonooficina;
		this.extension = extension;
		this.promotors = promotors;
		this.envioses = envioses;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "personal"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "documento", unique = true, nullable = false, length = 15)
	@Length(max = 15)
	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@NotNull
	@Length(max = 15)
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	@Column(name = "comision", precision = 4, scale = 4)
	public BigDecimal getComision() {
		return this.comision;
	}

	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}

	@Column(name = "telefonooficina", length = 15)
	@Length(max = 15)
	public String getTelefonooficina() {
		return this.telefonooficina;
	}

	public void setTelefonooficina(String telefonooficina) {
		this.telefonooficina = telefonooficina;
	}

	@Column(name = "extension", length = 6)
	@Length(max = 6)
	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "asesor")
	public Set<Promotor> getPromotors() {
		return this.promotors;
	}

	public void setPromotors(Set<Promotor> promotors) {
		this.promotors = promotors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "asesor")
	public Set<Envios> getEnvioses() {
		return this.envioses;
	}

	public void setEnvioses(Set<Envios> envioses) {
		this.envioses = envioses;
	}

}