package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Cuenta generated by hbm2java
 */
@Entity
@Table(name = "cuenta")
public class Cuenta implements java.io.Serializable {

	private String numcuenta;
	private Banco banco;
	private String nombre;
	private BigDecimal saldo;
	private Set<Cuentacredito> cuentacreditos = new HashSet<Cuentacredito>(0);
	private Set<Depositostarjeta> depositostarjetas = new HashSet<Depositostarjeta>(
			0);

	public Cuenta() {
	}

	public Cuenta(String numcuenta, Banco banco) {
		this.numcuenta = numcuenta;
		this.banco = banco;
	}

	public Cuenta(String numcuenta, Banco banco, String nombre,
			BigDecimal saldo, Set<Cuentacredito> cuentacreditos,
			Set<Depositostarjeta> depositostarjetas) {
		this.numcuenta = numcuenta;
		this.banco = banco;
		this.nombre = nombre;
		this.saldo = saldo;
		this.cuentacreditos = cuentacreditos;
		this.depositostarjetas = depositostarjetas;
	}

	@Id
	@Column(name = "numcuenta", unique = true, nullable = false, length = 25)
	@NotNull
	@Length(max = 25)
	public String getNumcuenta() {
		return this.numcuenta;
	}

	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codbanco", nullable = false)
	@NotNull
	public Banco getBanco() {
		return this.banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Column(name = "nombre", length = 100)
	@Length(max = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "saldo", precision = 12)
	public BigDecimal getSaldo() {
		return this.saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuenta")
	public Set<Cuentacredito> getCuentacreditos() {
		return this.cuentacreditos;
	}

	public void setCuentacreditos(Set<Cuentacredito> cuentacreditos) {
		this.cuentacreditos = cuentacreditos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuenta")
	public Set<Depositostarjeta> getDepositostarjetas() {
		return this.depositostarjetas;
	}

	public void setDepositostarjetas(Set<Depositostarjeta> depositostarjetas) {
		this.depositostarjetas = depositostarjetas;
	}

}