package com.lab.tuesday.zooadventure;

public class Coy extends Fish
{
	private String color = null;

	public Coy(String gender, String nickname, float weight, String typeOfWater, String color) 
	{
		super(gender, nickname, weight, typeOfWater);
		this.color = color;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	@Override
	public String toString() 
	{
		return " type of fish called coy. The coy was " + color + ".  Coy live in" + getTypeOfWater() + " water.  The coy we saw were" + getGender()
				+ ".  The coy's name was " + getNickname() + ". The coy weighed " + getWeight() + "pounds.";
	}
	
	
	
	
	
}
