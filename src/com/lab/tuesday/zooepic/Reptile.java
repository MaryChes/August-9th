package com.lab.tuesday.zooepic;

public class Reptile extends AnimalEpic
{

	private boolean isColdBlooded = true;
	private String habitat = null;

	
	public Reptile(String noiseItMakes, String gender, boolean isColdBlooded, String habitat)
	{
		super(noiseItMakes, gender);
		this.isColdBlooded = isColdBlooded;
		this.habitat = habitat;
	}
	
	public Reptile()
	{
	}

	public boolean isColdBlooded()
	{
		return isColdBlooded;
	}

	public void setColdBlooded(boolean isColdBlooded)
	{
		this.isColdBlooded = isColdBlooded;
	}

	public String getHabitat()
	{
		return habitat;
	}

	public void setHabitat(String habitat)
	{
		this.habitat = habitat;
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
