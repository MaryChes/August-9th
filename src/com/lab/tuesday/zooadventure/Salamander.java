package com.lab.tuesday.zooadventure;

public class Salamander extends Amphibian
{
	private int tailLength = 0;

	public Salamander(String gender, String nickname, float weight, boolean goesThroughMetamorphosis, int tailLength)
	{
		super(gender, nickname, weight, goesThroughMetamorphosis);
		this.tailLength = tailLength;
	}

	public int getTailLength()
	{
		return tailLength;
	}

	public void setTailLength(int tailLength)
	{
		this.tailLength = tailLength;
	}

	@Override
	public String toString()
	{
		return " salamander with a tail that was " + tailLength + " inches lomg. It is " + isGoesThroughMetamorphosis()
				+ " that the salamander goes through metamorphosis. The salamander was a " + getGender() + " named " + getNickname() + ". The salamander weighed " + getWeight()
				+ "grams.";
	}
	
	
	
}
