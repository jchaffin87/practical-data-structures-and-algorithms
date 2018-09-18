package ds.linkedlist;

public class App {

	public static void main(String[] args) {

		Node nodeA = new Node();
		nodeA.setValue(4);

		Node nodeB = new Node();
		nodeB.setValue(3);

		Node nodeC = new Node();
		nodeC.setValue(7);

		Node nodeD = new Node();
		nodeD.setValue(8);

		// 4 with 3, 3 with 7, 7 with 8
		nodeA.setLink(nodeB);
		nodeB.setLink(nodeC);
		nodeC.setLink(nodeD);

		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));

	}

	public static int listLength(Node node) {
		int length = 0;
		Node currentNode = node;
		while (currentNode != null) {
			currentNode = currentNode.getLink();
			length++;
		}
		return length;
	}
}
