package com.ltts.team.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.team.model.team;
@Repository
public class teamdao {
	public List<team> getAllTeams()
	{
		List <team> li = new ArrayList<team>();
		li.add(new team(1, "IndiaTeam", "India"));	
		li.add(new team(2, "EnglandTeam", "England"));		
		li.add(new team(3, "AustraliaTeam", "Australia"));		
		return li;		
		
	}
	
}