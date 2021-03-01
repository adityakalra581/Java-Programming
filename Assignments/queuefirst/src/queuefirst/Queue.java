package queuefirst;

public class Queue {
	
	private int front = 0;
	private int rear = -1;
	private int maxSize;
	private int[] arr;
	
	
	Queue(int maxSize){
		this.maxSize = maxSize;
		arr = new int[maxSize];
	}
	
	public boolean isEmpty() {
		if (rear == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if (rear>= maxSize - 1) {
			return true;
		}
		return false;
	}
	
// Elements are inserted at the end. That is rear value will increase.
	
	public boolean enqueue(int data) {
		if (isFull()) {
			return false;
		}
		arr[++rear] = data;
		return true;
	}
	
// In dequeue the front value will be eliminated therefore front need to be incremented.	
	public boolean dequeue() {
		if (isEmpty()) {
			return false;
		}
//		arr[rear--]
		front += 1;
		return true;
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("The Queue is Empty");
		}
		System.out.println("Displaying the elements of Queue:");
		
		for (int i = front; i<=rear; i++) {
			System.out.println(arr[i]);
		}
	}	
}
