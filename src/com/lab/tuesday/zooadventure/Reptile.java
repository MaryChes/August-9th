package com.lab.tuesday.zooadventure;

public class Reptile extends Animal
{
	private String typeOfHabitat = null;

	public Reptile(String gender, String nickname, float weight, String typeOfHabitat)
	{
		super(gender, nickname, weight);
		this.typeOfHabitat = typeOfHabitat;
	}

	public String getTypeOfHabitat() 
	{
		return typeOfHabitat;
	}

	public void setTypeOfHabitat(String typeOfHabitat) 
	{
		this.typeOfHabitat = typeOfHabitat;
	}
	
	
}
