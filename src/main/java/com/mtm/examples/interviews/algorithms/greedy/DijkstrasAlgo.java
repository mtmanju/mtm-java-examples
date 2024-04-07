package com.mtm.examples.interviews.algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DijkstrasAlgo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfVertices = Integer.parseInt(br.readLine());
		int numOfedges = Integer.parseInt(br.readLine());

		int adjacencyMatrix[][] = new int[numOfVertices][numOfVertices];

		for (int i = 0; i < numOfedges; i++) {

			String edgeInfo[] = br.readLine().split(" ");
			int source = Integer.parseInt(edgeInfo[0]);
			int dest = Integer.parseInt(edgeInfo[1]);
			int weight = Integer.parseInt(edgeInfo[2]);

			adjacencyMatrix[source][dest] = weight;
			adjacencyMatrix[dest][source] = weight;

		}
		dijkstra(adjacencyMatrix);

	}

	private static void dijkstra(int[][] adjacencyMatrix) {
		int v = adjacencyMatrix.length;

		boolean visited[] = new boolean[v];
		int[] distance = new int[v];
		distance[0] = 0;

		for (int i = 1; i < v; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < v - 1; i++) {
			int minVertex = findMinVertex(distance, visited);
			visited[minVertex] = true;
			for (int j = 0; j < v; j++) {
				if (adjacencyMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
					int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j];
					if (newDist < distance[j]) {
						distance[j] = newDist;
					}
				}
			}
		}

		for (int i = 0; i < v; i++) {
			System.out.println(i + " " + distance[i]);
		}

	}

	private static int findMinVertex(int[] distance, boolean[] visited) {
		int minVertex = -1;

		for (int i = 0; i < distance.length; i++) {
			if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
				minVertex = i;
			}
		}
		return minVertex;
	}

}
