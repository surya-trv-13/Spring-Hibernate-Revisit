package com.trv.spring.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {
	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort()); // Dependency Injection

		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringTutorialApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class); //created object of BinarySearchImpl
		
		int result = binarySearch.binarySearch(new int[]{1,2,3,4,5}, 1);
		System.out.println(result);
		
	}

}
