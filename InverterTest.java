package encapsulation;

public class InverterTest {

	public static void main(String[] args) {
		Inverter luminus=new Inverter();
		
		luminus.setbrand("LUMINOUS");
		luminus.setcapacity("12 volt");
		luminus.setprice(18500);
		luminus.settype("Pure sine wave");
		luminus.setweight(54);
		
		System.out.println("Inveter Information");
		System.out.println("-----------------------------------");
		System.out.println("Brand: "+luminus.getbrand());
		System.out.println("weight: "+luminus.getweight());
		System.out.println("Type: "+luminus.gettype());
		System.out.println("Capacity: "+luminus.getcapacity());
		System.out.println("Price: "+luminus.getprice());
		System.out.println("-----------------------------------");
	}

}
