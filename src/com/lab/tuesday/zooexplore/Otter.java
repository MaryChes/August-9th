package com.lab.tuesday.zooexplore;

public class Otter extends Animal 
{
	protected boolean hasTail = false;
	protected boolean canFloat = false;
	
	public Otter(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean hasTail, boolean canFloat) 
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.hasTail = hasTail;
		this.canFloat = canFloat;
	}

	public boolean isHasTail() 
	{
		return hasTail;
	}

	public void setHasTail(boolean hasTail) 
	{
		this.hasTail = hasTail;
	}

	public boolean isCanFloat() 
	{
		return canFloat;
	}

	public void setCanFloat(boolean canFloat) 
	{
		this.canFloat = canFloat;
	}

	@Override
	public String toString() 
	{
		return "n otter. It is " + hasTail + " that otters have tails. It is " + canFloat + " that otters can float. Otters are from the " + species + " species. This otter was " + color
				+ ". It is " + isAMammal + " that otters are mammals. The otter was " + age + " years old. This otter was " + gender + " and its name was " + animalsName
				+ ".";
	}
	
}
