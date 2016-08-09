package com.lab.tuesday.zooexplore;

public class Giraffe extends Animal
{
	protected float neckLength = 0.0f;
	protected String tongueColor = null;
	
	public Giraffe(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			float neckLength, String tongueColor) 
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.neckLength = neckLength;
		this.tongueColor = tongueColor;
	}

	public float getNeckLength() 
	{
		return neckLength;
	}

	public void setNeckLength(float neckLength) 
	{
		this.neckLength = neckLength;
	}

	public String getTongueColor() 
	{
		return tongueColor;
	}

	public void setTongueColor(String tongueColor) 
	{
		this.tongueColor = tongueColor;
	}

	@Override
	public String toString() 
	{
		return "giraffe. The giraffe's neck was " + neckLength + " inches long. The giraffe's tongue color was " + tongueColor + ". Giraffes are from the " + species
				+ " species. This giraffe was " + color + ". It is " + isAMammal + " that a giraffe is a mammal. The giraffe we saw was " + age + " years old. The giraffe was " + gender
				+ ", and its name was " + animalsName + ".";
	}
	
}
