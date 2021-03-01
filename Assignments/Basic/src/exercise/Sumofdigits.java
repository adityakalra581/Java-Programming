package exercise;

public class Sumofdigits {
	
	public static void main(String[] args) {
	
		int n =123;
		int m,sum = 0;
		
		while(n>0)
		{
		    m = n%10;
		    sum += m;
		    n = n/10;
		}
		System.out.println(sum);

}
}
