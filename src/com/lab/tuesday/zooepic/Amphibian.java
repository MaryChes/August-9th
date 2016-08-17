package com.lab.tuesday.zooepic;

public class Amphibian extends AnimalEpic
{
	private boolean goesThroughMetamorphosis = false;
	private float weightInGrams = 0.0f;
	public Amphibian(String noiseItMakes, String gender, boolean goesThroughMetamorphosis, float weightInGrams)
	{
		super(noiseItMakes, gender);
		this.goesThroughMetamorphosis = goesThroughMetamorphosis;
		this.weightInGrams = weightInGrams;
	}
	public Amphibian()
	{
	}
	public boolean isGoesThroughMetamorphosis()
	{
		return goesThroughMetamorphosis;
	}
	public void setGoesThroughMetamorphosis(boolean goesThroughMetamorphosis)
	{
		this.goesThroughMetamorphosis = goesThroughMetamorphosis;
	}
	public float getWeightInGrams()
	{
		return weightInGrams;
	}
	public void setWeightInGrams(float weightInGrams)
	{
		this.weightInGrams = weightInGrams;
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
