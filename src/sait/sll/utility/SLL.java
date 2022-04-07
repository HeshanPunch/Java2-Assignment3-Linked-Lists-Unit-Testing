package sait.sll.utility;

public class SLL implements LinkedListADT {

	private Node head;
	private Node tail;

	private int size = 0;

	/**
	 * Checks if the list is empty.
	 * 
	 * @return True if it is empty.
	 */
	public boolean isEmpty() {
	if (head == tail && head == null) {
		return true;
	}else {
		return false;
	}
	}

	/**
	 * Clears the list.
	 */
	public void clear() {
	}

	/**
	 * Adds to the end of the list.
	 * 
	 * @param data Data to append.
	 */
	public void append(Object data) {
		System.out.println(data + " appending line31");
		if (!isEmpty()) {
			Node node = new Node(data);
			tail.setNext(node);
			tail = tail.getNext();
		} else {
			Node node = new Node(data);
			tail = head = node;
		}
		size++;
	}

	/**
	 * Prepends (adds to beginning) data to the list.
	 * 
	 * @param data Data to store inside element.
	 */
	public void prepend(Object data) {
		Node node = new Node(data, head);
		head = node;

		if (tail == null) {
			tail = head;
		}
		size++;

	}

	/**
	 * Adds a new element at a specific position.
	 * 
	 * @param data  Data that element is to contain.
	 * @param index Index to add new element at.
	 * @exception IndexOutOfBoundsException Thrown if index is negative or past the
	 *                                      size of the list.
	 */
	public void insert(Object data, int index) throws IndexOutOfBoundsException {
	}

	/**
	 * Replaces the data at index.
	 * 
	 * @param data  Data to replace.
	 * @param index Index of element to replace.
	 * @exception IndexOutOfBoundsException Thrown if index is negative or larger
	 *                                      than size - 1 of list.
	 */
	public void replace(Object data, int index) throws IndexOutOfBoundsException {
	}

	/**
	 * Gets the number of elements in the list.
	 * 
	 * @return Size of list (0 meaning empty)
	 */
	public int size() {
		return 0;
	}

	/**
	 * Removes element at index from list, reducing the size.
	 * 
	 * @param index Index of element to remove.
	 * @exception IndexOutOfBoundsException Thrown if index is negative or past the
	 *                                      size - 1.
	 */
	public void delete(int index) throws IndexOutOfBoundsException {
	}

	/**
	 * Gets the data at the specified index.
	 * 
	 * @param index Index of element to get.
	 * @return Data in element or null if it was not found.
	 * @exception IndexOutOfBoundsException Thrown if index is negative or larger
	 *                                      than size - 1 of the list.
	 */
	public Object retrieve(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			return null;
		} else if (index == 0) {
			return head;

		} else {
			Node nodeAtIndex = head;
			for (int i = 0; i < index; i++) {
				nodeAtIndex = nodeAtIndex.getNext();
			}
			return nodeAtIndex;

		}

	}

	/**
	 * Gets the first index of element containing data.
	 * 
	 * @param data Data object to find the first index of.
	 * @return First of index of element with matching data or -1 if not found.
	 */
	public int indexOf(Object data) {
		return 0;
	}

	/**
	 * Go through elements and check if we have one with data.
	 * 
	 * @param data Data object to search for.
	 * @return True if element exists with value.
	 */
	public boolean contains(Object data) {
		return false;
	}

}
