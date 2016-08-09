package com.lab.tuesday.zooadventure;

public class Bear extends Mammal
{
	
	private String habitat = null;

	public Bear(String gender, String nickname, float weight, boolean isColdBlooded, String habitat) 
	{
		super(gender, nickname, weight, isColdBlooded);
		this.habitat = habitat;
	}
	
	public String getHabitat() 
	{
		return habitat;
	}

	public void setHabitat(String habitat) 
	{
		this.habitat = habitat;
	}

	@Override
	public String toString() 
	{
		return "bear. This bear lived in the " + habitat + ". It is " + isColdBlooded() + " that a bear is cold bolded. The bear was " + getGender()
				+ ". The bear's name was " + getNickname() + ". The bear weighted " + getWeight() + " pounds.";
	}
	
	
	
	
	
	
	
	
}
