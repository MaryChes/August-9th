package com.lab.tuesday.zooexplore;

public class Chimpanzee extends Animal
{
	
	protected boolean livesAlone = false;
	protected boolean hasOpposibleThumbs = true;
	
	public Chimpanzee(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean livesAlone, boolean hasOpposibleThumbs) 
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.livesAlone = livesAlone;
		this.hasOpposibleThumbs = hasOpposibleThumbs;
	}

	public boolean isLivesAlone() 
	{
		return livesAlone;
	}

	public void setLivesAlone(boolean livesAlone) 
	{
		this.livesAlone = livesAlone;
	}

	public boolean isHasOpposibleThumbs() 
	{
		return hasOpposibleThumbs;
	}

	public void setHasOpposibleThumbs(boolean hasOpposibleThumbs) 
	{
		this.hasOpposibleThumbs = hasOpposibleThumbs;
	}

	@Override
	public String toString() {
		return "chimpanzee. It is " + livesAlone + ", that it lives alone. It is " + hasOpposibleThumbs + " that the chimpanzee has opposible thumbs. The chimpanzee is from the "
				+ species + " species. This chimpanzee was " + color + ". It is " + isAMammal + " that a chimpanzee is a mammal. This chimpanzee was " + age + " years old,  a " + gender
				+ ", and it's name was " + animalsName + ".";
	}
		
}
