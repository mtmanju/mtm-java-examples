package com.mtm.examples.sort;

import java.util.*;
import java.util.stream.Collectors;


public class SortByRepetitionFrequencey {

    public static void main(String[] args) {
        List<String> listOfNames = Arrays.asList("Smi", "Manju", "Smita", "Kaustav", "Smita", "Jishna", "Kaustav", "Jishna", "Jishna");
        System.out.println("Before Sorting: " + listOfNames);

        List<String> sortedNamesOnFrequency = listOfNames.stream().collect(Collectors.groupingBy(s -> s))
                .values().stream().sorted((val1, val2) -> Integer.compare(val2.size(), val1.size()))
                .flatMap(List::stream).collect(Collectors.toList());

        System.out.println("After Sorting: " + sortedNamesOnFrequency);

        System.out.println("After Sorting : " + approach2(listOfNames));

    }

    private static List<String> approach2(List<String> listOfNames) {
        // Step 1: Create a HashMap to store the frequency count
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String str : listOfNames) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        // Step 2: Create a custom comparator to sort based on frequency count
        Comparator<String> frequencyComparator = (str1, str2) -> {
            int frequency1 = frequencyMap.get(str1);
            int frequency2 = frequencyMap.get(str2);
            return Integer.compare(frequency2, frequency1); // Descending order
        };

        // Step 3: Sort the list using the custom comparator
        listOfNames.sort(frequencyComparator);
        return listOfNames;
    }

}