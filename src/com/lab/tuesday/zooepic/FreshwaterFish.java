package com.lab.tuesday.zooepic;

public class FreshwaterFish extends Fish
{
	private int idealWaterTemp = 0;

	public FreshwaterFish(String noiseItMakes, String gender, boolean swims, boolean hasGills, int idealWaterTemp)
	{
		super(noiseItMakes, gender, swims, hasGills);
		this.idealWaterTemp = idealWaterTemp;
	}

	public FreshwaterFish()
	{
	}

	public int getIdealWaterTemp()
	{
		return idealWaterTemp;
	}

	public void setIdealWaterTemp(int idealWaterTemp)
	{
		this.idealWaterTemp = idealWaterTemp;
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
