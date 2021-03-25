package com.example.demo;

public class Game {

	
	
	// Method for calculating winner and keeping track of score.
	public static String calcWinner(String firstMove, String secondMove) {
		
		firstMove = firstMove.toLowerCase();
		secondMove = secondMove.toLowerCase();
		String errorMsg = "Incorrect input! " + "Valid inputs: Rock, Paper, or Scissors";
		String result = null;
		String pattern = "{ \"Player 1 \":\"%s\", \"Player 2 \":\"%s\", \"Result \": \"%s\"}";
		ResultBean.rounds++;
		if (firstMove.equals(secondMove)) {
			result = "Round was a tie";
			ResultBean.ties++;
			return String.format(pattern, firstMove, secondMove, result);

		} else if (firstMove.equals("rock") && secondMove.equals("paper")) {
			result = "Paper beats Rock. Player 2 wins!";
			ResultBean.player2_Wins++;
			return String.format(pattern, firstMove, secondMove, result);

		} else if (firstMove.equals("rock") && secondMove.equals("scissors")) {
			result = "Rock beats Scissors. Player 1 wins!";
			ResultBean.player1_Wins++;
			return String.format(pattern, firstMove, secondMove, result);

		} else if (firstMove.equals("paper") && secondMove.equals("rock")) {
			result = "Paper beats Rock. Player 1 wins!";
			ResultBean.player1_Wins++;
			return String.format(pattern, firstMove, secondMove, result);

		} else if (firstMove.equals("paper") && secondMove.equals("scissors")) {
			result = "Scissors beats Paper. Player 2 wins!";
			ResultBean.player2_Wins++;
			return String.format(pattern, firstMove, secondMove, result);

		} else if (firstMove.equals("scissors") && secondMove.equals("rock")) {
			result = "Rock beats Scissors. Player 2 wins!";
			ResultBean.player2_Wins++;
			return String.format(pattern, firstMove, secondMove, result);

		} else if (firstMove.equals("scissors") && secondMove.equals("paper")) {
			result = "Scissors beats Paper. Player 1 wins!";
			ResultBean.player1_Wins++;
			return String.format(pattern, firstMove, secondMove, result);

		} else {
			System.out.println("\nInvalid input!\n" + "Correct inputs: Rock, Paper, or Scissors");
			return String.format(pattern, firstMove, secondMove, errorMsg);
		}
		

	}

}
