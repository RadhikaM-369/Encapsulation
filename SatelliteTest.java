package encapsulation;

public class SatelliteTest {

	public static void main(String[] args) {
		Satellite st001=new Satellite();
		st001.setcamera("Panchromatic");
		st001.setpowerSource("Solar panel");
		st001.setorbitPath("Polar");
		st001.setscientificSensors("Linear imaging self scanning sensor-LISS-3");
		st001.setspeed(7000);

		System.out.println("The camera used : "+st001.getcamera());
		System.out.println("powersource : "+st001.getpowerSource());
		System.out.println("Orbit Path : "+st001.getorbitPath());
		System.out.println("The Scientific sensor used : "+st001.getscientificSensors());
		System.out.println("Speed : "+st001.getspeed());
		System.out.println("-----------------------------------------------------------");
		
		st001.BEV();
	}

}
