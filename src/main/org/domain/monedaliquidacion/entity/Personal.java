package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Personal generated by hbm2java
 */
@Entity
@Table(name = "personal")
public class Personal implements java.io.Serializable {

	private String documento;
	private Cargo cargo;
	private String tipodocumento;
	private String nombre;
	private String apellido;
	private String celular;
	private String telefono;
	private String pinbb;
	private String direccion;
	private String correo;
	private String correoalternativo;
	private Date fechanac;
	private Date ultmactualizacion;
	private Boolean correosalerta;
	private Set<Gastos> gastoses = new HashSet<Gastos>(0);
	private Set<Comisionhistorico> comisionhistoricos = new HashSet<Comisionhistorico>(
			0);
	private Gestor gestor;
	private Arrastrador arrastrador;
	private Set<Saldo> saldos = new HashSet<Saldo>(0);
	private Administrativo administrativo;
	private Promotor promotor;
	private Asesor asesor;

	public Personal() {
	}

	public Personal(String documento, String nombre) {
		this.documento = documento;
		this.nombre = nombre;
	}

	public Personal(String documento, Cargo cargo, String tipodocumento,
			String nombre, String apellido, String celular, String telefono,
			String pinbb, String direccion, String correo,
			String correoalternativo, Date fechanac, Date ultmactualizacion,
			Boolean correosalerta, Set<Gastos> gastoses,
			Set<Comisionhistorico> comisionhistoricos, Gestor gestor,
			Arrastrador arrastrador, Set<Saldo> saldos,
			Administrativo administrativo, Promotor promotor, Asesor asesor) {
		this.documento = documento;
		this.cargo = cargo;
		this.tipodocumento = tipodocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.telefono = telefono;
		this.pinbb = pinbb;
		this.direccion = direccion;
		this.correo = correo;
		this.correoalternativo = correoalternativo;
		this.fechanac = fechanac;
		this.ultmactualizacion = ultmactualizacion;
		this.correosalerta = correosalerta;
		this.gastoses = gastoses;
		this.comisionhistoricos = comisionhistoricos;
		this.gestor = gestor;
		this.arrastrador = arrastrador;
		this.saldos = saldos;
		this.administrativo = administrativo;
		this.promotor = promotor;
		this.asesor = asesor;
	}

	@Id
	@Column(name = "documento", unique = true, nullable = false, length = 15)
	@NotNull
	@Length(max = 15)
	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codcargo")
	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Column(name = "tipodocumento", length = 3)
	@Length(max = 3)
	public String getTipodocumento() {
		return this.tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	@Column(name = "nombre", nullable = false, length = 50)
	@NotNull
	@Length(max = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellido", length = 50)
	@Length(max = 50)
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Column(name = "celular", length = 15)
	@Length(max = 15)
	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Column(name = "telefono", length = 15)
	@Length(max = 15)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "pinbb", length = 20)
	@Length(max = 20)
	public String getPinbb() {
		return this.pinbb;
	}

	public void setPinbb(String pinbb) {
		this.pinbb = pinbb;
	}

	@Column(name = "direccion", length = 150)
	@Length(max = 150)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "correo", length = 50)
	@Length(max = 50)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "correoalternativo", length = 50)
	@Length(max = 50)
	public String getCorreoalternativo() {
		return this.correoalternativo;
	}

	public void setCorreoalternativo(String correoalternativo) {
		this.correoalternativo = correoalternativo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechanac", length = 29)
	public Date getFechanac() {
		return this.fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ultmactualizacion", length = 22)
	public Date getUltmactualizacion() {
		return this.ultmactualizacion;
	}

	public void setUltmactualizacion(Date ultmactualizacion) {
		this.ultmactualizacion = ultmactualizacion;
	}

	@Column(name = "correosalerta")
	public Boolean getCorreosalerta() {
		return this.correosalerta;
	}

	public void setCorreosalerta(Boolean correosalerta) {
		this.correosalerta = correosalerta;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<Gastos> getGastoses() {
		return this.gastoses;
	}

	public void setGastoses(Set<Gastos> gastoses) {
		this.gastoses = gastoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<Comisionhistorico> getComisionhistoricos() {
		return this.comisionhistoricos;
	}

	public void setComisionhistoricos(Set<Comisionhistorico> comisionhistoricos) {
		this.comisionhistoricos = comisionhistoricos;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personal")
	@Length(max = 15)
	public Gestor getGestor() {
		return this.gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personal")
	@Length(max = 15)
	public Arrastrador getArrastrador() {
		return this.arrastrador;
	}

	public void setArrastrador(Arrastrador arrastrador) {
		this.arrastrador = arrastrador;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personal")
	public Set<Saldo> getSaldos() {
		return this.saldos;
	}

	public void setSaldos(Set<Saldo> saldos) {
		this.saldos = saldos;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personal")
	@Length(max = 15)
	public Administrativo getAdministrativo() {
		return this.administrativo;
	}

	public void setAdministrativo(Administrativo administrativo) {
		this.administrativo = administrativo;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personal")
	@Length(max = 15)
	public Promotor getPromotor() {
		return this.promotor;
	}

	public void setPromotor(Promotor promotor) {
		this.promotor = promotor;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personal")
	@Length(max = 15)
	public Asesor getAsesor() {
		return this.asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

}