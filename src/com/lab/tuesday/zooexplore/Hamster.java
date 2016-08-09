package com.lab.tuesday.zooexplore;

public class Hamster extends Animal
{
	protected boolean isNocturnal = false;
	protected boolean hasTail = false;
	
	public Hamster(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean isNocturnal, boolean hasTail) 
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.isNocturnal = isNocturnal;
		this.hasTail = hasTail;
	}

	public boolean isNocturnal() 
	{
		return isNocturnal;
	}

	public void setNocturnal(boolean isNocturnal) 
	{
		this.isNocturnal = isNocturnal;
	}

	public boolean isHasTail() 
	{
		return hasTail;
	}

	public void setHasTail(boolean hasTail) 
	{
		this.hasTail = hasTail;
	}

	@Override
	public String toString() {
		return "hamster. It is " + isNocturnal + " that a hamster is nocturnal. It is " + hasTail + " that this hamster had a tail. Hamsters are from the " + species + " species. This hamster was "
				+ color + ". It is " + isAMammal + " that a hamster is a mammal. This hamster was " + age + " years old. This hamster was " + gender + " and its name was "
				+ animalsName + ".";
	}
	
}
