package ds.linkedlist;

public class Node {

	private int value = 0;
	private Node link = null;

	public int getValue() {
		return value;
	}

	public Node getLink() {
		return link;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setLink(Node link) {
		this.link = link;
	}

}
