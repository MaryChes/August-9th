package com.lab.tuesday.zooexplore;

public class Snake extends Animal 
{
	protected float length = 0.0f;
	protected boolean isVenomous = false;

	public Snake(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			float length, boolean isVenomous) 
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.length = length;
		this.isVenomous = isVenomous;
	}

	public float getLength() 
	{
		return length;
	}

	public void setLength(float length)
	{
		this.length = length;
	}

	public boolean isVenomous() 
	{
		return isVenomous;
	}

	public void setVenomous(boolean isVenomous) 
	{
		this.isVenomous = isVenomous;
	}

	@Override
	public String toString() 
	{
		return " snake. The snake was " + length + " inches long. It was " + isVenomous + " that the snake we saw was venomous. Snakes are from the " + species + " species. This snake was " + color
				+ ". It is " + isAMammal + " that a snake is a mammal. This snakes was " + age + " years old. This snake was " + gender + " and its name was " + animalsName
				+ ".";
	}
	
}
