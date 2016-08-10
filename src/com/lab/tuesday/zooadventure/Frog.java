package com.lab.tuesday.zooadventure;

public class Frog extends Amphibian
{
	private int jumpDistance = 0;

	public Frog(String gender, String nickname, float weight, boolean goesThroughMetamorphosis, int jumpDistance)
	{
		super(gender, nickname, weight, goesThroughMetamorphosis);
		this.jumpDistance = jumpDistance;
	}

	public int getJumpDistance()
	{
		return jumpDistance;
	}

	public void setJumpDistance(int jumpDistance)
	{
		this.jumpDistance = jumpDistance;
	}

	@Override
	public String toString()
	{
		return " frog that could jump " + jumpDistance + " feet. It is " + isGoesThroughMetamorphosis()
				+ " that the frog goes through metamorphosis. The frog was a " + getGender() + " named " + getNickname() + ". The frog weighed " + getWeight()
				+ " grams.";
	}
	
	
}
