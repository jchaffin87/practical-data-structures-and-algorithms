package ds.circularlylinkedlist;

import ds.singlylinkedlist.Node;

public class CircularLinkedList {

	private Node first;
	private Node last;

	public CircularLinkedList() {
		this.first = null;
		this.last = null;
	}

	private boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			last = newNode;
		}
		newNode.next = first; // links newNode to old first
		first = newNode; // sets first to newNode
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; // old last will link to new node
			last = newNode; // newNode becomes new last
		}

	}

	public int deleteFirst() {
		int temp = first.data;
		if (first.next == null) {
			last = null;
		}
		first = first.next; // new first will point to old first's next value
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

}
