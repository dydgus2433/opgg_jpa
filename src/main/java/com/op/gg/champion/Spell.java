package com.op.gg.champion;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
@Embeddable
public class Spell {
	
	@Column(name="COMMENT")
	private	String comment;
	
	@Column(name="AP_DAMAGE")
	private	String apDamage;
	
	@Column(name="AD_DAMAGE")
	private	String adDamage;
	
	String	cooldownBurn;
	
	String	key;
	
	String	resource; //"마나 {{ cost }}"

}
