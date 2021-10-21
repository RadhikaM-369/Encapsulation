package encapsulation;

public class SimcardTester {

	public static void main(String[] args) {
		SimCard simcard= new SimCard();
		simcard.setNameOfSubscriber("Shree");
		simcard.setNetwork("Airtel");
		simcard.setprice(350);
		simcard.setvalidity(2025);
		simcard.setadharNo(2233145668799546L);
		
		System.out.println("Name of the subscriber: "+simcard.getNameOfSubscriber());
		System.out.println("Network is: "+simcard.getNetwork());
		System.out.println("price: "+simcard.getprice());
		System.out.println("Validity: "+simcard.getvalidity());
		System.out.println("Adhar no: "+simcard.getadharNo());
		
		simcard.startService();
	}

}
