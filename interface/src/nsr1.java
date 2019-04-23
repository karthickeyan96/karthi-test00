
public class nsr1 implements nsr  {

	@Override
	public void maintenance() {
		// TODO Auto-generated method stub
		System.out.println("45678");
	}

	@Override
	public void electrical() {
		// TODO Auto-generated method stub
		System.out.println("rtyu");
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("dfghjghs");
	}
	public static void main(String[] args) {
		 nsr1 n=new  nsr1();
		 n.maintenance();
		 n.electrical();
		 n.operation();
	}

}
