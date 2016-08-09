package com.people;

import java.util.ArrayList;

public class Building {

	public static void main(String[] args) 
	{
		ArrayList<Person>ourBuilding = new ArrayList<>(3);
		
		Student studentA = new Student("Brendan", 29, "male", 6.2f, "6651345", false, true, true);
		Student studentB = new Student("Mary", 35, "female", 5.4f, "05281981", true, true, true);
		Janitor janitorA = new Janitor("Kavita", 30, "female", 5f, true, "Head Janitor");
		
		ourBuilding.add(studentA);
		ourBuilding.add(studentB);
		ourBuilding.add(janitorA);
		
		System.out.println(ourBuilding.get(0));
		//0 gets studentA because Student A is index of 0
		System.out.println("\n" + ourBuilding.get(1));
		System.out.println("\n" + ourBuilding.get(2));
		System.out.println("\n" + ourBuilding.get(0).getAge());

	}

}
