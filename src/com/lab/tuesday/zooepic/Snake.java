package com.lab.tuesday.zooepic;

public class Snake extends Reptile
{
	private float lengthInMeters = 0.0f;
	private boolean isVenomous = false;
	
	public Snake(String noiseItMakes, String gender, boolean isColdBlooded, String habitat, float lengthInMeters,
			boolean isVenomous)
	{
		super(noiseItMakes, gender, isColdBlooded, habitat);
		this.lengthInMeters = lengthInMeters;
		this.isVenomous = isVenomous;
	}

	public Snake()
	{
	}

	public float getLengthInMeters()
	{
		return lengthInMeters;
	}

	public void setLengthInMeters(float lengthInMeters)
	{
		this.lengthInMeters = lengthInMeters;
	}

	public boolean isVenomous()
	{
		return isVenomous;
	}

	public void setVenomous(boolean isVenomous)
	{
		this.isVenomous = isVenomous;
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
