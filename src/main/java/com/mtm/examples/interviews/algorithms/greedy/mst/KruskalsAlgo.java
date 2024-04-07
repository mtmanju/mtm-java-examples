package com.mtm.examples.interviews.algorithms.greedy.mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mtm.examples.interviews.algorithms.greedy.Edge;

public class KruskalsAlgo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfVertices = Integer.parseInt(br.readLine());
		int numOfEdges = Integer.parseInt(br.readLine());

		Edge[] arrOfEdges = new Edge[numOfEdges];

		for (int i = 0; i < numOfEdges; i++) {

			String[] edgeDetail = br.readLine().split(" ");
			int source = Integer.parseInt(edgeDetail[0]);
			int dest = Integer.parseInt(edgeDetail[1]);
			int weight = Integer.parseInt(edgeDetail[2]);

			Edge edge = new Edge(source, dest, weight);
			arrOfEdges[i] = edge;

		}
		List<Edge> listOfEdges = Arrays.asList(arrOfEdges);
		Collections.sort(listOfEdges, new Comparator<Edge>() {
			public int compare(Edge o1, Edge o2) {
				return o1.getCost() - o2.getCost();
			}
		});

		printMinimumSpanningTree(listOfEdges, numOfVertices);

	}

	private static void printMinimumSpanningTree(List<Edge> listOfEdges, int numOfVertices) {
		int[] parent = new int[numOfVertices];
		int mst = 0;

		for (int i = 0; i < numOfVertices; i++)
			parent[i] = i;

		for (int i = 0; i < listOfEdges.size(); i++) {

			int sourceVertex = listOfEdges.get(i).getSource();
			int destVertex = listOfEdges.get(i).getDest();

			int cost = listOfEdges.get(i).getCost();

			if (find(sourceVertex, parent) != find(destVertex, parent)) {
				union(sourceVertex, destVertex, parent);
				mst += cost;
				System.out.print("" + sourceVertex + destVertex + "->");

			}
		}

		System.out.println("the minimum cost of the spanning tree is " + mst);
	}

	private static int find(int vertex, int[] parent) {
		if (parent[vertex] == vertex)
			return vertex;
		else
			return find(parent[vertex], parent);
	}

	private static void union(int source, int destination, int[] parent) {

		int x = find(source, parent);
		int y = find(destination, parent);
		parent[y] = x;

	}

}