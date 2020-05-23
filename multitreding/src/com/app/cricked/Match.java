package com.app.cricked;

public class Match implements Runnable {

	@Override
	public void run() {
			ScoreBoard sboard=null;
			sboard=ScoreBoard.getInstance();
			
			for(int i=0;i<=5;i++)
			{
				sboard.addScore(i);
			}
			long scoreboard= sboard.getScore();
			System.out.println(scoreboard);
	}

}