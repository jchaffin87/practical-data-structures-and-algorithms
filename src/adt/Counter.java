package adt;

public class Counter {

	private String name = "";
	private int value = 0;

	Counter(String str) {
		str = this.name;
	}

	public void increment() {
		value++;
	}

	public int getCurrentValue() {
		return value;
	}

	@Override
	public String toString() {
		return name + " " + value;

	}

}
