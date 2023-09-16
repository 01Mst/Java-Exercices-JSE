package javabasics;

public class Classroom {
String sub1;
int scount1;
public String getSubject() {
	return sub1;
}
public void setSubject(String subject) {
	this.sub1 = subject;
}
public int getStudentscount() {
	return scount1;
}
public void setStudentscount(int studentscount) {
	this.scount1 = studentscount;
}
public void displaydetails() {
	System.out.println("This is a"+" "+sub1+" "+"classroom and it has"+" "+scount1+" "+"students.");
	
}
}
