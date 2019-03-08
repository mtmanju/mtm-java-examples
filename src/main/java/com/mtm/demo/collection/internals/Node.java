package com.mtm.demo.collection.internals;

/**
 * @author Manjunath M T
 *
 */
public class Node<E> {

	E key;
	Node<E> next;

	public Node(E key) {
		this.key = key;
	}

	public String toString() {
		return "" + key;
	}

}