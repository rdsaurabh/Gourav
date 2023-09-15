package linkedlist;

public class DLL {
	
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node {
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
		}
	}
	
	//add - O(1)
	public void add(int val) {
		Node nn = new Node(val);
		
		if(isEmpty() == true) {
			head = nn;
			tail = nn;
		}else {
			tail.next = nn;
			nn.prev = tail;
			tail = nn;
		}
		size++;
	}
	
	//addFirst - O(1)
	public void addFirst(int val) {
		Node nn = new Node(val);
		
		if(isEmpty() == true) {
			head = nn;
			tail = nn;
		}else {
			nn.next = head;
			head.prev = nn;
			head = nn;
		}
		size++;
	}
	
	//addLast -O(1)
	public void addLast(int val) {
		add(val);
	}
	
	//remove(ind) - O(n)
	public void remove(int ind) {
		
		if(size == 0) {
			throw new RuntimeException();
		}
		
		if(ind < 0 || ind >= size) {
			throw new RuntimeException();
		}
		
		if(ind == 0) {
			removeFirst();
		}else if(ind == size - 1) {
			removeLast();
		}else {
			Node cur = head;
			int count = 0;
			
			while(count != ind) {
				cur = cur.next;
				count++;
			}
			
			cur.prev.next = cur.next;
			cur.next.prev = cur.prev;
			size--;
		}
	

	}
	
	
	
	//removeFirst() - O(1)
	public void removeFirst() {
		if(isEmpty() == true) {
			throw new RuntimeException();
		}
		
		if(size == 1) {
			head = null;
			tail = null;
		}else {
			head = head.next;
			head.prev = null;
		}
		size--;
	}
	
	//removeLast() -O(1)
	public void removeLast() {
		if(isEmpty() == true) {
			throw new RuntimeException();
		}
			
		if(size == 1) {
			head = null;
			tail = null;
		}else {
			tail = tail.prev;
			tail.next = null;
		}
		size--;
	}
	
	//get(ind)
	public int get(int ind) {
		if(isEmpty()) {
			throw new RuntimeException(); 
		}
		
		if(ind < 0 || ind >= size) {
			throw new RuntimeException();
		}
		
		int count = 0;
		Node cur = head;
		while(count < ind) {
			cur = cur.next;
			count++;
		}
		
		return cur.data;
		
	}
	
	//getFirst()
	public int getFirst() {
		if(isEmpty()) {
			throw new RuntimeException(); 
		}
		
		return head.data;
	}
	
	//getLast()
	public int getLast() {
		if(isEmpty()) {
			throw new RuntimeException();
		}
		return tail.data;
	}
	//add(ind)
	public void add(int ind,int val) {
		Node nn = new Node(val);
		 if(isEmpty()) {
			 if(ind == 0) {
				 head = nn;
				 tail= nn;
				 size++;
			 }else {
				 throw new RuntimeException();
			 }
			 
		 }else {
			 if(ind < 0 || ind > size) {
				 throw new RuntimeException();
			 }else {
				 if(ind == 0) {
					 addFirst(val);
				 }else {
					 int count = 0;
					 Node cur = head;
					 while(count != ind - 1) {
						 count++;
						 cur = cur.next;
					 }
					 
					 if(count == size - 1) {
						 addLast(val);
					 }else {
						 nn.next = cur.next; 
						 nn.prev = cur;
						 cur.next = nn; 	 
						 nn.next.prev = nn; 
						 size++;
					 }
					 
				 }
			 }
			 
		 }
		
	}
	
	//isEmpty
	public boolean isEmpty() {
		return size == 0 ? true : false; 
	}
	
	//size
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		StringBuilder ll = new StringBuilder("[");
		
		Node cur = head;
		while(cur != null) {
			ll.append(cur.data +",");
			cur = cur.next;
		}
		
		ll.append("]");
		return ll.toString();
		
	}

}
