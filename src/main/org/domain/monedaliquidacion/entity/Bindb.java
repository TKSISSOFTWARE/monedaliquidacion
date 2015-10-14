package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Bindb generated by hbm2java
 */
@Entity
@Table(name = "bindb")
public class Bindb implements java.io.Serializable {

	private String bin;
	private String nombrebanco;
	private String pais;
	private String ciudad;
	private String producto;

	public Bindb() {
	}

	public Bindb(String bin) {
		this.bin = bin;
	}

	public Bindb(String bin, String nombrebanco, String pais, String ciudad,
			String producto) {
		this.bin = bin;
		this.nombrebanco = nombrebanco;
		this.pais = pais;
		this.ciudad = ciudad;
		this.producto = producto;
	}

	@Id
	@Column(name = "bin", unique = true, nullable = false, length = 8)
	@NotNull
	@Length(max = 8)
	public String getBin() {
		return this.bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	@Column(name = "nombrebanco", length = 80)
	@Length(max = 80)
	public String getNombrebanco() {
		return this.nombrebanco;
	}

	public void setNombrebanco(String nombrebanco) {
		this.nombrebanco = nombrebanco;
	}

	@Column(name = "pais", length = 70)
	@Length(max = 70)
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Column(name = "ciudad", length = 30)
	@Length(max = 30)
	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "producto", length = 40)
	@Length(max = 40)
	public String getProducto() {
		return this.producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

}