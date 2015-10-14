package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.validator.Length;

/**
 * Rol generated by hbm2java
 */
@Entity
@Table(name = "rol")
public class Rol implements java.io.Serializable {

	private int idrol;
	private String descripcion;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);

	public Rol() {
	}

	public Rol(int idrol) {
		this.idrol = idrol;
	}

	public Rol(int idrol, String descripcion, Set<Usuario> usuarios) {
		this.idrol = idrol;
		this.descripcion = descripcion;
		this.usuarios = usuarios;
	}

	@Id
	@Column(name = "idrol", unique = true, nullable = false)
	public int getIdrol() {
		return this.idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	@Column(name = "descripcion", length = 50)
	@Length(max = 50)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "rols")
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}