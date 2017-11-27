package com.mtm.demo.datastructures;

public class LinkedList {

	private Node root;

	public void addAtEnd(int data) {
		if (root == null) {
			root = new Node(data);
			return;
		}

		Node temp = root;
		while (temp != null) {
			temp = temp.next;
		}
	}

	public void addAtStart(int data) {
		Node newRoot = new Node(data);
		newRoot.next = root;
		root = newRoot;
	}

	public int removeFromStart() {
		int data = root.data;
		root = root.next;
		return data;
	}

	public void printList() {
		if (root == null) {
			System.out.println("List is empty!");
		}

		Node temp = root;
		System.out.println();

		while (temp != null) {
			System.out.println(">" + temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.printList();
		list.addAtEnd(10);
		list.printList();
		list.addAtStart(20);
		list.printList();
		list.removeFromStart();
		list.printList();
	}
}
