package ds;

public class LinkedList {
	Node head;
	//Adding element in the last 
	public void insert(Object data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next!= null) {
				n = n.next;
				
			}
			n.next = node;
		}
	}
	
	//Display the element
	public void display() {
		Node node = head;
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insert("a");
		l.insert("b");
		l.insert("c");
		l.display();
	}

}
