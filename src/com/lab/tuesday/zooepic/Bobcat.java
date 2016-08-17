package com.lab.tuesday.zooepic;

public class Bobcat extends Feline
{
	private boolean eatsRabbits = true;
	private boolean marksTerritoty = true;
	
	public Bobcat(String noiseItMakes, String gender, int numberOfOffspringAtATime, boolean hasFurOrHair,
			boolean hasRetractableClaws, boolean isAPackAnimal, boolean eatsRabbits, boolean marksTerritoty)
	{
		super(noiseItMakes, gender, numberOfOffspringAtATime, hasFurOrHair, hasRetractableClaws, isAPackAnimal);
		this.eatsRabbits = eatsRabbits;
		this.marksTerritoty = marksTerritoty;
	}

	public Bobcat()
	{
	}

	public boolean isEatsRabbits()
	{
		return eatsRabbits;
	}

	public void setEatsRabbits(boolean eatsRabbits)
	{
		this.eatsRabbits = eatsRabbits;
	}

	public boolean isMarksTerritoty()
	{
		return marksTerritoty;
	}

	public void setMarksTerritoty(boolean marksTerritoty)
	{
		this.marksTerritoty = marksTerritoty;
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

	@Override
	public String toString()
	{
		return " a Bobcat [eatsRabbits=" + eatsRabbits + ", marksTerritoty=" + marksTerritoty
				+ ", isHasRetractableClaws()=" + isHasRetractableClaws() + ", isAPackAnimal()=" + isAPackAnimal()
				+ ", getNumberOfOffspringAtATime()=" + getNumberOfOffspringAtATime() + ", isHasFurOrHair()="
				+ isHasFurOrHair() + ", getNoiseItMakes()=" + getNoiseItMakes() + ", getGender()=" + getGender() + "]";
	}
	
	
	
	
	

}
