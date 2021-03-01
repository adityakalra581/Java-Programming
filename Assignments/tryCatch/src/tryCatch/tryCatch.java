package tryCatch;

public class tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3};
		int[] b = null;
		try {
		System.out.println(a[3]); // outOfBounds 
//		System.out.println(b[0]);  // Null Pointer
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is out of Bounds!");
		}
		catch (NullPointerException e) {
			System.out.println("Your array is null!");
		}
		catch (Exception e) {
			System.out.println("Something else went wrong!");
		}
	}

}
