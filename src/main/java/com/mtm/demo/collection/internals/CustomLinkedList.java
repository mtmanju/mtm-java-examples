package com.mtm.demo.collection.internals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Manjunath M T
 *
 */
public class CustomLinkedList<E> {
	Node<E> root;

	public void addData(E key) {
		Node<E> newNode = new Node<>(key);
		if (null == root) {
			root = newNode;
		} else {
			Node<E> currentNode = root;
			while (null != currentNode.next) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

	public List<Node<E>> getData(Node<E> node) {
		List<Node<E>> nodes = new ArrayList<>();
		while (null != node.next) {
			nodes.add(node);
			node = node.next;
		}
		nodes.add(node);
		return nodes;
	}

	public static void main(String args[]) {
		CustomLinkedList<Object> list = new CustomLinkedList<>();
		list.addData(1);
		list.addData(2);
		list.addData("3");
		list.addData("Hello");

		System.out.println("Items:\t" + list.getData(list.root));
	}
}
