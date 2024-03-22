package com.rkithub.training.advancedjava;

import java.util.Arrays;
import java.util.List;

public class MethodRefExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Testing", "Java", "AWS");
		names.forEach(System.out::println);
		
		names.forEach(a->System.out.println(a));

	}

}
