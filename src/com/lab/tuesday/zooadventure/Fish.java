package com.lab.tuesday.zooadventure;

public class Fish extends Animal
{
	private String typeOfWater = null;

	public Fish(String gender, String nickname, float weight, String typeOfWater)
	{
		super(gender, nickname, weight);
		this.typeOfWater = typeOfWater;
	}

	public String getTypeOfWater() 
	{
		return typeOfWater;
	}

	public void setTypeOfWater(String typeOfWater) 
	{
		this.typeOfWater = typeOfWater;
	}
	
	
	
}
