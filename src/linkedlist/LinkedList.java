package linkedlist;

public class LinkedList {
	
	private Node head;
	
	private class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	//add new node - O(n)
	public void add(int data) {
		
		Node nn = new Node(data);
		
		if(isEmpty() == true) {
			head = nn; // 1
		}else {
			Node lastNode = head; //1
			while(lastNode.next != null) { //n
				lastNode = lastNode.next;
			}
			lastNode.next = nn; //1
		}
			
	}
	
	//display - O(n)
	void display() {
		Node it = head;
		
		System.out.print("[ ");
		
		while(it != null) {
			System.out.print(it.data +", ");
			it = it.next;
		}
		
		System.out.print("] ");
	}
	
	
	//isEmpty -> O(1)
	public boolean isEmpty() {
		return head == null ? true : false;
	}
	
	//get(index)  - O(n)
	public int get(int index) {
		
		if(head == null) {
			throw new RuntimeException();
		}
		
		int count = 0; //1
		Node cur = head; //1
		
		while(cur != null && count != index) { //n
			count++;
			cur = cur.next;
		}
		
		if(cur != null && count == index) {//1
			return cur.data;
		}else { //1
			throw new RuntimeException();
		}
	}
	
	//remove(index)
	public int remove(int index) {
		
		if(head == null) {
			throw new RuntimeException();
		}
		
		if(index == 0) {
			int val = head.data;
			head = head.next;
			return val;
		}
		
		int count = 0; //1
		Node cur = head; //1
		
		while(cur != null && count != index - 1) { //n
			count++;
			cur = cur.next;
		}
			
		if(cur.next != null && count == index - 1) {//1
			int val = cur.next.data;
			cur.next = cur.next.next;
			return val;
		}else { //1
			throw new RuntimeException();
		}
	}

	//add(index,value) - O(n)
	public void add(int index, int value) {

		Node nn = new Node(value);
		
		if(head == null) {
			if(index == 0) {
				head = nn;
			}else {
				throw new RuntimeException();
			}
		}
		
		if(index == 0) {
			nn.next = head;
			head = nn;
			return;
		}
		
		int count = 0;
		Node cur = head;
		
		while(cur != null && count != index - 1) {
			count++;
			cur = cur.next;
		}
		
		if(cur != null && count == index - 1){
				nn.next = cur.next;
				cur.next = nn;
		}else {
			throw new RuntimeException();
		}
		
	}

	
	
	
	
	
	
}
