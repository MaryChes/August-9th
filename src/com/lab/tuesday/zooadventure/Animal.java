package com.lab.tuesday.zooadventure;

public class Animal 
{
	private String gender = null;
	private String nickname = null;
	private float weight = 0.0f;
	public Animal(String gender, String nickname, float weight) 
	{
		this.gender = gender;
		this.nickname = nickname;
		this.weight = weight;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public String getNickname() 
	{
		return nickname;
	}
	public void setNickname(String nickname) 
	{
		this.nickname = nickname;
	}
	public float getWeight() 
	{
		return weight;
	}
	public void setWeight(float weight) 
	{
		this.weight = weight;
	}	
}
