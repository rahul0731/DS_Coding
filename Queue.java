package ds;

public class Queue {
	private Object obj[];
	private int cap;
	private int rear, front;
	private int count;


	public Queue(int size) {
		this.cap = size;
		obj = new Object[size];
		front = rear = -1;
	
	}

	public void enque(Object ele) {
				if (rear == cap - 1) {
			System.out.println("Queue is full");
			return;
		}
		System.out.println("Inserting element " + ele);
		if (front == -1) 
			front = 0;
			obj[++rear] = ele;
		count++;
		
	}
	public Object peak() {
		if(front == -1)
			//System.out.println("Stack is underflow");
		return "Stack is underflow";
		return obj[front];
	}

	public Object deque(){
		
		if(front== -1) {
			System.out.println("Queue is empty"); 
			return cap;
		}
		System.out.println("Removing elemet" + obj[front]);
		
		Object ele = obj[front++];
		count --;
		if (front > rear)
			front = rear = -1;
		return ele;
	}
	public void display() {
		for(int i = front ; i<=rear-1 ; i++) {
			System.out.print(obj[i]);
			
			if(i<rear)
				System.out.print(" , ");
		}
	}
	public int size() {
		if(front == -1)
			return 0;
		return rear -front +1;
	}
	public  boolean isEmpty() {
		if(front == -1)
			return true ;
		return false;
	}
	public boolean isFull() {
		return cap == rear -front +1;
	}


	public static void main(String[] args) {
		Queue a = new Queue(4);
		
//		  a.enque(4);
//		  a.enque(5); 
//		  a.enque(10);
//		  a.enque(45);
//		  a.enque(5);
		  //a.enque(44);
		 
		  a.display();
		  
		  a.deque();
		  
		  a.display();
		  //a.peak();
		  System.out.println("\nPeak Element " + a.peak());
		  System.out.println(a.isEmpty());		
		  System.out.println(a.isFull());

	}
}
