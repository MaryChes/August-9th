package com.lab.tuesday.zooexplore;

public class Elephant extends Animal
{
	protected boolean hasTusks = false;
	protected float trunkLength = 0.0f;
	
	public Elephant(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean hasTusks, float trunkLength) 
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.hasTusks = hasTusks;
		this.trunkLength = trunkLength;
	}

	public boolean isHasTusks() 
	{
		return hasTusks;
	}

	public void setHasTusks(boolean hasTusks) 
	{
		this.hasTusks = hasTusks;
	}

	public float getTrunkLength() 
	{
		return trunkLength;
	}

	public void setTrunkLength(float trunkLength) 
	{
		this.trunkLength = trunkLength;
	}

	@Override
	public String toString() 
	{
		return "n elephant. It was " + hasTusks + " that the elephant had tusks. The elephant's trunk length was " + trunkLength + " inches. Elephants are from the " + species + " species. This elephant was "
				+ color + ". It is " + isAMammal + " that elephants are mammals. The elephant we saw was " + age + " years old. The elephant was " + gender + " and its name was "
				+ animalsName + ".";
	}
	
}
