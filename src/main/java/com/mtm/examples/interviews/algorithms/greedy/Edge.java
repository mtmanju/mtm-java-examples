package com.mtm.examples.interviews.algorithms.greedy;

public class Edge {

	int source;
	int dest;

	public Edge(int source, int dest, int cost) {
		this.source = source;
		this.dest = dest;
		this.cost = cost;
	}

	int cost;

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getDest() {
		return dest;
	}

	public void setDest(int dest) {
		this.dest = dest;
	}

	public Edge(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
