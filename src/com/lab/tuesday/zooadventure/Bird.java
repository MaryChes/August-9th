package com.lab.tuesday.zooadventure;

public class Bird extends Animal
{
	private float wingspan = 0.0f;

	public Bird(String gender, String nickname, float weight, float wingspan) 
	{
		super(gender, nickname, weight);
		this.wingspan = wingspan;
	}

	public float getWingspan() 
	{
		return wingspan;
	}

	public void setWingspan(float wingspan) 
	{
		this.wingspan = wingspan;
	}
	
	
	
}
