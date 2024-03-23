package com.rkithub.training.advancedjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> startsWithS =  s->s.contains("s");
		
		List<String> listNames =  Arrays.asList("MongoDB", "ExpressJs", "React","NodeJs");
		
		List<String> listNames1 = new ArrayList<String>();
		listNames1.add("MongoDB");
		listNames1.add("ExpressJs");
		listNames1.add("React");
		listNames1.add("NodeJs");
		
		//listNames.forEach((a)-> System.out.println(a)); 
		
		List<String> listNamesFiltered =	listNames1.stream().filter(startsWithS).collect(Collectors.toList());
		System.out.println("After predicate applied......");
		listNamesFiltered.forEach((a)-> System.out.println(a)); 
		
	}

}
