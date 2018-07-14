package com.op.gg.champion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUMMONER")
public class Summoner {

	@Id
	@Column(name = "ID")
	private long id;

	@Column(name = "NICK_NAME")
	private String nickName;

	@Column(name = "PASSWORD")
	private String password;

	private boolean hotStreak;

	private String tier;

	private String queue;

	private String leagueId;

	private String veteran;

	private int wins;

	private int losses;

	private String playerOrTeamName;

	private boolean inactive;

	private String playerOrTeamId;

	private int leaguePoints;

	private String rank = "I";

	private boolean freshBlood;

	@Override
	public String toString() {
		return "Summoner [id=" + id + ", nickName=" + nickName + ", password=" + password + ", hotStreak=" + hotStreak
				+ ", tier=" + tier + ", queue=" + queue + ", leagueId=" + leagueId + ", veteran=" + veteran + ", wins="
				+ wins + ", losses=" + losses + ", playerOrTeamName=" + playerOrTeamName + ", inactive=" + inactive
				+ ", playerOrTeamId=" + playerOrTeamId + ", leaguePoints=" + leaguePoints + ", rank=" + rank
				+ ", freshBlood=" + freshBlood + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isHotStreak() {
		return hotStreak;
	}

	public void setHotStreak(boolean hotStreak) {
		this.hotStreak = hotStreak;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getVeteran() {
		return veteran;
	}

	public void setVeteran(String veteran) {
		this.veteran = veteran;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public String getPlayerOrTeamName() {
		return playerOrTeamName;
	}

	public void setPlayerOrTeamName(String playerOrTeamName) {
		this.playerOrTeamName = playerOrTeamName;
	}

	public boolean isInactive() {
		return inactive;
	}

	public void setInactive(boolean inactive) {
		this.inactive = inactive;
	}

	public String getPlayerOrTeamId() {
		return playerOrTeamId;
	}

	public void setPlayerOrTeamId(String playerOrTeamId) {
		this.playerOrTeamId = playerOrTeamId;
	}

	public int getLeaguePoints() {
		return leaguePoints;
	}

	public void setLeaguePoints(int leaguePoints) {
		this.leaguePoints = leaguePoints;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public boolean isFreshBlood() {
		return freshBlood;
	}

	public void setFreshBlood(boolean freshBlood) {
		this.freshBlood = freshBlood;
	}
	
	
	

}
