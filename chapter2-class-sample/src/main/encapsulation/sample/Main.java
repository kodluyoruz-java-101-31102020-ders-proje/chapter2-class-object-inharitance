package main.encapsulation.sample;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Car car = new Car("BMW", new Engine());
		
		// aracın motorunu çalıştırıyoruz.
		car.start();
		
		// Arabanın vites bilgisini değiştirmek için fonksiyon çağırıyoruz.
		// Kapsülleme sayesinde direkt olarak vites bilgisinin değiştirilmesine izin vermiyoruz.
		car.incrementGear();
		
		System.out.println("Brand: " + car.getBrand());
		System.out.println("Current Gear Value: " + car.getCurrentGear());
		
		// sonsuz bir döngü kuruyoruz. motor durana kadar çalışmaya devam edecek.
		long timeCount = 0;
		while(car.isEngineActive()) {
			
			timeCount += 1000;
			
			Thread.sleep(200);
			
			// eğer 1 dakikayı geçtiyse testi sonlandırıp motoru durdururuz.
			if(timeCount > 60000) {
				car.stop();
			}
		}
		
		System.out.println("Car engine status: " + car.isEngineActive());
	}

}
