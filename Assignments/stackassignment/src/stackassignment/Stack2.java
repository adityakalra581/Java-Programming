
// Stack implementation using Array.
// create a stack of String type:

package stackassignment;

public class Stack2 {
	private int top=-1;
	private int maxSize = 0;
	private String[] arr;
	
	
	Stack2(int maxSize) {
		this.maxSize = maxSize;
		arr = new String[5];
	}
	
	public boolean isFull() {
		if (top>= maxSize - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean push(String data) {
		if (isFull()) {
			return false;
		}
		else {
		arr[++top] = data;
		return true;
		}
	}
	
	
	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean pop() {
		if (isEmpty()) {
			return false;
		}
		else {
		top -= 1;
		return true;
		}
	}
	

	public String peek() {
		if(isEmpty()) {
			return "Stack is Empty";
		}
		else {
		System.out.println(arr[top]);
		return arr[top];
		}
	}
	

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
		System.out.println("Displaying stack elements");
		for (int i = 0; i<=top; i++) {
			System.out.println(arr[i]);
		}
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack2 st = new Stack2(5);
		st.push("hello");
		st.push("world");
		st.peek();

	}

}
