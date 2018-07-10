package com.op.gg.champion;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
@Embeddable
public class Skin {
	
	int	num;
	
	String	id;
	
	@Column(name="SKIN_TITLE")
	private	String name;
	
}
