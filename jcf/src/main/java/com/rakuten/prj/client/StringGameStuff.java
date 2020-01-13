package com.rakuten.prj.client;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StringGameStuff {

	public static void main(String[] args) {
		String str = "Java is OOP, Java is open source";
		str = str.replace("[-+.^:,]", "");
		String[] words = str.split(" ");

		Map<String, Integer> wordMap = new HashMap<String, Integer>();

		for (int i = 0; i < words.length; i++) {
			if (wordMap.containsKey(words[i])) {
				wordMap.put(words[i], wordMap.get(words[i]) + 1);
			}
			wordMap.putIfAbsent(words[i], 1);
			// wordSet.add(word);

		}
		System.out.println(wordMap);

	}

}
