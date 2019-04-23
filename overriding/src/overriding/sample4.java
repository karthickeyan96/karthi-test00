package overriding;

public class sample4 extends sample3{


public void savings () {
	System.out.println("12345");
}
public void current() {
	System.out.println("1234");
}
public static void main(String[] args) {
	sample4 s=new sample4();
	s.savings();
	s.current();
}
}
