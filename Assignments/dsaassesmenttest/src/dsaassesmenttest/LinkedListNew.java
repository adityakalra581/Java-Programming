package dsaassesmenttest;


import java.util.LinkedList;
import java.util.List;

public class LinkedListNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> elements = new LinkedList<Integer>();
		
		elements.add(1);
		elements.add(2);
		elements.add(3);
		elements.add(4);
		elements.add(5);
		elements.add(6);
		
		// remove(index) not value:
		
		elements.remove(1);
		
		//add(Index, value)
		
		elements.add(3,34);
		elements.set(5, 15);
		System.out.println(elements);

	}

}
