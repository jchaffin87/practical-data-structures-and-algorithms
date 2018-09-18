package ds.stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top; // the index position of the last item placed in stack

	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}

	// Add items to the stack
	public void push(long value) {
		if (!isFull()) {
			top++;
			stackArray[top] = value;
		} else {
			System.out.println("Sorry, unable to add element. The stack has reached its maximum size.");
		}
	}

	// "Remove" item from top of stack by moving "top" pointer to allow override
	// values at that index
	public long pop() {
		if (isEmpty()) {
			System.out.println("The stack is already empty");
			return -1;
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top]; // item we are "removing"
		}
	}

	public long peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return maxSize - 1 == top;
	}
}
