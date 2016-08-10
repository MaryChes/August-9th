package com.lab.tuesday.zooadventure;

import java.util.ArrayList;

public class AdventureZoo {

	public static void main(String[] args) 
	{
		ArrayList<Animal>adventureZoo = new ArrayList<>(10);
		
		Angler anglerA = new Angler("male", "Blinky", 15, "salt", true);
		
		Bear bearA = new Bear("male", "Boo Boo", 245, false, "cave");
		
		Coy coyA = new Coy("female", "Glimmer", 12, "fresh", "orange, gold, and white");
		
		Flamingo flamingoA = new Flamingo("male", "Pinky Pie", 17, 98, "pink");
		
		Frog frogA = new Frog("female", "Sir Hops A-Lot", 8, true, 6);
		
		Lion lionA = new Lion("female", "Grace", 213, false, true);
		
		Penguin penguinA = new Penguin("male", "Vanilla Ice", 35, 54, false);
		
		Salamander salamanderA	= new Salamander("female", "Slimer", 3, false, 9);
		
		Snake snakeA = new Snake("male", "Voldemort", 85, "jungle", true);
		
		Turtle turtleA = new Turtle("female", "Slopoke", 37, "forest", 35);
		
		adventureZoo.add(turtleA);
		adventureZoo.add(snakeA);
		adventureZoo.add(salamanderA);
		adventureZoo.add(penguinA);
		adventureZoo.add(bearA);
		adventureZoo.add(bearA);
		adventureZoo.add(anglerA);
		adventureZoo.add(lionA);
		adventureZoo.add(frogA);
		adventureZoo.add(flamingoA);
		adventureZoo.add(coyA);
		
		System.out.println("Today at the zoo, we saw a " + adventureZoo.get(9));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + adventureZoo.get(8));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + adventureZoo.get(7));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + adventureZoo.get(6));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + adventureZoo.get(5));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + adventureZoo.get(4));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + adventureZoo.get(3));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + adventureZoo.get(2));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + adventureZoo.get(1));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + adventureZoo.get(0));
		System.out.println();

	}

}
