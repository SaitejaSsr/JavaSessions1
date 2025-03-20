package com.positive.negative.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PositiveNegativeInteger {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(-2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8);

		Map<Object, List<Integer>> numbersByEvenOddType = numbers.stream().collect(Collectors.groupingBy(n -> n % 2));
		System.out.println(numbersByEvenOddType);

		Map<Object, List<Integer>> numberByEvenOdd = numbers.stream()
				.collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
		System.out.println(numberByEvenOdd);

		Map<String, List<Integer>> numbersByCategory = numbers.stream().collect(Collectors.groupingBy(n -> {
			if (n > 0)
				return "Positive";
			else if (n < 0)
				return "Negative";
			else
				return "Zero";
		}));
		System.out.println(numbersByCategory);

		Map<String, List<Integer>> numbersByCategorySC = numbers.stream()
				.collect(Collectors.groupingBy(n -> n > 0 ? "Positive" : n < 0 ? "Negative" : "Zero"));
		System.out.println(numbersByCategorySC);

	}
}
