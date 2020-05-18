package wumpusMountain;

public class MyMountainFactory extends MountainFactory {

	@Override
	public MountainCave getMountainTop() {
		//Establish root of tree
		MountainCave root = new MountainCave("Mountain Top", 
				"The air density here seems to indicate you're not far from the base of the mountain");
		//Using lettering for branching identification i.e. a, b, c, etc.
		//Layer 1
		MountainCave a = new MountainCave(root, "City Center", 
				"there seems to be a whole city here, how odd");
		MountainCave b = new MountainCave(root, "Fantasy Land", 
				"This looks like a village straight out of lord of the rings");
		MountainCave c = new MountainCave(root, "Anarchy Corner",
				"It's a riot here, even if there were scales, I'm going to turn back");
		MountainCave d = new MountainCave(root, "Plain Cave", 
				"This looks pretty normal, just a plain cave with three different paths");
		//Layer 2
		//Branch a
		//branch b
		//branch c ends in layer 1
		//branch d
		//Layer 3
		
		
		return root;
	}

}
