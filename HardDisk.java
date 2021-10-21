package encapsulation;

public class HardDisk {
private String brand;
private String StorageCapacity;
private String TransferSpeed;
private int cacheSpeed;

public void setbrand(String brand) {
	this.brand=brand;
	}
public void setStorageCapacity(String StorageCapacity) {
	this.StorageCapacity=StorageCapacity;
	}
public void setTransferSpeed(String TransferSpeed) {
	this.TransferSpeed=TransferSpeed;
	}
public void setcacheSpeed(int cacheSpeed) {
	this.cacheSpeed=cacheSpeed;
	}

public String getbrand() {
	return this.brand;
	}
public String getStorageCapacity() {
	return this.StorageCapacity;
	}
public String getTransferSpeed() {
	return this.TransferSpeed;
	}
public int getcacheSpeed() {
	return this.cacheSpeed;
	}
}
