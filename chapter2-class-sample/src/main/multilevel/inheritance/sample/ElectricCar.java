package main.multilevel.inheritance.sample;

public class ElectricCar extends Car 
{
	private double power = 0;
	
	public ElectricCar() {
		
		// Car sınıfının kurucu metodunu çağırıyor.
		super();
	}

	public ElectricCar(String brand, String licensePlate, double power) {
		
		// Car sınıfına ait parametreli kurucu metodu çağırıyoruz.
		// Bu kurucu metot "public Car(String brand, String licensePlate)" kendisidir.
		
		super(brand, licensePlate);
		
		this.power = power;
		
	}
	
	public ElectricCar(String brand, String licensePlate, double power,  short wheelCount) {
		
		// Car sınıfına ait parametreli kurucu metodu çağırıyoruz.
		// Bu kurucu metot "public Car(String brand, String licensePlate)" kendisidir.
		
		super(brand, licensePlate, wheelCount);
		
		this.power = power;
		
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
		
		// this ile çağrılırsa kendi showInfo fonksiyonunu çağırır.
		// this.showInfo();
		
		System.out.println(this.power);
	}
	
	
	
	
	
}
