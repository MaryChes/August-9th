package com.lab.tuesday.zooadventure;

public class Turtle extends Reptile
{
	private int shellCircumference = 0;

	public Turtle(String gender, String nickname, float weight, String typeOfHabitat, int shellCircumference)
	{
		super(gender, nickname, weight, typeOfHabitat);
		this.shellCircumference = shellCircumference;
	}

	public int getShellCircumference()
	{
		return shellCircumference;
	}

	public void setShellCircumference(int shellCircumference)
	{
		this.shellCircumference = shellCircumference;
	}

	@Override
	public String toString()
	{
		return "turtle. This turtles shell circumference was " + shellCircumference + " inches. This type of turtle usually lives in the " + getTypeOfHabitat()
				+ ". The turtle we saw was a " + getGender() + " named " + getNickname() + ". The turtle weighed" + getWeight()
				+ " pounds.";
	}
	
	
}
