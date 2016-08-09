package com.lab.tuesday.zooexplore;

public class Frog extends Animal
{
	protected boolean isVenomous = false;
	protected float jumpDistance = 0.0f;
	
	public Frog(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean isVenomous, float jumpDistance) 
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.isVenomous = isVenomous;
		this.jumpDistance = jumpDistance;
	}

	public boolean isVenomous() 
	{
		return isVenomous;
	}

	public void setVenomous(boolean isVenomous) 
	{
		this.isVenomous = isVenomous;
	}

	public float getJumpDistance() 
	{
		return jumpDistance;
	}

	public void setJumpDistance(float jumpDistance) 
	{
		this.jumpDistance = jumpDistance;
	}

	@Override
	public String toString() 
	{
		return "frog. It is " + isVenomous + " that this frog was venomous. This frog could jump " + jumpDistance + " inches. Frogs are from the " + species + " species. This frog was "
				+ color + ". It is " + isAMammal + " that a frog is a mammal. This frog was " + age + " years old.  The frog was " + gender + " and its name was "
				+ animalsName + ".";
	}	
	
}
