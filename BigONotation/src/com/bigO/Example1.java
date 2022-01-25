package com.bigO;

import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {

		// What is the efficiency of this class?
		
		// Look through the whole program for the "Worst Case Scenario"
		System.out.println("Hello there");
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Hello there!");
		}
		
		String ex1 = "Hello there!";
		
		if (ex1 != null) {
			System.out.println(ex1);
		}
		
	}

}
