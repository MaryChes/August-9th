package com.lab.tuesday.zooepic;

public class SaltwaterFish extends Fish
{
	private int idealSalinityPPT = 0;

	public SaltwaterFish(String noiseItMakes, String gender, boolean swims, boolean hasGills, int idealSalinityPPT)
	{
		super(noiseItMakes, gender, swims, hasGills);
		this.idealSalinityPPT = idealSalinityPPT;
	}

	public SaltwaterFish()
	{
	}

	public int getIdealSalinityPPT()
	{
		return idealSalinityPPT;
	}

	public void setIdealSalinityPPT(int idealSalinityPPT)
	{
		this.idealSalinityPPT = idealSalinityPPT;
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
