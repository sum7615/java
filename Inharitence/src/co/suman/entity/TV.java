package co.suman.entity;

public class TV extends Product {
private String screenSize;
private String type;
public String getScreenSize() {
	return screenSize;
}
public void setScreenSize(String screenSize) {
	this.screenSize = screenSize;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public void print() {
	super.print();
	System.out.println("Type = "+type);
	System.out.println("Screen Size = "+screenSize);
	
}
}
