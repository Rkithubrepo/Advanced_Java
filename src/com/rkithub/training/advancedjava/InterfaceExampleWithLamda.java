package com.rkithub.training.advancedjava;

import java.util.Arrays;
import java.util.List;

interface InterfaceA {
	void testMethod();
}
public class InterfaceExampleWithLamda {
	
	public static void main(String[] args) {
		

		
		InterfaceA a = new InterfaceA() {
			
			@Override
			public void testMethod() {
               System.out.println("My test method..");				
			}
		};
		
		a.testMethod();
		
		InterfaceA b = () -> System.out.println("My test method...");
		
		b.testMethod();
		
		
		List<String> names = Arrays.asList("sam","tyson","rocky");
		
		names.sort((x,y) -> x.compareTo(y));
		names.forEach((z) -> System.out.println(z));
	}
}
