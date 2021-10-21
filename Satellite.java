package encapsulation;

import java.util.Date;

public class Satellite {
	Date launchDate;
	int durationDesign;
	int weight;
	private int speed;	
	private String powerSource;
	private String camera;
	private String scientificSensors;
	private String orbitPath;
public Satellite() {
	System.out.println("Satellite Information");	
	}
public void setspeed(int speed) {
	this.speed=speed;
}
public void setpowerSource(String powerSource) {
	this.powerSource=powerSource;
}
public void setcamera(String camera) {
	this.camera=camera;
}
public void setscientificSensors(String scientificSensors) {
	this.scientificSensors=scientificSensors;
}
public void setorbitPath(String orbitPath) {
	this.orbitPath=orbitPath;
}
public int getspeed() {
	return this.speed;
}
public String getpowerSource() {
	return this.powerSource;
}
public String getcamera() {
	return this.camera;
}
public String getscientificSensors() {
	return this.scientificSensors;
}
public String getorbitPath() {
	return this.orbitPath;
}

public void info() {
	System.out.println("collect data from solar system and universe");
}
public void BEV() {
	System.out.println("Bird-eye-view: see large area of earth at on time");
}
public void telephones() {
	System.out.println("Satellite provide in-flight phone communications on airoplanes);");
}
public void television() {
	System.out.println("Satellite send television signals directly to homes but they also are backbone of cable and network TV");
}
public void navigation() {
	System.out.println("GPS based systems are used by civilians & the military for navigation on land, sea and air");
}
public void weather() {
	System.out.println("Satellite provide meteorologists with the ability to see weather on global scale");
}
public void climate() {
	System.out.println("satellites are best source of data for climate change research, determine long term patterns of rainfall & emissions of greenhouse gases");
}

}
