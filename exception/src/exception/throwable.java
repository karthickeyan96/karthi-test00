package exception;

public class throwable {
	public static void main(String[] args) {
		System.out.println("start/..,/.");
		System.out.println("1");
		System.out.println("2");
		try {
			System.out.println(10/2);
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("dont/0");
		}
		finally {
			System.out.println("karthik");
		}
		System.out.println("4");
		System.out.println("5");
		System.out.println("end,......");
	}

}
