package multiThreading;

public class A_Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 A obj1=new A();
 B obj2=new B();
 obj1.start();
 try {
	 Thread.sleep(10);
 }
 catch(Exception e) {}
 obj2.start();
 //obj1.show();
 //obj2.show();
	

}}
