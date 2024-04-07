package com.mtm.examples.interviews.datastructure.graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(br.readLine());
        for (int j = 0; j < numOfTestCases; j++) {
            int roads = Integer.parseInt(br.readLine());
            String[] tokenizer;
            Map<String, Integer> mapOfCities = new HashMap<String, Integer>();

            for (int i = 0; i < roads; i++) {

                tokenizer = br.readLine().split(" ");

                if (!mapOfCities.containsKey(tokenizer[0]))
                    mapOfCities.put(tokenizer[0], 1);
                if (!mapOfCities.containsKey(tokenizer[1]))
                    mapOfCities.put(tokenizer[1], 1);

            }

            System.out.println(mapOfCities.size());
        }
    }
}