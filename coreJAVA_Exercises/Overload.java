package coreJAVA_Exercises;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Ram",Company_Name="O1Mst",Company_Address="ABC, Tiruchirappalli-620021";
		int age=22;
		System.out.println("Before Overloading: ");
		method(name,age);
		System.out.println();
		System.out.println("After Overloading: ");
		method(Company_Name,Company_Address);
		

	}
	static void method(String name, int age) {
		System.out.println("Name: "+name+"    Age: "+age);
	}
	static void method(String Company_name, String Company_Address) {
		System.out.println("Company Name: "+Company_name+"    Company_Address: "+Company_Address);
	}

}
