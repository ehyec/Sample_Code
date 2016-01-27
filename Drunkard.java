/**
 * Eunhye Choi
 * ec3135
 * HW6 - Part1: The Drunkard's Random Walk on an infinite grid of
 * avenues(x)/streets(y).
 */

import java.util.Random;

public class Drunkard {
	/*constructor*/
	/*instance variables*/
	private	int startAve;	//initial position x
	private	int startSt;	//initial position y
	private int endAve;		//final position x
	private int endSt;		//final position y

	public Drunkard (int avenue, int street) {
		this.startAve = avenue; 
		this.startSt = street; 
		this.endAve = avenue; 
		this.endSt = street; 
	}
	
	/*method*/
	//direction in 4 ways
	public void step() {
		int random = (int) (Math.random() * 4);
		
		if (random == 0) {
				endAve += 1; //north
		}
		if (random == 1) {
				endSt += 1; //east
		}
		if (random == 2) {
				endSt -= 1; //west
		}
		if (random == 3) {
				endAve -= 1; //south
		}
	} 
	
	
	public void fastForward (int steps) {
		for (int i = 0; i <= steps; i++) {
			step();	//call it step
		}
	} 
	

	public String getLocation() { 
		String location = endAve + "avenue" + endSt + "street";	// (Integer). Integer.toString(int).
		return location;
	} 
	

	//reports the drunkards distance in blocks
	public int howFar() {
	 	int distance = Math.abs(startAve - endAve) + Math.abs(startSt - endSt);
		return distance;
	} 
}