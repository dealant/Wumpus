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
			// TODO get cave name
			caves.push(location);//store the current cave name in the stack
			this.actionLog += "Enterting the" + location + "/n";//puts location in actionlog
			// TODO create stack to store cave name and store in action log also
			System.out.println(location);//
			// TODO search for adjacent cave name
			ArrayList<MountainCave> paths = root.getChildren();
			int routes = paths.size();
			if(routes>0) {
				root = paths.get(rand.nextInt(routes));
			}else if(routes == 0){
				root = root.getParent();
				//TODO at dead end it returns to the parent, need to search new routes
			}
			paths.clear();
			//TODO need to add case for when scales are at adjacent cave
		}//TODO case if scales are found
		// TODO if treasure is found start unloading stack
	}
	

}
