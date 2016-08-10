package com.lab.tuesday.zooadventure;

public class Snake extends Reptile
{
	private boolean isVenomous = false;

	public Snake(String gender, String nickname, float weight, String typeOfHabitat, boolean isVenomous)
	{
		super(gender, nickname, weight, typeOfHabitat);
		this.isVenomous = isVenomous;
	}

	public boolean isVenomous()
	{
		return isVenomous;
	}

	public void setVenomous(boolean isVenomous)
	{
		this.isVenomous = isVenomous;
	}

	@Override
	public String toString()
	{
		return " snake. It is " + isVenomous + " that the snake we saw was venomous. This type of snake usually lives in the " + getTypeOfHabitat() + ". The snake was a "
				+ getGender() + " named " + getNickname() + ". The snake weighed " + getWeight() + " pounds.";
	}
	
	
}
