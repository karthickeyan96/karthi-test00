package org;

public class Employee {

  public void empid() {
	  System.out.println("id is 5678");
  }
  public void empname() {
	   System.out.println("nameis karthiii");
  }
  public void companyname() {
	    System.out.println("company name is cts");
  }
  public static void main(String[] args) {
	Employee e=new Employee ();
	e.empid();
	e.empname();
	e.companyname();
  }
}