package com.lab.tuesday.zooepic;

public class Lion extends Feline
{
	private boolean isAlpha = false;
	private int numberInPack = 0;
	
	public Lion(String noiseItMakes, String gender, int numberOfOffspringAtATime, boolean hasFurOrHair,
			boolean hasRetractableClaws, boolean isAPackAnimal, boolean isAlpha, int numberInPack)
	{
		super(noiseItMakes, gender, numberOfOffspringAtATime, hasFurOrHair, hasRetractableClaws, isAPackAnimal);
		this.isAlpha = isAlpha;
		this.numberInPack = numberInPack;
	}

	public Lion()
	{
	}

	public boolean isAlpha()
	{
		return isAlpha;
	}

	public void setAlpha(boolean isAlpha)
	{
		this.isAlpha = isAlpha;
	}

	public int getNumberInPack()
	{
		return numberInPack;
	}

	public void setNumberInPack(int numberInPack)
	{
		this.numberInPack = numberInPack;
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
		return "Lion [isAlpha=" + isAlpha + ", numberInPack=" + numberInPack + ", isHasRetractableClaws()="
				+ isHasRetractableClaws() + ", isAPackAnimal()=" + isAPackAnimal() + ", getNumberOfOffspringAtATime()="
				+ getNumberOfOffspringAtATime() + ", isHasFurOrHair()=" + isHasFurOrHair() + ", getNoiseItMakes()="
				+ getNoiseItMakes() + ", getGender()=" + getGender() + "]";
	}
	
	
	
	

}
