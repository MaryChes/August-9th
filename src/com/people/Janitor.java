package com.people;

public class Janitor extends Person
{
	private boolean isWorking = false;
	private String title = null;
	public Janitor(String name, int age, String gender, float height, boolean isWorking, String title) 
	{
		super(name, age, gender, height);
		this.isWorking = isWorking;
		this.title = title;
	}
	public boolean isWorking() {
		return isWorking;
	}
	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Janitor [isWorking=" + isWorking + ", title=" + title + ", name=" + name + ", age=" + age + ", gender="
				+ gender + ", height=" + height + "]";
	}
	
	//String toString will print out all the methods and info when called in building class.
	//alt shift s generate string to string.
	
}
