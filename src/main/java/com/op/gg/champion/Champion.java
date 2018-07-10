package com.op.gg.champion;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="champion")
public class Champion {
	
	
	
	String id;
	
	@Embedded
	Skill	skill;
	@Embedded
	Skin	skin;

	double	winRate;
	String	hp;
	String	mp; //Enum으로 할까
	
	
	
	

}
