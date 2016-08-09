package com.lab.tuesday.zooadventure;

public class Lion extends Mammal
{
	private boolean livesInHerd = false;

	public Lion(String gender, String nickname, float weight, boolean isColdBlooded, boolean livesInHerd) 
	{
		super(gender, nickname, weight, isColdBlooded);
		this.livesInHerd = livesInHerd;
	}

	public boolean isLivesInHerd() 
	{
		return livesInHerd;
	}

	public void setLivesInHerd(boolean livesInHerd) 
	{
		this.livesInHerd = livesInHerd;
	}

	@Override
	public String toString() 
	{
		return "a lion. It is " + livesInHerd + " that lions live in a herd. It is " + isColdBlooded() + " that lions are cold blooded animals. The lion we saw was "
				+ getGender() + ".  It's name was " + getNickname() + ". The lion weighed " + getWeight() + "pounds.";
	}
	
	
}
