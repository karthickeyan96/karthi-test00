package constructor;

public class Employee {
	public Employee() {
		System.out.println("const....");
	}
	public Employee(int id) {
		System.out.println(id);
		
	}
public Employee(int id,String name) {
	System.out.println(id);
	System.out.println(name);
}
public static void main(String[] args) {
	Employee e=new Employee();
	Employee e1=new Employee(100);
	Employee e2=new Employee(12,"karthick");
	
}
}
