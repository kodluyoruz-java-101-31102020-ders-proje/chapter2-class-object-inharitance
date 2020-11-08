package main.inheritance.sample;

public class BusCar extends Car {

	private int seatCount;
	private int extraBaggageCount;
	
	
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	public void setExtraBaggageCount(int extraBaggageCount) {
		this.extraBaggageCount = extraBaggageCount;
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("<< BusCar Info >>");
		
		super.showInfo();
		
		System.out.println("Seat count: " + this.seatCount);
		
		System.out.println("Extra baggage size: " + this.extraBaggageCount);
	}
	
}
