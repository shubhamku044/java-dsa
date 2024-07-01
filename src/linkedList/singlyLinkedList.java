package linkedList;

public class singlyLinkedList {
	public static void main(String[] args) {
		System.out.println("Linked List");
		Node<Integer> n1 = new Node<Integer>(1);
		Node<Integer> n2 = new Node<Integer>(3);
		Node<Integer> n3 = new Node<Integer>(9);

		n1.next = n2;
		n2.next = n3;

		traverse(n1);
		insert(30, n1, 0);
		traverse(n1);
	}

	static void traverse(Node<Integer> head) {
		System.out.println("Traversing");

		Node<Integer> curr = head;

		while (curr != null) {
			System.out.println("Data: " + curr.data);
			curr = curr.next;
		}
	}

	static void insert(int data, Node<Integer> head, int pos) {
		Node<Integer> node = new Node<Integer>(data);
		if (pos == 0) {
			node.next = head;
			head = node;
			return;
		}
		Node<Integer> prev = head;

		for (int i = 0; i < pos - 1; i++) {
			prev = prev.next;
		}
		node.next = prev.next;
		prev.next = node;
	}
}

class Node<T> {
	T data;
	Node<Integer> next;

	Node(T data) {
		this.data = data;
		this.next = null;
	}
}