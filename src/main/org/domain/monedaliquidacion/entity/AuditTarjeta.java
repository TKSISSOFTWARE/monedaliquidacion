package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.validator.NotNull;

/**
 * AuditTarjeta generated by hbm2java
 */
@Entity
@Table(name = "audit_tarjeta")
public class AuditTarjeta implements java.io.Serializable {

	private AuditTarjetaId id;

	public AuditTarjeta() {
	}

	public AuditTarjeta(AuditTarjetaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "numerotarjeta", column = @Column(name = "numerotarjeta", nullable = false, length = 16)),
			@AttributeOverride(name = "bancoemisor", column = @Column(name = "bancoemisor", nullable = false, length = 3)),
			@AttributeOverride(name = "franquicia", column = @Column(name = "franquicia", nullable = false, length = 1)),
			@AttributeOverride(name = "documento", column = @Column(name = "documento", nullable = false, length = 15)),
			@AttributeOverride(name = "limite", column = @Column(name = "limite", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "fechainicio", column = @Column(name = "fechainicio", length = 29)),
			@AttributeOverride(name = "fechafin", column = @Column(name = "fechafin", length = 29)),
			@AttributeOverride(name = "fechavencimiento", column = @Column(name = "fechavencimiento", nullable = false, length = 5)),
			@AttributeOverride(name = "codseguridad", column = @Column(name = "codseguridad", nullable = false, length = 4)),
			@AttributeOverride(name = "tarjetahabiente", column = @Column(name = "tarjetahabiente", nullable = false, length = 50)),
			@AttributeOverride(name = "direcciontarjetahabiente", column = @Column(name = "direcciontarjetahabiente", nullable = false, length = 150)),
			@AttributeOverride(name = "cedulatarjetahabiente", column = @Column(name = "cedulatarjetahabiente", nullable = false, length = 15)),
			@AttributeOverride(name = "telefonotarjetahabiente", column = @Column(name = "telefonotarjetahabiente", nullable = false, length = 15)),
			@AttributeOverride(name = "fechamod", column = @Column(name = "fechamod", length = 22)),
			@AttributeOverride(name = "usuariomod", column = @Column(name = "usuariomod", length = 20)),
			@AttributeOverride(name = "tac", column = @Column(name = "tac")) })
	@NotNull
	public AuditTarjetaId getId() {
		return this.id;
	}

	public void setId(AuditTarjetaId id) {
		this.id = id;
	}

}