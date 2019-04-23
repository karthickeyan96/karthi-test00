package org;

import org.Employee; 

public class client {

public void location () {
	System.out.println("bangelore");
}
public void cliname () {
	System.out.println("cennai");
}

public static void main(String[] args) {
client c=new client ();
c.cliname();
c.location();
  
Employee e=new Employee ();
e.empid();
e.empname();

}
}


