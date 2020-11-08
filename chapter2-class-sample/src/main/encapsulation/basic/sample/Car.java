package main.encapsulation.basic.sample;

public class Car {

	// Önceki konuda da bahsetmiştik, Car sınıfı içinde Engine tipinde bir nesne tutuyoruz.
	// Bu ilişki biçimi "Aggregation" idi. İlişkinin biçimi "HAS-A" ismindedir.
	// Motor ile Araba arasında kalıtsal bir ilişki olması mümkün değildir.
	// Çünkü, aynı ürün ailesinden değildirler.
	private BasicEngine engine;
	
	private String brand;
	
	private short gearCount = 0;
	
	public Car(String brand, BasicEngine engine) {
		this.engine = engine;
		this.brand = brand;
	}
	
	// Car sınıfının durumunu yine fonksiyon yardımıyla değiştiriyoruz.
	// start fonksiyonu ile motoru çalıştırıyoruz. Böylece nesnemizin durumu değişmiş oluyor.
	// Fakat, bunu kapsülleme yöntemiyle yapıyoruz. Böylece, değişkenin değerini direkt olarak dışarıdan değiştirilemez kılıyoruz.
	// Dışarıdan biri nesnenin durumunu değiştirmek istiyorsa yazılımcının tanımladığı bu fonksiyonlar vasıtasıyla durum değişimini yapmalıdır.
	// İşte bu yönteme biz kapsülleme diyoruz.
	public void start() {
		
		this.engine.start();
		this.gearCount = 1;
		
		// Soğutma sistemi aracın iç donanımıdır. Aracı kullanan kişinin bunu bilmesine gerek yoktur.
		// Aynı mantık çerçevesinde soğutma sisteminin işleyişini dışarıdan çağıran kişinin bilmesine gerek yoktur.
		// Bu nedenle fonksiyon private olarak tanımlandı ve sadece sınıf içinden çağrılabilir oldu.
		this.startFreezeSystem();
	}
	
	public void stop() {
		this.engine.stop();
	}
	
	// Vites sayısının arttırma işini bir fonksiyon işiyle yapıyoruz.
	// Durumu değiştirmek için yine kapsülleme yönteminden faydalandık.
	public void incrementGear() {
		this.gearCount++;
	}
	
	public void decrementGear() {
		this.gearCount--;
	}
	
	public short getCurrentGear() {
		return this.gearCount;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public boolean isEngineActive() {
		return this.engine.getStatus();
	}
	
	public void showTemperature() {
		
		System.out.println("Temperature: " + engine.getTemperature());
	}
	
	private void startFreezeSystem() {
		
		this.engine.freezeTemperature(6);		
	}
	

}
