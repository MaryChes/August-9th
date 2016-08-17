package com.lab.tuesday.zooepic;

public class Newt extends Amphibian
{
	private float tailLengthInCM = 0.0f;

	public Newt(String noiseItMakes, String gender, boolean goesThroughMetamorphosis, float weightInGrams,
			float tailLengthInCM)
	{
		super(noiseItMakes, gender, goesThroughMetamorphosis, weightInGrams);
		this.tailLengthInCM = tailLengthInCM;
	}

	public Newt()
	{
	}

	public float getTailLengthInCM()
	{
		return tailLengthInCM;
	}

	public void setTailLengthInCM(float tailLengthInCM)
	{
		this.tailLengthInCM = tailLengthInCM;
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
