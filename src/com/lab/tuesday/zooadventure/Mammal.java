package com.lab.tuesday.zooadventure;

public class Mammal extends Animal
{
	private boolean isColdBlooded = true;

	public Mammal(String gender, String nickname, float weight, boolean isColdBlooded) 
	{
		super(gender, nickname, weight);
		this.isColdBlooded = isColdBlooded;
	}

	public boolean isColdBlooded() 
	{
		return isColdBlooded;
	}

	public void setColdBlooded(boolean isColdBlooded) 
	{
		this.isColdBlooded = isColdBlooded;
	}
	
	
	
}
