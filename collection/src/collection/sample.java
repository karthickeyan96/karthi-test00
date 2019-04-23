package collection;

import java.util.ArrayList;
import java.util.List;

public class sample {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(70);
		l1.add(80);
		l1.retainAll(li);
		System.out.println(l1);
	}
	}
	
	


