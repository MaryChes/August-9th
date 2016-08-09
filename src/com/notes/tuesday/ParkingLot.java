package com.notes.tuesday;

public class ParkingLot 
{
	public static void main(String[] args) 
	{
		EighteenWheeler megatron = new EighteenWheeler(true, "grey", "battle-hardened", true, 3, 18, true, "honk honk");
		
		Motorcycle rocket = new Motorcycle(true, "red", "new", true, 1, 2, true);
		
		System.out.println("The motorcycle has " + rocket.getNumberOfSeats() + " seats.");
		System.out.println("The motorcycle has " + rocket.getWheels() + " wheels.");
		System.out.println();
		rocket.doWeHaveASidecar(true);
		System.out.println("After adding a sidecar:");
		System.out.println("The motorcycle has " + rocket.getNumberOfSeats() + " seats." );
		System.out.println("The motorcycle has " + rocket.getWheels() + " wheels.");
		
	}
}
