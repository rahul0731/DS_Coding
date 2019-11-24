package ds;

public class SingleLinkedList {
	
  class Node{
	  Object data;
	  Node next;
	  Node(Object data) {
		  this.data = data;
	  }
  }
  
  static Node head = null ;
  
  //Adding the element in the last.
  boolean add(Object obj)
  {
	  Node  n = new Node(obj) ;
	  if(head == null) {
		  head = n ;
		  return true;
	  }
	  Node t = head ;   // temp varible for head pointing
	  while(t.next != null)
	  {
		  t = t.next;  // traverse and compare to next node.
	  }
	  t.next = n;   // If next node will null
	  return true;
  }
  
  void display() {
	  Node t = head;
	  while(t != null)   // it will check until the null will come.
	  {
		  System.out.print(t.data);
		  if(t.next != null)     //for checking the pointer will not coming after the null.
			  System.out.print("-->");
		  t = t.next; 
	  }
  }
  
 // Method for Adding  in the fist of node.
  
  boolean addFirst(Object obj) {
	  Node n = new Node(obj);
	  n.next = head;
	  head = n;
	  return true;
	  
  }
  
  //Method for deleting first element
  boolean deleteFirst() {
	 
	  Node t = head;
	  head = head.next;
	  
	  System.out.println("All delete ");
	  return true;
  }
  
  //Method for reverse the SingleLinkeList
  void reverse() {
	  Node prev = null;
	  Node current = head;
	  Node next = null;
	  while(current != null) {
		  next = current.next;
		  current.next = prev;
		  prev = current;
		  current = next;
		  
	  }
	  head = prev;
  }

 // Method for Delete the last element in the node
 

//Method for reverse the element
void rev(Node n) {
	if (n.next != null) {
		rev(n.next);
		
	}
	System.out.println(n.data);
}

void reverseDisplay() {
	rev(head);
}
//Method for add dynamic element 
boolean add(Object data , int in) {
	try {
	Node n  = new Node(data);
	Node t = head;
	while(t.next != null && in >1) {
		t = t.next;
		in--;
	}
	n.next = t.next;
	t.next = n;
	return true;
	}
catch(Exception e) {
return false;
}
}

// Method for specify delete
Object delete(int in) {
	System.out.println("After deleing " +in  + " th elements.");
	try {
		if(in==0) {
			Object data = head.data;
			head = head.next;
			return data;
		}
		Node t = head;
		while(t.next != null && in>1) {
			t = t.next;
			in--;
		}
		
		Object data = t.next.data;
		if(t.next.next != null) {
			t.next = t.next.next;
		}
		else
			t.next =  null;
		return data;
	} catch (Exception e) {
		return null;
	}
}



public static void main(String[] args) {
	SingleLinkedList sl  = new SingleLinkedList();
	
	sl.add("B");
	sl.add("A");
	sl.add("C");
	sl.addFirst("G");
	
	sl.display();
	System.out.println();

	}
}


