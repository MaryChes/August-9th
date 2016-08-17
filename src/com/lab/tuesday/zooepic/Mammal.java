package com.lab.tuesday.zooepic;

public class Mammal extends AnimalEpic
{
	private int numberOfOffspringAtATime = 0;
	private boolean hasFurOrHair = true;
	
	public Mammal(String noiseItMakes, String gender, int numberOfOffspringAtATime, boolean hasFurOrHair)
	{
		super(noiseItMakes, gender);
		this.numberOfOffspringAtATime = numberOfOffspringAtATime;
		this.hasFurOrHair = hasFurOrHair;
	}
	
	public Mammal()
	{
	}
	
	public int getNumberOfOffspringAtATime()
	{
		return numberOfOffspringAtATime;
	}

	public void setNumberOfOffspringAtATime(int numberOfOffspringAtATime)
	{
		this.numberOfOffspringAtATime = numberOfOffspringAtATime;
	}

	public boolean isHasFurOrHair()
	{
		return hasFurOrHair;
	}

	public void setHasFurOrHair(boolean hasFurOrHair)
	{
		this.hasFurOrHair = hasFurOrHair;
	}


	@Override
	public void moves()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breathes()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eats()
	{
		// TODO Auto-generated method stub
		
	}

	
	
}
