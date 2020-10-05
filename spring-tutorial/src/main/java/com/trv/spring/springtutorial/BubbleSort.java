package com.trv.spring.springtutorial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		
		return numbers;
	}
}
