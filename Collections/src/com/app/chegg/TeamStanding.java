package com.app.chegg;

public class TeamStanding implements Comparable<TeamStanding>{
	private String teamName;
	private int noOfgameswon;
	private int noOfgameslost;
	

	public TeamStanding() {
		super();
	}
    

	public TeamStanding(String teamName, int noOfgameswon, int noOfgameslost) {
		super();
		this.teamName = teamName;
		this.noOfgameswon = noOfgameswon;
		this.noOfgameslost = noOfgameslost;
	}
	


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public int getNoOfgameswon() {
		return noOfgameswon;
	}


	public void setNoOfgameswon(int noOfgameswon) {
		this.noOfgameswon = noOfgameswon;
	}


	public int getNoOfgameslost() {
		return noOfgameslost;
	}
    

	@Override
	public String toString() {
		return "TeamStanding [teamName=" + teamName + ", noOfgameswon="
				+ noOfgameswon + ", noOfgameslost=" + noOfgameslost + "]";
	}


	public void setNoOfgameslost(int noOfgameslost) {
		this.noOfgameslost = noOfgameslost;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfgameslost;
		result = prime * result + noOfgameswon;
		result = prime * result
				+ ((teamName == null) ? 0 : teamName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamStanding other = (TeamStanding) obj;
		if (noOfgameslost != other.noOfgameslost)
			return false;
		if (noOfgameswon != other.noOfgameswon)
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}
	double winningPct(){
		    int totalNoOfgames=noOfgameslost+noOfgameswon;
		    double winpercentage=noOfgameswon/totalNoOfgames;
		return winpercentage;
		
	}


	@Override
	public int compareTo(TeamStanding o) {
		if(noOfgameslost==o.noOfgameslost)
		return 0;
		else if(noOfgameslost>o.noOfgameslost)
			return 1;
		else
			return -1;
	}
	

	
}
