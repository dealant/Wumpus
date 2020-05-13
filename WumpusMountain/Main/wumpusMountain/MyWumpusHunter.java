package wumpusMountain;

import java.util.*;

public class MyWumpusHunter extends WumpusHunter {
	
	public MyWumpusHunter() {
	}
	
	public String getName() {
		return "Dealant";
	}
	
	
	@Override
	public void startAt(MountainCave root) {
		Stack<String> caves = new Stack<>();
		while(!root.hasScales()) {
			
			caves.push()
		}
		// TODO create stack to store cave name and store in action log also
		// TODO get cave name and search for adjacent cave name
		// TODO check if scales are here
		// TODO if treasure is found start unloading stack
	}
	

}
