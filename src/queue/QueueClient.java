package queue;

public class QueueClient {
	public static void main(String[] args) {
		Queue q = new Queue(5);
		
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
		q.enque(5);
	
		System.out.println(q);
		q.deque();
		System.out.println(q);
		q.deque();
		System.out.println(q);
		q.deque();
		System.out.println(q);
		q.deque();
		System.out.println(q);
		q.deque();
		
	}
}
