package com.cl.ex;
public class Match implements Runnable {

	@Override
	public void run() {
		ScoreBoard sboard=null;
		sboard=ScoreBoard.getInstance();
		
		for(int i=1;i<=5;i++)
		{
			sboard.addScore(i);
		}
		long scoreboard= sboard.getScore();
		System.out.println(scoreboard);
		
	}

}