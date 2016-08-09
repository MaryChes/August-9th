package com.lab.tuesday.zooexplore;

public class Penguin extends Animal
{
	protected boolean canSwim = true;
	protected float height = 0.0f;
	
	public Penguin(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean canSwim, float height) 
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.canSwim = canSwim;
		this.height = height;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() 
	{
		return "penguin. It is " + canSwim + " that a penguin can swim. This penguin was " + height + "cm tall. Penguins are from the " + species + " species. This penguin was " + color
				+ ". It is " + isAMammal + " that a penguin is a mammal.  This penguin was " + age + " years old. The penguin was " + gender + " and its name was " + animalsName
				+ ".";
	}
	
	
	
	
}
