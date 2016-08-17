package com.lab.tuesday.zooepic;

public class Tarsier extends Primate
{
	private int eyeballDiameter = 0;
	private boolean brainIsSizeOfItsEyeball = true;
	public Tarsier(String noiseItMakes, String gender, int numberOfOffspringAtATime, boolean hasFurOrHair,
			String habitat, boolean hasTail, int eyeballDiameter, boolean brainIsSizeOfItsEyeball)
	{
		super(noiseItMakes, gender, numberOfOffspringAtATime, hasFurOrHair, habitat, hasTail);
		this.eyeballDiameter = eyeballDiameter;
		this.brainIsSizeOfItsEyeball = brainIsSizeOfItsEyeball;
	}
	public Tarsier()
	{
	}
	
	public int getEyeballDiameter()
	{
		return eyeballDiameter;
	}
	public void setEyeballDiameter(int eyeballDiameter)
	{
		this.eyeballDiameter = eyeballDiameter;
	}
	public boolean isBrainIsSizeOfItsEyeball()
	{
		return brainIsSizeOfItsEyeball;
	}
	public void setBrainIsSizeOfItsEyeball(boolean brainIsSizeOfItsEyeball)
	{
		this.brainIsSizeOfItsEyeball = brainIsSizeOfItsEyeball;
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
		return "Tarsier [eyeballDiameter=" + eyeballDiameter + ", brainIsSizeOfItsEyeball=" + brainIsSizeOfItsEyeball
				+ ", getHabitat()=" + getHabitat() + ", isHasTail()=" + isHasTail() + ", getNumberOfOffspringAtATime()="
				+ getNumberOfOffspringAtATime() + ", isHasFurOrHair()=" + isHasFurOrHair() + ", getNoiseItMakes()="
				+ getNoiseItMakes() + ", getGender()=" + getGender() + "]";
	}
	
	

}
