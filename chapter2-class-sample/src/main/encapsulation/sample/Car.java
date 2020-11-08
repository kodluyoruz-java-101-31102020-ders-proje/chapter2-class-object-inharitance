package main.encapsulation.sample;

public class Car {

	// Önceki konuda da bahsetmiştik, Car sınıfı içinde Engine tipinde bir nesne tutuyoruz.
	// Bu ilişki biçimi "Aggregation" idi. İlişkinin biçimi "HAS-A" ismindedir.
	// Motor ile Araba arasında kalıtsal bir ilişki olması mümkün değildir.
	// Çünkü, aynı ürün ailesinden değildirler.
	private Engine engine;
	
	private String brand;
	
	private short gearCount = 0;
	
	public Car(String brand, Engine engine) {
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
		
		// Yukarıdaki aynı durum sıcaklığı ekrana göstermek için de geçerlidir.
		this.showTemperatureRepeatly();
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
	
	private void startFreezeSystem() {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// motor çalıştığı süre boyunca her 1.5 saniyede bir sıcaklık 6 derece düşürülüyor.
				while(engine.getStatus()) {
					
					engine.freezeTemperature(6);
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		thread.start();
	}
	
	private void showTemperatureRepeatly() {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// motor çalıştığı süre boyunca her 1 saniyede bir sıcaklık değeri ekrana yazdırılıyor.
				while(engine.getStatus()) {
					
					System.out.println("Temperature: " + engine.getTemperature());
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		thread.start();
	}
}
