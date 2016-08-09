package com.notes.tuesday;
//child of vehicle class
public class EighteenWheeler extends Vehicle
{
	
	private boolean trailer = true;
	private String horn = "honk honk";

	public EighteenWheeler(boolean running, String color, String condition, boolean fueledUp, int numberOfSeats,
			int wheels, boolean trailer, String horn) {
		super(running, color, condition, fueledUp, numberOfSeats, wheels);
		this.trailer = trailer;
		this.horn = horn;
	}
	public void withoutATrailer ()
	{
		if (!(trailer)) 
		{
			wheels = 10;
		}
	}
	public boolean isTrailer() {
		return trailer;
	}
	public void setTrailer(boolean trailer) {
		this.trailer = trailer;
	}
	public String getHorn() {
		return horn;
	}
	public void setHorn(String horn) {
		this.horn = horn;
	}
	
}
