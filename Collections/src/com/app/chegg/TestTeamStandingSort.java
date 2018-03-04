package com.app.chegg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestTeamStandingSort {
	public static void main(String[] args) {
		ArrayList<TeamStanding> al=new ArrayList<TeamStanding>();
		TeamStanding t1=new TeamStanding("india",70,30);
		TeamStanding t2=new TeamStanding("Australia",80,20);
		TeamStanding t3=new TeamStanding("pakistan",60,40);
		al.add(t1);
		al.add(t2);
		al.add(t3);
		Collections.sort(al);
		Iterator<TeamStanding> it=al.iterator();
		while(it.hasNext()){
			TeamStanding t=it.next();
			System.out.println("TeamName :"+t.getTeamName()+"\t No Of games won :"+t.getNoOfgameswon()+"\t No of games lost : "+t.getNoOfgameslost());
		}
	}

}
