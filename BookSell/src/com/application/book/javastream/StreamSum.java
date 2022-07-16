package com.application.book.javastream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSum {

	private static Optional<Integer> reduce;

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,23,4,26,78,10,9,23,8,9);
		
		reduce = list.stream().reduce((a,b) -> a+b);
		System.out.println("Sum of the numbers is:- " + reduce.get());
		
		double average = list.stream().mapToInt(x -> x).average().orElse(0);
		System.out.println("Average is : " + average);
		
		double doubleAvg = list.stream().map(a -> a*a).filter(a -> a>100).mapToInt(a ->a).average().orElse(0);
		System.out.println("Double Avg : " + doubleAvg);
		
		List<Integer> collect = list.stream().map(String::valueOf).filter(n -> n.startsWith("2"))
		                 .map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("start with 2 :" + collect);
		
		//find out duplicate number
		
		Set<Integer> duplicate = list.stream()
		.filter(num -> Collections.frequency(list, num)>1)
		.collect(Collectors.toSet());
		
		System.out.println("Duplicate set:" + duplicate);
		
		
		
	}
}
