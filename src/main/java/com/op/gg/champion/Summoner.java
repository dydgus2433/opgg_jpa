package com.op.gg.champion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUMMONER")
public class Summoner {
	
	@Id
	@Column(name="ID")
	private	long	id;
	
	@Column(name="NICK_NAME")
	private	String	nickName;
	
	@Column(name="PASSWORD")
	private	String	password;	
	
	private	boolean	hotStreak;
	
	private String	tier;
	
	private	String	queue;
	
	private	String	leagueId;
	
	private	String	veteran;
	
	private	int	wins;
	
	private	int	losses;
	
	private String	playerOrTeamName;
	
	private	boolean	inactive;
	
	private	String	playerOrTeamId;
	
	private	int	leaguePoints;
	
	
	private	String rank	="I";
	
	private	boolean	freshBlood;
	
	
	

}
