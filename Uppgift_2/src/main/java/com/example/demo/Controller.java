package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	// Make POST request in preferred way to http://localhost:8080/rps
	@RequestMapping(value = "/rps", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String playRPS(@RequestParam String firstMove, @RequestParam String secondMove) {
	
			return Game.calcWinner(firstMove, secondMove);
	}
	
	// Make GET request to http://localhost:8080/rps followed by parameters firstMove= & secondMove=
	@RequestMapping(value = "/rps", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String playerMove(@RequestParam String firstMove, @RequestParam String secondMove) {
		
		return Game.calcWinner(firstMove, secondMove);
		
	}
	
	// GET request to http://localhost:8080/rps/score to view the current score.
	@RequestMapping(value = "/rps/score", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getResultBean() {
		String pattern = "{ \"Player 1 Score\":\"%s\", \"Player 2 Score\":\"%s\", \"Tied rounds\": \"%s\"}";
		return String.format(pattern, ResultBean.player1_Wins, ResultBean.player2_Wins, ResultBean.ties);

	}
	

}
