package Pontoop;

import java.util.ArrayList;

public class GameTracker {

	private int mWin;
	private int mLose;
	private int mDraw;
	private ArrayList <Integer> statArray;
	
	public GameTracker() {
		mWin = 0;
		mLose = 0;
		mDraw = 0;
		statArray = new ArrayList<Integer>();
	}
	
	
	public void addWin() {
		mWin = mWin + 1;
	}
	
	public void addLose() {
		mLose = mLose + 1;
	}
	
	public void addDraw() {
		mDraw = mDraw + 1;
	}
	
	public void addStat() {
		statArray.add(mWin);
		statArray.add(mLose);
		statArray.add(mDraw);
	}
	
	public void printStats() {
		String wins = ""+mWin;
		String losses = ""+mLose;
		String draw = ""+mDraw;
		System.out.println("Wins ="+wins);
		System.out.println("Losses = "+losses);
		System.out.println("Drawn = "+draw);
	}
	
}
