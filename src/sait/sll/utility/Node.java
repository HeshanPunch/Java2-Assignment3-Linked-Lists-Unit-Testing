package sait.sll.utility;

public class Node {
	
	private Object data;
	private Node next;
	
	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
		
		
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setSuccessor(Node node) {
		// TODO Auto-generated method stub
		
	}

	public Node getSuccessor() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getElement() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
