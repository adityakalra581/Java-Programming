package dsaassesmenttest;


import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

class TreeSetIntro {
	public static void main(String[] args) {
		// Creating HashSet
		Set<String> food = new TreeSet<String>();

		// Checking if a HashSet is empty
		System.out.println("Is the set empty? : " + food.isEmpty());

		// Adding elements to the HashSet
		food.add("A");
		food.add("B");
		food.add("C");
		food.add("C");
		food.add("E");
		food.add("D");
		food.add("a");
		food.add("F");
//		food.add(null);
		System.out.print("Set output without the duplicates: ");
		System.out.println(food);

		// Finding the size of the HashSet
		System.out.println("The number of food items in the set: " + food.size());
		
		Object[] elements = food.toArray();
		for (Object element: elements){
		    System.out.println(element + " ");
		}


	}
}

