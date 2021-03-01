package dsaassesmenttest;

import java.util.HashMap;
import java.util.Map;


public class HashMapQuestion {

	public static void main(String[] args) {
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for (int i=0; i<=5; i++) {
			for (int j=5; j>=1; j--) {
				hashMap.put(i, j);
			}
		}
	System.out.println(hashMap);

	}

}
