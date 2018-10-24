package Pontoop;

import java.util.ArrayList;

public class GameTracker {

	private int mWin;
	private int mLose;
	private int mDraw;
	
	public GameTracker() {
		mWin = 0;
		mLose = 0;
		mDraw = 0;
	}
	
	public void setResult(String result) {
		if(result.equalsIgnoreCase("win")) {
			addWin();
		}else if(result.equalsIgnoreCase("draw")) {
			addDraw();
		}else if(result.equalsIgnoreCase("loss")) {
			addLoss();
		}
	}
	
	
	public void addWin() {
		mWin = mWin + 1;
	}
	
	public void addLoss() {
		mLose = mLose + 1;
	}
	
	public void addDraw() {
		mDraw = mDraw + 1;
	}
	
	public void printResults() {
		System.out.println("Wins = "+mWin);
		System.out.println("Draws = "+mDraw);
		System.out.println("Losses = "+mLose);
	}
	
}
