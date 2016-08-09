package com.lab.tuesday.zooexplore;

public class Bear extends Animal 
{
	protected boolean eatsFish = false;
	protected boolean hibernates = false;
	
	public Bear(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean eatsFish, boolean hibernates) 
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.eatsFish = eatsFish;
		this.hibernates = hibernates;
	}

	public boolean isEatsFish() 
	{
		return eatsFish;
	}

	public void setEatsFish(boolean eatsFish) 
	{
		this.eatsFish = eatsFish;
	}

	public boolean isHibernates() 
	{
		return hibernates;
	}

	public void setHibernates(boolean hibernates) 
	{
		this.hibernates = hibernates;
	}

	@Override
	public String toString() 
	{
		return "bear. It is " + eatsFish + " that this bear eats fish. It is " + hibernates + " that this bear hibernates. Bears are from the " + species + " species. This bear was " + color
				+ ". It is " + isAMammal + " that a bear is a mammal. This bear was " + age + " years old. This bear was " + gender + " and its name was " + animalsName
				+ ".";
	}
	
}
