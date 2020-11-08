package main.inheritance.sample;

public class TruckCar extends Car {

	private boolean truckItem = true;
	private boolean towingTruckEnabled = false;
	private String towingType;
	
	
	public TruckCar() {
		super();
	}
	
	public TruckCar(
			String brand, 
			String plateNumber, 
			String towingType,
			boolean truckItem, 
			boolean towingTruckEnabled) {
		
		
		super(brand, plateNumber);
		
		this.towingTruckEnabled = towingTruckEnabled;
		this.truckItem = truckItem;
		this.towingType = towingType;
	}
	
	
	public void enableTowingTruck(boolean towingTruckEnabled2) {
		this.towingTruckEnabled = towingTruckEnabled2;
	}
	
	public void enableTruckItem(boolean truckItem) {
		this.truckItem = truckItem;
	}
	
	public void setTowingType(String towingType) {
		this.towingType = towingType;
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("<< TruckCar Info >>");
		
		super.showInfo();
		
		System.out.println("Turck enabled: " + this.towingTruckEnabled);
		
		System.out.println("Truck enabled: " + this.truckItem);
		
		System.out.println("Towing type: " + this.towingType);
	}
	
}
