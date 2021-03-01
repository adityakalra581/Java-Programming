package dsaassesmenttest;

class Queue {

	private int front; // front represents the index position of the first element in the queue
	private int rear; // rear represents the index position of the last element in the queue
	private int maxSize; // maxSize represent the maximum number of elements that can be stored in the queue
	private int arr[];

	Queue(int maxSize) {
		this.front = 0; // front is 0 when the queue is created
		this.rear = -1; // rear is -1 when the queue is created
		this.maxSize = maxSize;
		this.arr = new int[maxSize];
	}

	// Checking if the queue is full or not
	public boolean isFull() {
		if (rear == maxSize - 1) {
			return true;
		}
		return false;
	}

	// Adding a new element to the rear of queue
	public boolean enqueue(int data) {
		if (isFull()) {
			return false;
		} else {
			arr[++rear] = data;
			return true;
		}
	}

	// Displaying all the elements in the queue
	public void display() {
		if (isEmpty())
			System.out.println("Queue is empty!");
		else {
			System.out.println("Displaying queue elements");
			for (int index = front; index <= rear; index++) {
				System.out.println(arr[index]);
			}
		}
	}

	// Checking if the queue is empty or not
	public boolean isEmpty() {
		if (front > rear)
			return true;
		return false;
	}

}

class QueueNew {

	public static void main(String[] args) {

		Queue queue = new Queue(10);
		
		operate(queue);
		queue.display();

	}
	
	
	public static void operate(Queue queue){
	    int[] numbers = {12, 18, 17, 16, 28, 34, 36};
	    int count = 6;
	    for (int number: numbers){
	        if (count == 0){
	            break;
	        }
	        if (number%count ==0){
	            queue.enqueue(number);
	        }
	        --count;
	    }
	}
	
	
	
	
	
}
