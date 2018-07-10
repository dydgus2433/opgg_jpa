package com.op.gg.champion;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CHAMPION")
public class Champion {
	
	
	@Id
	@Column(name="ID")
	private	long id;
	
	@Embedded
	Spell	spell;
	
	@Embedded
	Skin	skin;

	@Column(name="WIN_RATE")
	double	winRate;
	
	@Column(name="HP")
	String	hp;
	
	@Column(name="MP")
	String	mp; //Enum으로 할까
	
	boolean	rankedPlayEnabled;
	
	boolean	botEnabled;
	
	boolean	botMnEnabled;
	
	boolean	active;
	
	boolean	freeToPlay;
	
	String	title;
	String	key;
	String	name;
	
	
	//info
	int	difficulty;
	int	attack;
	int	defense;
	int	masic;
	
	String	enemytips;
	
	String	allytips;
	
	String	lore; //암석으로 이루어진 거대한 자연물 ..
	
	String	blurb;
	
	//stat
	
	
	
	
	
	
	

}
