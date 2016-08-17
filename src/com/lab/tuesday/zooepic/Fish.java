package com.lab.tuesday.zooepic;

public class Fish extends AnimalEpic
{
	private boolean swims = true;
	private boolean hasGills = true;
	
	
	public Fish(String noiseItMakes, String gender, boolean swims, boolean hasGills)
	{
		super(noiseItMakes, gender);
		this.swims = swims;
		this.hasGills = hasGills;
	}

	public Fish()
	{
	}

	public boolean isSwims()
	{
		return swims;
	}

	public void setSwims(boolean swims)
	{
		this.swims = swims;
	}

	public boolean isHasGills()
	{
		return hasGills;
	}

	public void setHasGills(boolean hasGills)
	{
		this.hasGills = hasGills;
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
