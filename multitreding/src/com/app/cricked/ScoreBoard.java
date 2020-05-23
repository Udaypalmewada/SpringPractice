package com.app.cricked;


public class ScoreBoard {
	private  static ScoreBoard instance;
	private ScoreBoard() {}
	public static ScoreBoard getInstance()
	{
		instance=new ScoreBoard();
		return instance;
	}

	public  void addScore(int runs)
	{
		 long score=0;
		score=score+runs;
		System.out.println(score);
	}
	public  long getScore()
	{
		 long score=0;
		return score;
	}
}