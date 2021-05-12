package com.springdemo.SpringDemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController 
{
	
	@GetMapping("/books")
	public List<Book> bookResource()
	{
		
		List<Book> list = Arrays.asList(new Book(100, "Spring", "satheesh"),new Book(100, "Rest", "ballur"));
		
		return list;
	}

}
