package com.cl.ex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ScoreBoard {
	private  static ScoreBoard instance;
	Lock rl=null;
	private ScoreBoard() {
		rl=new ReentrantLock();
	}
	public static ScoreBoard getInstance()
	{
		instance=new ScoreBoard();
		return instance;
	}
	private long score=0;
	public  void addScore(int runs)
	{
		rl.lock();
		score=score+runs;
		rl.unlock();
	}
	
	public  long getScore()
	{
		rl.lock();
		return score;
	}
	
    
}