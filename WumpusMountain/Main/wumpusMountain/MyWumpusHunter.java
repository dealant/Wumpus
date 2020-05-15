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
		String location = "";
		while(!root.hasScales()) {
			location = root.getCaveName();
			caves.push(location);
			this.actionLog += "Enterting the" + location + "/n";
			ArrayList<MountainCave> paths = root.getChildren();
			if(paths.size()>0) {
				root = paths.get(0);
			}
			paths.clear();
		}
		// TODO create stack to store cave name and store in action log also
		// TODO get cave name and search for adjacent cave name
		// TODO check if scales are here
		// TODO if treasure is found start unloading stack
	}
	

}
