package com.lab.tuesday.zooadventure;

public class Angler extends Fish 
{
	private boolean lightWasOn = false;

	public Angler(String gender, String nickname, float weight, String typeOfWater, boolean lightWasOn) 
	{
		super(gender, nickname, weight, typeOfWater);
		this.lightWasOn = lightWasOn;
	}

	public boolean isLightWasOn() 
	{
		return lightWasOn;
	}

	public void setLightWasOn(boolean lightWasOn) 
	{
		this.lightWasOn = lightWasOn;
	}

	@Override
	public String toString() 
	{
		return "n angler fish. It was " + lightWasOn + " that its light was on. angler fish live in " + getTypeOfWater() + " water. The angler we saw was "
				+ getGender() + ". Its name was " + getNickname() + ". The angler weighed" + getWeight() + " pounds.";
	}
	
	
	
}
