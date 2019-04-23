package overriding;

public class sample2 extends sample1 {
	@Override
	public void fixed() {
		System.out.println("10");
		// TODO Auto-generated method stub
		//super.fixed();
	}
	public static void main(String[] args) {
		sample2 s=new sample2();
		s.fixed();
	}

}
