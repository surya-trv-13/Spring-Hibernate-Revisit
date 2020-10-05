package com.trv13.spring.springboot.springbootrest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/book")
	public List<Book> getBook(){
		return Arrays.asList(
				new Book(1, "Complete Short Stories of Sherlock Holmes", "Arthur Conan Doyle"),
				new Book(2, "Wings of Fire", "A.P.J Abdul kalam"),
				new Book(3, "Origin", "Dan Brown")
		);
	}
}
