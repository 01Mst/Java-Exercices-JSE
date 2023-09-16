package coreJAVA_Exercises;


 class Vehicle{
	  void run(){System.out.println("Vehicle is running");
	  System.out.println("Something!");
}}
public class Overriding1 extends Vehicle {
void run(){
	System.out.println("Running");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle ov=new Overriding1();
ov.run();
	}

}
