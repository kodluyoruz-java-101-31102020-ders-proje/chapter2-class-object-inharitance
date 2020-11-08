package main.inheritance.sample;

public class Car {

	// aracın marka bilgisi
	protected String brand;
	
	// aracın plaka bilgisi
	protected String plateNumber;
	
	public Car() {
		this.brand = "NO_BRAND";
		this.plateNumber = "NO_PLATE_NUMBER";
	}
	
	public Car(String brand, String plateNumber) {
		this.brand = brand;
		this.plateNumber = plateNumber;
	}
	
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void showInfo() {
		System.out.println(this.plateNumber);
		System.out.println(this.brand);
	}
}
