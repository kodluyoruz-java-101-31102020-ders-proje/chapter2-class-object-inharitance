package main.multilevel.inheritance.sample;

public class Main {

	public static void main(String[] args) {
		
		ElectricCar electricCar = new ElectricCar("BMW", "34 AL 222", 150, (short)4);
		
		electricCar.setPlateNumber("34 AL asda");

		electricCar.showInfo();
	}

}
