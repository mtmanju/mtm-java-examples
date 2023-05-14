package com.mtm.demo.math;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i < 30; i++) {
            listOfNumbers.add(i);
        }
        // add duplicate number into the list
        listOfNumbers.add(23);
        listOfNumbers.add(2);

        DuplicateNumber duplicateNumber = new DuplicateNumber();
        System.out.println("Duplicate Element: " + duplicateNumber.findDuplicateNumber(listOfNumbers));
    }

    public int findDuplicateNumber(List<Integer> listOfNumbers) {
        int highestNumber = listOfNumbers.size() - 1;

        int totalSumOfNumbers = getTotalSumOfNumbers(listOfNumbers);

        int duplicate = totalSumOfNumbers - (highestNumber * (highestNumber + 1) / 2);
        return duplicate;
    }

    public int getTotalSumOfNumbers(List<Integer> listOfNumbers) {

        int sum = 0;
        for (int num : listOfNumbers) {
            sum += num;
        }
        return sum;
    }

}