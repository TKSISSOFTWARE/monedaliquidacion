package org.domain.monedaliquidacion.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Config generated by hbm2java
 */
@Entity
@Table(name = "config")
public class Config implements java.io.Serializable {

	private Integer nautovoz;

	public Config() {
	}

	public Config(Integer nautovoz) {
		this.nautovoz = nautovoz;
	}

	@Id
	@Column(name = "nautovoz")
	public Integer getNautovoz() {
		return this.nautovoz;
	}

	public void setNautovoz(Integer nautovoz) {
		this.nautovoz = nautovoz;
	}

}
