package com.lab.tuesday.zooepic;

public class Primate extends Mammal
{
	private String habitat = null;
	private boolean hasTail = false;
	
	public Primate(String noiseItMakes, String gender, int numberOfOffspringAtATime, boolean hasFurOrHair,
			String habitat, boolean hasTail)
	{
		super(noiseItMakes, gender, numberOfOffspringAtATime, hasFurOrHair);
		this.habitat = habitat;
		this.hasTail = hasTail;
	}

	public Primate()
	{
	}

	public String getHabitat()
	{
		return habitat;
	}

	public void setHabitat(String habitat)
	{
		this.habitat = habitat;
	}

	public boolean isHasTail()
	{
		return hasTail;
	}

	public void setHasTail(boolean hasTail)
	{
		this.hasTail = hasTail;
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
