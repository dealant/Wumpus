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
		//initialize a stack to store cave names
		Stack<String> caves = new Stack<>();
		//initialize a String variable to store the cave name
		String location = "";
		//initialize a random object to pick the following path
		Random rand = new Random();
		while(!root.hasScales()) {
			// TODO check if scales are here
			location = root.getCaveName();//stores cave name in location variable
			if(!caves.contains(location)) {
				caves.push(location);//store the current cave name in the stack
				this.actionLog += "Enterting the " + location + "\n";//puts location in actionlog
				//TODO need to add case for when scales are at adjacent cave
				if(root.isAdjacentToScales()) {
					this.actionLog += "We've neared the scales \n";
				}
			}
			//gets children cave name and stores in array
			ArrayList children = root.getChildren();
			ArrayList<MountainCave> paths = children;
			int routes = paths.size();
			if(routes>0) {//checks if the current cave has any children
				//if it does, the next cave is picked randomly 
				int choice = rand.nextInt(routes);
				root = paths.get(choice);
				paths.remove(choice);
			}else if(routes == 0 && root.getCaveName() != "Mountain Top"){
				//at dead end it returns to the parent, need to search new routes
				root = root.getParent();
				//removes the current cave if it's a dead end from the stack
				caves.pop();
			}
		}
		//once while loop has left, root is now the cave with the scales
		//print end message
		this.actionLog += "Entering the " + root.getCaveName() + "\nWe've found the scales!...The path is... \n";
		caves.push(root.getCaveName());
		//scales are found so start unloading stack
		//reverse stack for first in first out output
		Stack<String> direct_path = new Stack<>();
		while(!caves.isEmpty()) {
			direct_path.push(caves.pop());
		}
		//print beginning path message
		this.actionLog += "Start at the " + direct_path.pop();
		//unload remaining path
		while(!direct_path.isEmpty()) {
			this.actionLog += " and\nthen visit the " + direct_path.pop();
		}
	}
	

}
