package com.lab.tuesday.zooadventure;

public class Amphibian extends Animal
{
 private boolean goesThroughMetamorphosis = false;

 public Amphibian(String gender, String nickname, float weight, boolean goesThroughMetamorphosis) 
 {
	super(gender, nickname, weight);
	this.goesThroughMetamorphosis = goesThroughMetamorphosis;
 }

public boolean isGoesThroughMetamorphosis() 
{
	return goesThroughMetamorphosis;
}

public void setGoesThroughMetamorphosis(boolean goesThroughMetamorphosis) 
{
	this.goesThroughMetamorphosis = goesThroughMetamorphosis;
}
 
 
 
 
 
}
