package com.trv.spring.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	// Return the position
	
	@Autowired 
	private SortAlgorithm sortAlgorithm; // This is a dependency
	
	// Setter Injection
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// Sort the Array
		numbers = sortAlgorithm.sort(numbers);
		
		System.out.println(sortAlgorithm);
		
		// Apply Binary Search
		
		return 5;
	}
}
