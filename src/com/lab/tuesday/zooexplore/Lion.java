package com.lab.tuesday.zooexplore;

public class Lion extends Animal
{
	protected float weight = 0.0f;
	protected boolean isAlpha = false;
	
	public Lion(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			float weight, boolean isAlpha) 
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.weight = weight;
		this.isAlpha = isAlpha;
	}

	public float getWeight() 
	{
		return weight;
	}

	public void setWeight(float weight) 
	{
		this.weight = weight;
	}

	public boolean isAlpha() 
	{
		return isAlpha;
	}

	public void setAlpha(boolean isAlpha) 
	{
		this.isAlpha = isAlpha;
	}

	@Override
	public String toString() 
	{
		return "lion that weighed " + weight + " pounds. It was " + isAlpha + " that the lion was an alpha lion. Lions are from the " + species + " species. Its color was " + color
				+ ". It is " + isAMammal + " that a lion is a mammal. This lion was " + age + " years old. The lion was " + gender + " and its name was " + animalsName
				+ ".";
	}
	
}
