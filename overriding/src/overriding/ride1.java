package overriding;

public class ride1 extends ride {


public void fixed () {
System.out.println("10%");
}
public static void main(String[] args) {
	 ride1 r=new  ride1();
	 r.fixed();
}
}
