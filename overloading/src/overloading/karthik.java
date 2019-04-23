package overloading;

public class karthik {


public void worker(int id ) {
	System.out.println(id);
}
public void worker (String name) {
	System.out.println(name);
}
public void worker (float num ) {
	System.out.println(num);
}
public void worker (long mobile) {
	System.out.println("mobile");
}
   
public static void main(String[] args) {
	karthik k=new karthik();
	k.worker(1234);
	k.worker("jhgfd");
	k.worker(123456789);
	k.worker(112345667);
	
	
}
} 

