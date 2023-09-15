package queue;

public class Queue {
	int arr[];
	int size = 0;
	
	public Queue(int k) {
		arr = new int[k];
	}
	
	
	public void enque(int num) {
		
		if(isFull() == true)  { //1
			throw new RuntimeException();
		}
		arr[size] = num; //1
		size++;//1
	}
	
	public int deque() {
		
		if(isEmpty() == true) { //1
			throw new RuntimeException();
		}
		
		int front = arr[0]; //1
		
		for(int i = 1; i < size ; i++) { //O(n - 1)  ==> O(n)
			arr[i - 1] = arr[i];
		}
		
		size--; //1
		
		return front; //1
	}
	
	public boolean isEmpty() {
		//O(1)
		return size == 0 ? true : false;
	}
	
	public boolean isFull() {
		//O(1)
		return size == arr.length ? true : false;
	}
	
	public int peek() {
		if(isEmpty() == true) throw new RuntimeException();
		return arr[0];	
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		for(int i = 0; i < size; i++) {
			str.append(arr[i] + ", ");
		}
		
		str.append("]");
		
		return str.toString();
	}
	
}
