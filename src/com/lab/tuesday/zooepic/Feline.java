package com.lab.tuesday.zooepic;

public class Feline extends Mammal
{
	private boolean hasRetractableClaws = true;
	private boolean isAPackAnimal = true;
	
	public Feline(String noiseItMakes, String gender, int numberOfOffspringAtATime, boolean hasFurOrHair,
			boolean hasRetractableClaws, boolean isAPackAnimal)
	{
		super(noiseItMakes, gender, numberOfOffspringAtATime, hasFurOrHair);
		this.hasRetractableClaws = hasRetractableClaws;
		this.isAPackAnimal = isAPackAnimal;
	}

	public Feline()
	{
	}

	public boolean isHasRetractableClaws()
	{
		return hasRetractableClaws;
	}

	public void setHasRetractableClaws(boolean hasRetractableClaws)
	{
		this.hasRetractableClaws = hasRetractableClaws;
	}

	public boolean isAPackAnimal()
	{
		return isAPackAnimal;
	}

	public void setAPackAnimal(boolean isAPackAnimal)
	{
		this.isAPackAnimal = isAPackAnimal;
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
