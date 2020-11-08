package main.clazz.sample;

public class DatabaseConnection {
	
	
	private String url;
	private String name;
	private int portNo;
	
	
	public DatabaseConnection() {
		this.url = "NO_URL";
		this.portNo = -1;
		// this anahtar kelimesi üretilen nesnenin hafızadaki adresini belirtir.
		System.out.println(this);
	}
	
	public DatabaseConnection(String url, int portNo) {
		
		this.url = url;
		this.portNo = portNo;
	}
	
	public DatabaseConnection(String url, String name) {
		this.url = url;
		this.name = name;
	}
	
	
	public DatabaseConnection(String url, String name, int portNo) {
		
		this.url = url;
		this.name = name;
		this.portNo = portNo;
	}
	
	public void changeDatabase(String name) {
		this.name = name;
	}
	
	public boolean open() {
		
		// metodun kod kapsamı
		
		// veritabanı sunucusuna bağlanmak için kodlar yazılır.
		
		DatabaseConnection.show(name);
		
		return true;
	}
	
	public void showDatabaseInfo(boolean detailedInfo) {
		
		if(detailedInfo) {
			// ekrana detaylı bağlantı bilgisi yazdır
			System.out.println(this.url);
			System.out.println(this.name);
			System.out.println(this.portNo);
		}
		else {
			// veritabanı bağlantısı ile ilgili özet bilgiler yazdırılır.
			System.out.println(this.url);
		}
	}

	public static void show(String name) {
		
		System.out.println("Database name:" + name);
	}
	
	// sınıfın kod kapsamı
}
