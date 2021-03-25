package com.example.demo;

public class ResultBean {
	
	public static int round, player1_Wins, player2_Wins, ties;
	
	public int roundnmb;
	
	public String firstMove, secondMove, result;
	

	
	public ResultBean(int roundnmb, String firstMove, String secondMove, String result) {
		this.roundnmb = roundnmb;
		this.firstMove = firstMove;
		this.secondMove = secondMove;
		this.result = result;
		
	}
	

}
