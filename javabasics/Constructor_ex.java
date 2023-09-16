package javabasics;

public class Constructor_ex {
String vehicle_type="Sedan";
int no_of_tyres=4;
public void cars() {
	if(no_of_tyres==2) {
		System.out.println("Total amount is 0.");
		}
	else if(no_of_tyres==4) {
		System.out.println("Total amount is 10.");
	}
	else if(no_of_tyres>4) {
		System.out.println("Total amount is 20");
	}
	else {
		System.out.println("Invalid Query");
	}
	
}
public Constructor_ex() {
	System.out.println("processed.");
}
public Constructor_ex(String vehicle_type,int no_of_tyres) {
	this.vehicle_type=vehicle_type;
	this.no_of_tyres=no_of_tyres;
	
}
}
