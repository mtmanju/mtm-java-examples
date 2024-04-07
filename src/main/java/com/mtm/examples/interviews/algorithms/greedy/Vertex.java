package com.mtm.examples.interviews.algorithms.greedy;

import java.util.List;

public class Vertex {

	int label;
	boolean visited;
	List<Vertex> adjacencyList;

	public Vertex(int label) {
		this.label = label;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Vertex> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

	public int getLabel() {
		return label;
	}

	public void setLabel(int label) {
		this.label = label;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}
