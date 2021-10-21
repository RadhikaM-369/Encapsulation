package encapsulation;

public class SimCard {
	private String nameOfSubscriber;
	private int price;
	private String Network;
	private int validity;	
	private long adharNo;
	String typeOfSimcard;
	public SimCard() {
		System.out.println("SIM CARD Information");	}
	
	public void setNameOfSubscriber(String nameOfSubscriber) {
	this.nameOfSubscriber=nameOfSubscriber;	
	}
	
	public void setNetwork(String Network) {
		this.Network=Network;	}
	
	public void setprice(int price) {
		this.price=price;	}
	
	public void setvalidity(int validity){
		this.validity=validity;	}
	
	public void setadharNo(long adharNo) {
		this.adharNo=adharNo;}
	
	public void startService() {
	System.out.println("Registered to network..services available");	}
		
	public void changePlan() {
		System.out.println("Change current plan"); }
	
	public void port() {
		System.out.println("Change to another network ");
	}
	public String getNameOfSubscriber() {
		return this.nameOfSubscriber;
	}
	public String getNetwork() {
		return this.Network;
	}
	public int getprice() {
		return this.price;
	}
	public int getvalidity(){
		return  this.validity;	}
	
	public long getadharNo() {
		return this.adharNo; }
	}
