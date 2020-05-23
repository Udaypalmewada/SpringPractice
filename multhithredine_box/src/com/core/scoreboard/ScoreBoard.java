package com.core.scoreboard;

public class ScoreBoard {
	private  static ScoreBoard instance;
	private ScoreBoard() {}
	public static ScoreBoard getInstance()
	{
		instance=new ScoreBoard();
		return instance;
	}
	private long score=0;
	public synchronized void addScore(int runs)
	{
		score=score+runs;
		//System.out.println(score);
	}
	public synchronized long getScore()
	{
		return score;
	}
}