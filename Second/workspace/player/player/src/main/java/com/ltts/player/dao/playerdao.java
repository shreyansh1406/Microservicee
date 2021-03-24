package com.ltts.player.dao;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.player.model.player;
@Repository
public class playerdao {
	public List<player> getAllTeams()
	{
		List <player> li = new ArrayList<player>();
		li.add(new player(1, "dhoni", "India"));	
		li.add(new player(2, "rohit", "England"));		
		li.add(new player(3, "kohli", "Australia"));		
		return li;		
		
	}
	
}