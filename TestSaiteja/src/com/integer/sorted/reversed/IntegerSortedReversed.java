package com.integer.sorted.reversed;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerSortedReversed {

	public static void main(String[] args) {

		 // Sorting numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            numbers.add(i);
        }

        // Ascending order sorting
        List<Integer> sortedList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted List: " + sortedList);

        // Descending order sorting
        List<Integer> reversedList = sortedList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Reversed List: " + reversedList);

	}

}
