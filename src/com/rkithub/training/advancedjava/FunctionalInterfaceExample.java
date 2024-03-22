package com.rkithub.training.advancedjava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaceExample {
   //Functional interfaces are interfaces with only one abstract method.
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Java", "HTML", "CSS","Spring");
		
		Predicate<String> startsWithS =  s->s.startsWith("S");
		
		List<String> filteredList  = names.stream().filter(startsWithS).collect(Collectors.toList());

	}

}
