package ds;

public class DoublyLinklist {
	class Node{
		Object data;
		Node next;
		Node prev;
		Node(Object data) { 
			this.data = data;
		}
	}
	
	
	Node head;
	boolean add(Object ele) {
		Node n = new Node(ele);
		if (head == null) {
			head = n;
			return true;
			
		}
		Node t = head;
		while(t.next != null) {
			t = t.next;
		}
		n.prev = t;
		t.next = n;
		return true;
	}
	
	boolean addFirst(Object ele) {
		Node n = new Node(ele);
		n.next = head;
		if(head != null)
			head.prev = n;
		head = n;
		
		return true;
	}
	
	public static void main(String[] args) {
		DoublyLinklist dl = new DoublyLinklist();
		dl.add("A");
		dl.add("B");
		
		
	}
	

}
