package com.rkithub.training.advancedjava;

import java.util.Arrays;
import java.util.List;

// functional approach to processing collections of objects. 
public class StreamsExample {

	public static void main(String[] args) {

		  List<String> list = Arrays.asList(null, "HTML", null, "Java", "Spring");

		int totalLength = list.stream().filter(s-> s!=null).mapToInt(String :: length).sum();
		
		System.out.println("Total length of the String array is :"+totalLength);
		
		list.stream().filter(s-> s!=null).forEach(a->System.out.println(a));;
	}

}
