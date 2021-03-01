package dsaassesmenttest;

import java.util.HashMap;
import java.util.Map;

public class HashMapNew {
	
	public static void main(String args[]) {
		Map<String, Integer> studentDetails = new HashMap<String, Integer>();
		studentDetails.put("Max", 337);
		studentDetails.put("Stocks", 480);
		studentDetails.put("Malinda", 337);
		studentDetails.put("Mathew", 337);
		studentDetails.put("Max", 337);
		if (studentDetails.replace("stocks", 480, 650)) {
			studentDetails.remove("Max");
		}
		else {
			studentDetails.put("Sam", 490);
		}
		System.out.println(studentDetails);
		
		
		
		
	}

}
