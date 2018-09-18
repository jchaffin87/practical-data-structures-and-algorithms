package ds.singlylinkedlist;

public class SinglyLinkedList {

	private Node first;

	public SinglyLinkedList() {

	}

	public boolean isEmpty() {
		return (first == null);
	}

	// used to insert at beginning of list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}

	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.println("List (first ---> last");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
	}

	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next; // go to last node that's linked to another
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}

}