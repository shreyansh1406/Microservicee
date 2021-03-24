package com.ltts.player.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.player.dao.playerdao;
import com.ltts.player.model.player;

@RestController
public class playercontroller {
		
	@Autowired
	playerdao td;
	
	  @GetMapping(value="/players")
	    public List<player> index() {
	        return td.getAllTeams();
	    }
}
 