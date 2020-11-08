package main.inheritance.sample;

public class ElectricCar extends Car 
{
	private double power = 0;
	private double chargeTime = 0;
	
	public ElectricCar() {
		
		// Car sınıfının kurucu metodunu çağırıyor.
		super();
	}

	public ElectricCar(
			String brand, 
			String licensePlate, 
			double power,
			double chargeTime) {
		
		// Car sınıfına ait parametreli kurucu metodu çağırıyoruz.
		// Bu kurucu metot "public Car(String brand, String licensePlate)" kendisidir.
		
		super(brand, licensePlate);
		
		// super is used for parent class access!
		//super.brand = brand;
		//super.plateNumber = plateNumber;
		
		this.power = power;
		this.chargeTime = chargeTime;
	}

	
	public void charge(double extraPower) {
		this.power += extraPower;
	}
	
	public void showPower() {
		System.out.println(this.power);
	}
	
	public void showMaxSpeed() {
		
		double maxSpeed = this.calculateMaxSpeed();
		System.out.println(maxSpeed);
	}
	
	private double calculateMaxSpeed() {
		
		double extraSpeed = this.power * 0.4;
		return power + extraSpeed;
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("<< ElectricaCar Info >>");
		
		super.showInfo();
		
		//this.showInfo();
		
		System.out.println("Power: " + this.power);
		
		System.out.println("Charge time: " + this.chargeTime);
	}
	
	
	
	
	
}
