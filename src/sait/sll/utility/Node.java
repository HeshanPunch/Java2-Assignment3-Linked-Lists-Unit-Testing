package sait.sll.utility;

import java.io.Serializable;

public class Node implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4873561995572523382L;
	private Object data;
	private Node next;

	//constructor for node with data(data) and a successor node(next)
	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;

	}
	
	//constructor for the last node, next is null
	public Node(Object data) {
		this.data = data;
		this.next = null;
		
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


}
