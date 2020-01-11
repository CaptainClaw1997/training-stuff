package com.rakuten.prj.client;

import java.util.HashSet;
import java.util.Set;

public class StringGameStuff {

	public static void main(String[] args) {
		String str = "Java is OOP, Java is open source";
		
		String[] words = str.split(" ");
		
		Set<String> wordSet = new HashSet<>();
		for(String word : words) {
			wordSet.add(word);
			System.out.println(word);
		}
		
		

	}

}
