package com.lab.tuesday.zooexplore;

import java.util.ArrayList;

public class Zoo 
{
	public static void main(String[] args) 
	{
		ArrayList<Animal>zooblyZoo = new ArrayList<>(10);
		
		Chimpanzee chimpanzeeA = new Chimpanzee("ape", "brown", true, 5, "male", "Bubbles", false, true);
		
		Penguin penguinA = new Penguin("bird", "black and white", false, 2, "male", "Chilly Willy", true, 45.5f);
		
		Lion lionA	= new Lion("feline", "tan", true, 1, "female", "Sheba", 256.7f, false);
		
		Bear bearA = new Bear("Ursidae", "black", true, 4, "male", "Yogi", true, true);
		
		Snake snakeA = new Snake("reptile", "green", false, 17, "female", "Vishnu", 345.95f, false);
	
		Hamster hamsterA = new Hamster("rodent", "orange", true, 1, "male", "Chubby", true, false);
		
		Frog frogA = new Frog("amphibian", "blue and black", false, 2, "female", "Slick", true, 15.9f);
		
		Elephant elephantA = new Elephant("pachyderm", "grey", true, 25, "male", "Stampy", true, 78.35f);
		
		Giraffe giraffeA = new Giraffe("ungulate", "yellow and brown", true, 13, "male", "Stretch", 83.51f, "black");
		
		Otter otterA = new Otter("Lutrinae", "brown", true, 11, "female", "Pearl", true, true);
		
		zooblyZoo.add(otterA);
		zooblyZoo.add(giraffeA);
		zooblyZoo.add(elephantA);
		zooblyZoo.add(hamsterA);
		zooblyZoo.add(snakeA);
		zooblyZoo.add(bearA);
		zooblyZoo.add(frogA);
		zooblyZoo.add(lionA);
		zooblyZoo.add(penguinA);
		zooblyZoo.add(chimpanzeeA);
		
		System.out.println("Today at the zoo, we saw a " + zooblyZoo.get(9));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + zooblyZoo.get(8));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + zooblyZoo.get(7));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + zooblyZoo.get(6));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + zooblyZoo.get(5));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + zooblyZoo.get(4));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + zooblyZoo.get(3));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + zooblyZoo.get(2));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + zooblyZoo.get(1));
		System.out.println();
		System.out.println("Today at the zoo, we saw a " + zooblyZoo.get(0));
		System.out.println();
		
	}
}
