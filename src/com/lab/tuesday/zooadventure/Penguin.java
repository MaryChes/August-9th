package com.lab.tuesday.zooadventure;

public class Penguin extends Bird 
{
	private boolean itFlies = false;

	public Penguin(String gender, String nickname, float weight, float wingspan, boolean itFlies) 
	{
		super(gender, nickname, weight, wingspan);
		this.itFlies = itFlies;
	}

	public boolean isItFlies() 
	{
		return itFlies;
	}

	public void setItFlies(boolean itFlies) 
	{
		this.itFlies = itFlies;
	}

	@Override
	public String toString() 
	{
		return "penguin. It is " + itFlies + " that a penguin can fly. The penguin's wingspan was" + getWingspan() + "inches.  The penguin was a " + getGender()
				+ " named " + getNickname() + ". The penguin weighed " + getWeight() + "pounds.";
	}
	
	
	
	
	
	
	
}
