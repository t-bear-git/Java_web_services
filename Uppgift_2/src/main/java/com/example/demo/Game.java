package com.example.demo;

import java.util.ArrayList;

public class Game {

	public static ArrayList<ResultBean> savedRounds = new ArrayList<ResultBean>();
	
	// Method for calculating winner and keeping track of score.
	public static String calcWinner(String firstMove, String secondMove) {
		
		firstMove = firstMove.toLowerCase();
		secondMove = secondMove.toLowerCase();
		String errorMsg = "Incorrect input! " + "Valid inputs: Rock, Paper, or Scissors";
		String result = null;
		String returnPattern = "  {\"RPS Game\": [";
		String pattern = "{ \"Round number\":\"%s\", \"Player 1 \":\"%s\", \"Player 2 \":\"%s\", \"Result \": \"%s\"}";
		
		System.out.println(ResultBean.round);
		ResultBean.round++;
	
		
		if (firstMove.equals(secondMove)) {
			result = "Round was a tie";
			ResultBean.ties++;
			ResultBean oneRound = new ResultBean(ResultBean.round, firstMove, secondMove, result);
			savedRounds.add(oneRound);
			returnPattern += String.format(pattern, ResultBean.round, firstMove, secondMove, result);
			returnPattern += "]}";
			return returnPattern;

		} else if (firstMove.equals("rock") && secondMove.equals("paper")) {
			result = "Paper beats Rock. Player 2 wins!";
			ResultBean.player2_Wins++;
			ResultBean oneRound = new ResultBean(ResultBean.round, firstMove, secondMove, result);
			savedRounds.add(oneRound);
			returnPattern += String.format(pattern, ResultBean.round, firstMove, secondMove, result);
			returnPattern += "]}";
			return returnPattern;

		} else if (firstMove.equals("rock") && secondMove.equals("scissors")) {
			result = "Rock beats Scissors. Player 1 wins!";
			ResultBean.player1_Wins++;
			ResultBean oneRound = new ResultBean(ResultBean.round, firstMove, secondMove, result);
			savedRounds.add(oneRound);
			returnPattern += String.format(pattern, ResultBean.round, firstMove, secondMove, result);
			returnPattern += "]}";
			return returnPattern;

		} else if (firstMove.equals("paper") && secondMove.equals("rock")) {
			result = "Paper beats Rock. Player 1 wins!";
			ResultBean.player1_Wins++;
			ResultBean oneRound = new ResultBean(ResultBean.round, firstMove, secondMove, result);
			savedRounds.add(oneRound);
			returnPattern += String.format(pattern, ResultBean.round, firstMove, secondMove, result);
			returnPattern += "]}";
			return returnPattern;

		} else if (firstMove.equals("paper") && secondMove.equals("scissors")) {
			result = "Scissors beats Paper. Player 2 wins!";
			ResultBean.player2_Wins++;
			ResultBean oneRound = new ResultBean(ResultBean.round, firstMove, secondMove, result);
			savedRounds.add(oneRound);
			returnPattern += String.format(pattern, ResultBean.round, firstMove, secondMove, result);
			returnPattern += "]}";
			return returnPattern;

		} else if (firstMove.equals("scissors") && secondMove.equals("rock")) {
			result = "Rock beats Scissors. Player 2 wins!";
			ResultBean.player2_Wins++;
			ResultBean oneRound = new ResultBean(ResultBean.round, firstMove, secondMove, result);
			savedRounds.add(oneRound);
			returnPattern += String.format(pattern, ResultBean.round, firstMove, secondMove, result);
			returnPattern += "]}";
			return returnPattern;

		} else if (firstMove.equals("scissors") && secondMove.equals("paper")) {
			result = "Scissors beats Paper. Player 1 wins!";
			ResultBean.player1_Wins++;
			ResultBean oneRound = new ResultBean(ResultBean.round, firstMove, secondMove, result);
			savedRounds.add(oneRound);
			returnPattern += String.format(pattern, ResultBean.round, firstMove, secondMove, result);
			returnPattern += "]}";
			return returnPattern;

		} else {
			System.out.println("\nInvalid input!\n" + "Correct inputs: Rock, Paper, or Scissors");
			returnPattern += String.format(pattern, ResultBean.round, firstMove, secondMove, errorMsg);
			returnPattern += "]}";
			return returnPattern;
		}
		

	}

}
