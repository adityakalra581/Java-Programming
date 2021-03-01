package queuefirst;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue queue = new Queue(5);
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		queue.display();
		queue.dequeue();
		queue.display();

	}

}
