package com.lab.tuesday.zooepic;

public class Turtle extends Reptile
{
	private boolean isHerbivore = false;

	public Turtle(String noiseItMakes, String gender, boolean isColdBlooded, String habitat, boolean isHerbivore)
	{
		super(noiseItMakes, gender, isColdBlooded, habitat);
		this.isHerbivore = isHerbivore;
	}

	public Turtle()
	{
	}

	public boolean isHerbivore()
	{
		return isHerbivore;
	}

	public void setHerbivore(boolean isHerbivore)
	{
		this.isHerbivore = isHerbivore;
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
