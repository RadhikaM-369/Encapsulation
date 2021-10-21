package encapsulation;

public class HardDiskTest {

	public static void main(String[] args) {
		HardDisk hd=new HardDisk();
		
		hd.setbrand("SAMSUNG");
		hd.setStorageCapacity("1 TB");
		hd.setcacheSpeed(256);
		hd.setTransferSpeed("7200 RPM");
		
		System.out.println("Hard disk information:");
		System.out.println("-----------------------------------------");
		System.out.println("Brand :"+hd.getbrand());
		System.out.println("Storage capacity :"+hd.getStorageCapacity());
		System.out.println("Cache speed :"+hd.getcacheSpeed());
		System.out.println("Transfer speed :"+hd.getTransferSpeed());
		System.out.println("-----------------------------------------");

	}

}
