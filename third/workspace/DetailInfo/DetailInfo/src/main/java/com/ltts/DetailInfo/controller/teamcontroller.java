package com.ltts.DetailInfo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.DetailInfo.model.team;
@RestController
public class teamcontroller {
	@Autowired
	RestTemplate rt;
	
	
	@RequestMapping("/tdetail")
	public List<team> getExternalTeam(){
		/*
		 * //List<Team> li=new ArrayList<Team> List<Team>
		 * li=rt.getForObject("http://localhost:8080/teams", Team.class); return li;
		 * 
		 */
		
		/*
		 * ResponseEntity<List<Team>> responseEntity =
		 * rt.exchange("http://localhost:8080/teams", HttpMethod.GET, null, new
		 * ParameterizedTypeReference<List<Team>>() { }); List<Team> li =
		 * Arrays.asList(responseEntity.getBody()); return li;
		 */
		
		ResponseEntity<team[]> response =
				  rt.getForEntity(
				  "http://localhost:8082/teams/",
				  team[].class);
				team[] teams = response.getBody();
				List<team> lt=Arrays.asList(teams);
				
				//player
				//plist array
				
				//List<Player> plt=Arrays.asList(players);
				
				//List<Combined> comlist 
				//combine
				//return the combined list
				return lt;

}
}
