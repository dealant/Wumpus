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
		MountainCave aa = new MountainCave(a, "City Costco", 
				"there's a Costco in the city, they might have some scales here right?");
		MountainCave ab = new MountainCave(a, "Thrift Store", 
				"Don't think I'm going to find any treasure here");//ends here
		MountainCave ac = new MountainCave(a, "Gas Station",
				"No treasure here either, but good place to refuel on food and snacks");
		MountainCave ad = new MountainCave(a, "Too Big to Fail Bank", 
				"This looks like a giant bank, they probably have some scales, but I can't afford a loan here");//ends here
		//branch b
		MountainCave ba = new MountainCave(b, "Shanty Hut", 
				"This hut is a dead end, there's nowhere else to go");
		MountainCave bb = new MountainCave(b, "Armorer's Store", 
				"This is a good place to repair my armor but no golden scales");
		MountainCave bc = new MountainCave(b, "Witch's Villa", 
				"She was really nice and gave me some advice on how to find scales");
		MountainCave bd = new MountainCave(b, "Fate's Crossroad", 
				"There is a sign reading \" Fate's Crossroad \" and three pathes to take, I have a good feeling about here");
		//branch c ends in layer 1
		//branch d
		MountainCave da = new MountainCave(d, "Mossy Mess", 
				"This path follows a punch of moss and feels really moggy, looks like there's some light further on");
		MountainCave db = new MountainCave(d, "Giant Skull", 
				"looks really creepy, looks like a path was meant to go into it though");
		MountainCave dc = new MountainCave(d, "Pillaged Treasure Room", 
				"Looks like a lot of expensive stuff used to be here, but nothing is here now");
		//Layer 3
		// branch a
		 //		branch aa
		MountainCave aaa = new MountainCave(aa, "Food Aisle", 
				"A lot of yummy food here but not scales"); // end branch
		MountainCave aab = new MountainCave(aa, "Treasure Aisle", 
				"Oh wow there's actually an aisle for treasure, going to explore more closely");
		MountainCave aac = new MountainCave(aa, "Vegetables Section", 
				"Nothing I need today but that's okay"); //end branch
		MountainCave aad = new MountainCave(aa, "Potions Aisle", //end branch
				"Nothing I need today");
		
		aab.setAdjacentToScales(true);
		 //		branch ab ends here
		 //		branch ac
		MountainCave aca = new MountainCave(ac, "Grocery Store",
				"Just food, didn't see any scales");// End branch
		MountainCave acb = new MountainCave(ac, "Museum Galore",
				"There's a lot of pictures of scales but didn't see actual scales, shouldn't steal anyways"); // end branch
		MountainCave acc = new MountainCave(ac, "Zoo King",
				"No Wumpus here either"); // end branch
		 //		branch ad ends here
		 
		// branch b
		  // 	branch ba ends here
		  // 	branch bb
		MountainCave bba = new MountainCave(bb, "Thug Galore", 
				"There were a lot of thugs here but they didn't have any valuable loot"); //end branch
		MountainCave bbb = new MountainCave(bb, "Gargoyle Layer", 
				"Thank god I stopped by the armorer first, really saved my ass"); //end branch
		MountainCave bbc = new MountainCave(bb, "Dragon layer", 
				"barely made it out, not gonna go that way"); //end branch
		MountainCave bbd = new MountainCave(bb, "Troll Bridge", 
				"It was expensive to pay off the troll but I saw some wumpus far off");
		  //  	branch bc
		MountainCave bca = new MountainCave(bc, "Goron's Monster", 
				"The witch said this way will have scales, but she didn't mention this monster! Turning back");//end branch
		  //  	branch bd
		MountainCave bda = new MountainCave(bd, "Fate's End", 
				"All three paths took me to the same place and there's just a sign that said 'gotcha' "
				+ "I guess that signpost was just a cruel joke");
		 
		// branch d
		//		branch da
		MountainCave daa = new MountainCave(da, "Ancient Village", 
				"There is some cool stuff here but no scales");
		//		branch db
		MountainCave dba = new MountainCave(db, "Giant Skull Left", 
				"Past the path there's fork, to the left");
		MountainCave dbb = new MountainCave(db, "Giant Skull Right", 
				"looks really creepy, looks like a path was meant to go into it though");

		//		branch dc ends here
		
		//layer 4
		//branch aab
		MountainCave aaba = new MountainCave(aab, "Gem's Section", 
				"Those look nice but not what I'm looking for");//end branch
		MountainCave aabb = new MountainCave(aab, "Ore Section", 
				"There's silver and gold, wumpus scales are better");//end branch
		MountainCave aabc = new MountainCave(aab, "Wumpus Scale Section", 
				"Wumpus Scales are on sale, I'm just going to come here from now on instead of hunting");
		aabc.setHasScales(true);
		//branch bbd
		MountainCave bbda = new MountainCave(bbd, "Ent Forrest", 
				"I shouldn't go in there, I got lost the last time");//end branch
		MountainCave bbdb = new MountainCave(bbd, "Windy Plains", 
				"There's some wumpus tracks here, I'm on the right path");
		MountainCave bbdc = new MountainCave(bbd, "Outcast Hut", 
				"That hut has been empty for years, I wonder why the outcast was expelled");//end branch
		bbdb.setAdjacentToScales(true);
		//layer 5
		MountainCave bbdba = new MountainCave(bbdb, "Trampled Patch", 
				"Finally found some scales!!!!!");
		bbdba.setHasScales(true);
		MountainCave bbdbb = new MountainCave(bbdb, "Angry Boar Lair", 
				"Wasn't able to search throroughly but probably didn't have any scales");//end branch
		
		
		return root;
	}

}
