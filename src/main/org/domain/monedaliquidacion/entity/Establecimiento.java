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
 * Establecimiento generated by hbm2java
 */
@Entity
@Table(name = "establecimiento")
public class Establecimiento implements java.io.Serializable {

	private String codigounico;
	private Pais pais;
	private Empresa empresa;
	private Bancocol bancocol;
	private String nombreestable;
	private String direccion;
	private String telefono;
	private BigDecimal porcentaje;
	private Boolean iva;
	private String numcuenta;
	private Boolean facturar;
	private Set<Tasadolarpromotorparametro> tasadolarpromotorparametros = new HashSet<Tasadolarpromotorparametro>(
			0);
	private Set<Porcentcomisiontxparampromo> porcentcomisiontxparampromos = new HashSet<Porcentcomisiontxparampromo>(
			0);
	private Set<Porcentajecomisiontxparam> porcentajecomisiontxparams = new HashSet<Porcentajecomisiontxparam>(
			0);
	private Set<Tasaeuropromotorparametro> tasaeuropromotorparametros = new HashSet<Tasaeuropromotorparametro>(
			0);
	private Set<Tasadolarparametro> tasadolarparametros = new HashSet<Tasadolarparametro>(
			0);
	private Set<Inventario> inventarios = new HashSet<Inventario>(0);
	private Set<Tasaeuroparametro> tasaeuroparametros = new HashSet<Tasaeuroparametro>(
			0);
	private Set<Establecimientoprecio> establecimientoprecios = new HashSet<Establecimientoprecio>(
			0);
	private Set<Puntoestablecimiento> puntoestablecimientos = new HashSet<Puntoestablecimiento>(
			0);
	private Set<Transaccion> transaccions = new HashSet<Transaccion>(0);
	private Set<Autovoz> autovozs = new HashSet<Autovoz>(0);
	private Set<Gravamenestablecimiento> gravamenestablecimientos = new HashSet<Gravamenestablecimiento>(
			0);

	public Establecimiento() {
	}

	public Establecimiento(String codigounico, String nombreestable) {
		this.codigounico = codigounico;
		this.nombreestable = nombreestable;
	}

	public Establecimiento(String codigounico, Pais pais, Empresa empresa,
			Bancocol bancocol, String nombreestable, String direccion,
			String telefono, BigDecimal porcentaje, Boolean iva,
			String numcuenta, Boolean facturar,
			Set<Tasadolarpromotorparametro> tasadolarpromotorparametros,
			Set<Porcentcomisiontxparampromo> porcentcomisiontxparampromos,
			Set<Porcentajecomisiontxparam> porcentajecomisiontxparams,
			Set<Tasaeuropromotorparametro> tasaeuropromotorparametros,
			Set<Tasadolarparametro> tasadolarparametros,
			Set<Inventario> inventarios,
			Set<Tasaeuroparametro> tasaeuroparametros,
			Set<Establecimientoprecio> establecimientoprecios,
			Set<Puntoestablecimiento> puntoestablecimientos,
			Set<Transaccion> transaccions, Set<Autovoz> autovozs,
			Set<Gravamenestablecimiento> gravamenestablecimientos) {
		this.codigounico = codigounico;
		this.pais = pais;
		this.empresa = empresa;
		this.bancocol = bancocol;
		this.nombreestable = nombreestable;
		this.direccion = direccion;
		this.telefono = telefono;
		this.porcentaje = porcentaje;
		this.iva = iva;
		this.numcuenta = numcuenta;
		this.facturar = facturar;
		this.tasadolarpromotorparametros = tasadolarpromotorparametros;
		this.porcentcomisiontxparampromos = porcentcomisiontxparampromos;
		this.porcentajecomisiontxparams = porcentajecomisiontxparams;
		this.tasaeuropromotorparametros = tasaeuropromotorparametros;
		this.tasadolarparametros = tasadolarparametros;
		this.inventarios = inventarios;
		this.tasaeuroparametros = tasaeuroparametros;
		this.establecimientoprecios = establecimientoprecios;
		this.puntoestablecimientos = puntoestablecimientos;
		this.transaccions = transaccions;
		this.autovozs = autovozs;
		this.gravamenestablecimientos = gravamenestablecimientos;
	}

	@Id
	@Column(name = "codigounico", unique = true, nullable = false, length = 8)
	@NotNull
	@Length(max = 8)
	public String getCodigounico() {
		return this.codigounico;
	}

	public void setCodigounico(String codigounico) {
		this.codigounico = codigounico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codpais")
	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nit")
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codbanco")
	public Bancocol getBancocol() {
		return this.bancocol;
	}

	public void setBancocol(Bancocol bancocol) {
		this.bancocol = bancocol;
	}

	@Column(name = "nombreestable", nullable = false, length = 30)
	@NotNull
	@Length(max = 30)
	public String getNombreestable() {
		return this.nombreestable;
	}

	public void setNombreestable(String nombreestable) {
		this.nombreestable = nombreestable;
	}

	@Column(name = "direccion", length = 50)
	@Length(max = 50)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "telefono", length = 15)
	@Length(max = 15)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "porcentaje", precision = 5, scale = 3)
	public BigDecimal getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Column(name = "iva")
	public Boolean getIva() {
		return this.iva;
	}

	public void setIva(Boolean iva) {
		this.iva = iva;
	}

	@Column(name = "numcuenta", length = 20)
	@Length(max = 20)
	public String getNumcuenta() {
		return this.numcuenta;
	}

	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}

	@Column(name = "facturar")
	public Boolean getFacturar() {
		return this.facturar;
	}

	public void setFacturar(Boolean facturar) {
		this.facturar = facturar;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Tasadolarpromotorparametro> getTasadolarpromotorparametros() {
		return this.tasadolarpromotorparametros;
	}

	public void setTasadolarpromotorparametros(
			Set<Tasadolarpromotorparametro> tasadolarpromotorparametros) {
		this.tasadolarpromotorparametros = tasadolarpromotorparametros;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Porcentcomisiontxparampromo> getPorcentcomisiontxparampromos() {
		return this.porcentcomisiontxparampromos;
	}

	public void setPorcentcomisiontxparampromos(
			Set<Porcentcomisiontxparampromo> porcentcomisiontxparampromos) {
		this.porcentcomisiontxparampromos = porcentcomisiontxparampromos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Porcentajecomisiontxparam> getPorcentajecomisiontxparams() {
		return this.porcentajecomisiontxparams;
	}

	public void setPorcentajecomisiontxparams(
			Set<Porcentajecomisiontxparam> porcentajecomisiontxparams) {
		this.porcentajecomisiontxparams = porcentajecomisiontxparams;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Tasaeuropromotorparametro> getTasaeuropromotorparametros() {
		return this.tasaeuropromotorparametros;
	}

	public void setTasaeuropromotorparametros(
			Set<Tasaeuropromotorparametro> tasaeuropromotorparametros) {
		this.tasaeuropromotorparametros = tasaeuropromotorparametros;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Tasadolarparametro> getTasadolarparametros() {
		return this.tasadolarparametros;
	}

	public void setTasadolarparametros(
			Set<Tasadolarparametro> tasadolarparametros) {
		this.tasadolarparametros = tasadolarparametros;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Inventario> getInventarios() {
		return this.inventarios;
	}

	public void setInventarios(Set<Inventario> inventarios) {
		this.inventarios = inventarios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Tasaeuroparametro> getTasaeuroparametros() {
		return this.tasaeuroparametros;
	}

	public void setTasaeuroparametros(Set<Tasaeuroparametro> tasaeuroparametros) {
		this.tasaeuroparametros = tasaeuroparametros;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Establecimientoprecio> getEstablecimientoprecios() {
		return this.establecimientoprecios;
	}

	public void setEstablecimientoprecios(
			Set<Establecimientoprecio> establecimientoprecios) {
		this.establecimientoprecios = establecimientoprecios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Puntoestablecimiento> getPuntoestablecimientos() {
		return this.puntoestablecimientos;
	}

	public void setPuntoestablecimientos(
			Set<Puntoestablecimiento> puntoestablecimientos) {
		this.puntoestablecimientos = puntoestablecimientos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Transaccion> getTransaccions() {
		return this.transaccions;
	}

	public void setTransaccions(Set<Transaccion> transaccions) {
		this.transaccions = transaccions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Autovoz> getAutovozs() {
		return this.autovozs;
	}

	public void setAutovozs(Set<Autovoz> autovozs) {
		this.autovozs = autovozs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "establecimiento")
	public Set<Gravamenestablecimiento> getGravamenestablecimientos() {
		return this.gravamenestablecimientos;
	}

	public void setGravamenestablecimientos(
			Set<Gravamenestablecimiento> gravamenestablecimientos) {
		this.gravamenestablecimientos = gravamenestablecimientos;
	}

}