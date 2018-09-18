package ds.queue;

public class Queue {

	private int maxSize; // initializes the set number of slots
	private long[] queArray; // slots to maintain the data
	private int front; // the index position for the element in the front
	private int rear; // the index position for the element in the back
	private int nItems; // counter to maintain the number of items in queue

	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(long j) {
		if (rear == maxSize - 1) { // allow overwriting the beginning of array if array is full
			rear = -1;
		}
		rear++;
		queArray[rear] = j;
		nItems++;
	}

	public long remove() { // remove item from front of queue
		long temp = queArray[front];
		front++;
		if (front == maxSize) {
			front = 0; // set front back to 0th index so we can utilize the entire array again
		}
		nItems--;
		return temp;
	}

	public long peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public void view() {
		System.out.println("[ ");
		for (int i = 0; i < queArray.length; i++) {
			System.out.println(queArray[i] + " ");
		}
		System.out.println(" ]");
	}
}
