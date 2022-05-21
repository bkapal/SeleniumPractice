package com.selenium.test;

import java.util.HashSet;
import java.util.Set;

public class Instructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Set<Integer> numbers = new HashSet<Integer>();
numbers.add(12);
numbers.add(15);

numbers.forEach(System.out::println);


numbers.forEach((e)->{
	System.out.println(e);
});
	}

}