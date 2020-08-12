public class TestSinglyLinkedList {

	public static void main(String[] args) {
		MyLinkedList<Integer> myL = new MyLinkedList<Integer>();
		myL.add(1);
		myL.add(2);
		myL.add(3);
		myL.add(4);
		myL.add(5);
		// "abc1");
		myL.display();
		System.out.println("Minimum Node: " + myL.minNode());
	}
}

class MyLinkedList<T> {
	private Node<T> head = null;
	private Node<T> tail = null;

	MyLinkedList() {
		// head.node = null;
		// head.item = item;
	}

	class Node<T> {
		Node<T> node;
		T item;

		Node(T item) {

			this.node = null;
			this.item = item;
		}
	}

	public void add(T item) {

		Node<T> current = new Node<T>(item);

		if (head == null) {
			// head = null;
			head = current;
			tail = current;
		} else {
			tail.node = current;
			tail = current;
		}
	}

	public void display() {
		Node<T> current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {
			System.out.println("value: " + current.item);
			current = current.node;

		}
	}

	public int minNode() {
		int min = 0;// = head.item;
		// minNode.item = head.item;
		Node<T> current = head;

		if (head == null) {
			System.out.println("List is empty");
		} else {
			// Initializing min with head node data
			min = (int) head.item;

			while (current != null) {
				if (min > (int) current.item) {
					min = (int) current.item;
				}
				current = current.node;
			}
		}
		return min;
	}
