package com.lab.tuesday.zooepic;

public class HowlerMonkey extends Primate
{
	private boolean buildsNest = true;
	private int soundDecibleLevel = 0;
	
	public HowlerMonkey(String noiseItMakes, String gender, int numberOfOffspringAtATime, boolean hasFurOrHair,
			String habitat, boolean hasTail, boolean buildsNest, int soundDecibleLevel)
	{
		super(noiseItMakes, gender, numberOfOffspringAtATime, hasFurOrHair, habitat, hasTail);
		this.buildsNest = buildsNest;
		this.soundDecibleLevel = soundDecibleLevel;
	}

	public HowlerMonkey()
	{
	}

	public boolean isBuildsNest()
	{
		return buildsNest;
	}

	public void setBuildsNest(boolean buildsNest)
	{
		this.buildsNest = buildsNest;
	}

	public int getSoundDecibleLevel()
	{
		return soundDecibleLevel;
	}

	public void setSoundDecibleLevel(int soundDecibleLevel)
	{
		this.soundDecibleLevel = soundDecibleLevel;
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
		return "HowlerMonkey [buildsNest=" + buildsNest + ", soundDecibleLevel=" + soundDecibleLevel + ", getHabitat()="
				+ getHabitat() + ", isHasTail()=" + isHasTail() + ", getNumberOfOffspringAtATime()="
				+ getNumberOfOffspringAtATime() + ", isHasFurOrHair()=" + isHasFurOrHair() + ", getNoiseItMakes()="
				+ getNoiseItMakes() + ", getGender()=" + getGender() + "]";
	}
	
	
	

}
