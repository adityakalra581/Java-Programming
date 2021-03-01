package dsaassesmenttest;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeIntro {
	
	public static void main(String[] args) {
		Deque<String> brands = new ArrayDeque<String>();
		brands.add("Apple");
		brands.add("Nokia");
		brands.add("Samsung");
		brands.add("One Plus");
		brands.add("Blueberry");
		System.out.println(brands.poll());
		brands.add("Microsoft");
		System.out.println(brands.element());
		System.out.println(brands.peek());
		System.out.println(brands.remove());
		
		System.out.println(brands);
		for (String brand: brands) {
			System.out.println(brand);
		}
	}

}
