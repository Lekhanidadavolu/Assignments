package com.src;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Stream;
public class FlatMapEx {

	public static void main(String[] args) {
		
		List li=Arrays.asList(1,2,5,9,10);
		System.out.println(li);
		li.stream().flatMap(num->Stream.of(num)).forEach(System.out::println);

	}

}
