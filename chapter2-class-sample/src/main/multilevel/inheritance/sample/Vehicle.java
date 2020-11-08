package main.multilevel.inheritance.sample;

public class Vehicle {

	protected short wheelCount;
	
	public Vehicle() {
		this.wheelCount = 0;
	}
	
	public Vehicle(short wheelCount) {
		this.wheelCount = wheelCount;
	}
	
	public void setWheelCount(short wheelCount) {
		this.wheelCount = wheelCount;
	}
	
	public void showInfo() {
		System.out.println(wheelCount);
	}
}
