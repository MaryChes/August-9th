package com.lab.tuesday.zooexplore;

public class Animal 
{
	protected String species = null;
	protected String color = null;
	protected boolean isAMammal = false;
	protected int age = 0;
	protected String gender = null;
	protected String animalsName = null;
	
	public Animal(String species, String color, boolean isAMammal, int age, String gender, String animalsName) 
	{
		this.species = species;
		this.color = color;
		this.isAMammal = isAMammal;
		this.age = age;
		this.gender = gender;
		this.animalsName = animalsName;
	}

	public String getSpecies() 
	{
		return species;
	}

	public void setSpecies(String species) 
	{
		this.species = species;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public boolean isAMammal() 
	{
		return isAMammal;
	}

	public void setAMammal(boolean isAMammal) 
	{
		this.isAMammal = isAMammal;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public String getAnimalsName() 
	{
		return animalsName;
	}

	public void setAnimalsName(String animalsName) 
	{
		this.animalsName = animalsName;
	}	
	
}
