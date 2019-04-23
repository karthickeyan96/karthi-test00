package overloading;

public class worker {


public void employee (short id) {
	System.out.println(id);
}
public void employee (float salary) {
	System.out.println(salary);
}
public void employee (long ph) {
	System.out.println(ph);
}
public void employee (String name) {
	
System.out.println(name);

}
public static void main(String[] args) {
	worker w=new worker();
	w.employee(233);
	w.employee(3445);
	w.employee("karthik");
	w.employee(123456789);
	
	
}}

