package com.src;

public class TwoElementPreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Car(); 
		c.setCarname("Audi");  //using the setters
		c.setPrice(800000);
		Car c1=new Car();
		c1.setCarname("Ferrari");
		c1.setPrice(4000000);
		TwoElementPredicator td=((a,b)->((Car) a).getCarname().length()>((Car) b).getCarname().length()?a:b); //calculating string with highest length
		TwoElementPredicator td1=((a,b)->((Car) a).getPrice()>((Car) b).getPrice()?a:b);  //calculating which string has more price
		TwoElementPredicator.display(); //displaying the value
		System.out.println(td.betterEntry(c, c1));  //displaying the value
		System.out.println(td1.betterEntry(c, c1));
		Employee e=new Employee();
		e.setEmpname("Lekha");  //using the setters
		e.setSalary(80000);
		Employee e1=new Employee();
		e1.setEmpname("Ramya");
		e1.setSalary(40000);
		TwoElementPredicator te=((a,b)->((Employee) a).getSalary()>((Employee) b).getSalary()?a:b);   //calculating which string has more salary
		TwoElementPredicator.display();  //displaying the value
		System.out.println(te.betterEntry(e, e1));  //displaying the value

	}
	

}
