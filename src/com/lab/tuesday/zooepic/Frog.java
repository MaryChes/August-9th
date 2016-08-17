package com.lab.tuesday.zooepic;

public class Frog extends Amphibian
{
	private float jumpDistanceInMeters = 0.0f;

	public Frog(String noiseItMakes, String gender, boolean goesThroughMetamorphosis, float weightInGrams,
			float jumpDistanceInMeters)
	{
		super(noiseItMakes, gender, goesThroughMetamorphosis, weightInGrams);
		this.jumpDistanceInMeters = jumpDistanceInMeters;
	}

	public Frog()
	{
	}

	public float getJumpDistanceInMeters()
	{
		return jumpDistanceInMeters;
	}

	public void setJumpDistanceInMeters(float jumpDistanceInMeters)
	{
		this.jumpDistanceInMeters = jumpDistanceInMeters;
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
