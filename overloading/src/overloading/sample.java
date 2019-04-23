package overloading;

public class sample {
	public void student(int id) { 
		System.out.println(id);
	}
	public void student(String name) {
		System.out.println(name);
	}
	public void student(long mobile) {
		System.out.println(mobile);
	}
	public void student(float salary) {
		System.out.println(salary);
	}
		public static void main(String[] args) {
			sample r=new sample();
			r.student(1235);
			r.student("aham");
			r.student(9876544398l);
			r.student(145.98f);
		}

}
