package dsaassesmenttest;

import java.util.LinkedList;
import java.util.List;

public class Tester {
	
	
	public static void main(String args[]) {
		List<Integer> elements = new LinkedList<Integer>();
		elements.add(10);
		elements.add(12);
		elements.add(33);
		elements.add(44);
		elements.add(75);
		elements.add(67);
		int temp = 0;
		int sum = 0;
		
		for (int element : elements) {
			temp = element;
			while (temp != 0) {
				sum += temp%10;
				temp = temp/10;
			}
			if (sum %2 == 0) {
				System.out.println(sum);
				System.out.println("Infosys");
			}
			
			
			
			
		}
		
	
	}
	
	

}
