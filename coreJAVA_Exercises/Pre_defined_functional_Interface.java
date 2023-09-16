package coreJAVA_Exercises;

import java.util.Date;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


class employee{
	int salary;
	String ename;
	
	employee(int salary, String ename){
		this.ename=ename;
		this.salary=salary;
	}
}

public class Pre_defined_functional_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<employee> emplist=new ArrayList<employee>();
 emplist.add(new employee(200000,"AAA"));
 emplist.add(new employee(300000,"BBB"));
 emplist.add(new employee(400000,"CCC"));
 emplist.add(new employee(100000,"DDD"));
 
 Function<employee,Integer> f1=a->(a.salary*10/100);
 Predicate<Integer> p1=b->b>=5000;
 Consumer<employee> c1=c->{
	 System.out.println(c.ename);
	 System.out.println(c.salary);
 };
 Supplier<Date> s1=()->new Date();
 System.out.println(s1.get());
 for(employee e:emplist) {
	 int bonus=f1.apply(e);
	 if(p1.test(bonus)) {
		 c1.accept(e);
		 System.out.println("Bonus is: "+bonus);
		 System.out.println("---------------------------");
		 
		 
	 }
 }
	}

}
