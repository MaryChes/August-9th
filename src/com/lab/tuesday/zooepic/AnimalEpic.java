package com.lab.tuesday.zooepic;

public abstract class AnimalEpic
{
	protected String noiseItMakes = null;
	protected String gender = null;
	
	public AnimalEpic(String noiseItMakes, String gender)
	{
		this.noiseItMakes = noiseItMakes;
		this.gender = gender;
	}
	
	public AnimalEpic()
	{
	}

	public String getNoiseItMakes()
	{
		return noiseItMakes;
	}

	public void setNoiseItMakes(String noiseItMakes)
	{
		this.noiseItMakes = noiseItMakes;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public abstract void moves();
	
	public abstract void breathes();
	
	public abstract void eats();

}
