package com.lab.tuesday.zooadventure;

public class Flamingo extends Bird
{
	private String color = null;

	public Flamingo(String gender, String nickname, float weight, float wingspan, String color) 
	{
		super(gender, nickname, weight, wingspan);
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
		return "flamingo. The flamingo was " + color + ". The flamingo had a wingspan of " + getWingspan() + " inches. The flamingo was " + getGender()
				+ ".  It's name was " + getNickname() + ". The flamingo weighed" + getWeight() + " pounds.";
	}
	
	
	
	
}
