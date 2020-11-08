package main.inheritance.sample;

public class Main {

	public static void main(String[] args) {
		
		Car baseCar = new Car();
		baseCar.setBrand("BMW");
		baseCar.setPlateNumber("34 AN 2342");
		
		ElectricCar electricCar = new ElectricCar();
		electricCar.setBrand("Tesla");
		electricCar.setPlateNumber("45 AN 5322");
		electricCar.charge(200);
		
		TruckCar truckCar = new TruckCar("BMC", "54 AN 3341", "4x4", true, true);
		
		BusCar busCar = new BusCar();
		busCar.setBrand("Mercedes");
		busCar.setPlateNumber("06 AN 4342");
		busCar.setSeatCount(54);
		
		
		//baseCar.showInfo();
		
		//electricCar.showInfo();
		
		//truckCar.showInfo();
		
		//busCar.showInfo();
		
		//int[] intarray = new int[5];
		
		Car[] cars = new Car[4];
		
		// upcasting type conversion!
		cars[0] = electricCar;
		cars[1] = truckCar;
		cars[2] = baseCar;
		cars[3] = busCar;
		
		//printCarInfo(cars);
		
		showCar(cars);
		
		/*
		// upcasting yaptık
		Car car3 = electricCar;
		
		// downcasting yaptık
		ElectricCar electricCar4 = (ElectricCar)car3;
		
		boolean isCarItem = electricCar4 instanceof Car;
		System.out.println(isCarItem);
		
		boolean isElectricCarItem = electricCar4 instanceof ElectricCar;
		System.out.println(isElectricCarItem);
		
		// upcasting yaptık.
		Car car4 = truckCar;
		
		// downcasting'de runtime hatası alırsınız.
		// ElectricCar electricCar5 = (ElectricCar)car4;
		
		TruckCar truckCar2 = (TruckCar)car4;
		*/
	}
	
	public static void showCar(Car[] cars) {
		
		for(int i=0; i < cars.length; i++) {
		
			Car car = cars[i];
			car.showInfo();
			System.out.println("-------------");
		}
	}
	
	public static void printCarInfo(Car[] cars) {
		
		for(Car otomobil : cars) {
			
			if(otomobil instanceof TruckCar) {
				
				TruckCar truckCar = (TruckCar)otomobil;
				truckCar.enableTruckItem(false);
				System.out.println("TruckCar item found!");
			}
			else if(otomobil instanceof BusCar) {
				
				BusCar busCar = (BusCar)otomobil;
				System.out.println("BusCar item found!");
			}
			else if(otomobil instanceof ElectricCar) {
				
				ElectricCar electricCar = (ElectricCar)otomobil;
				System.out.println("ElectricCar item found!");
			}
			
			otomobil.showInfo();
			System.out.println("-------------");
		}
		
		/*for(int i=0; i < cars.length; i++) {
		
			Car car = cars[i];
			car.showInfo();
			System.out.println("-------------");
		}*/
	}
	
}
