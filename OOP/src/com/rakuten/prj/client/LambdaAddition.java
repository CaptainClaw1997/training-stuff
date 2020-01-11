package com.rakuten.prj.client;

import java.util.function.BiFunction;

public class LambdaAddition {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f1 = (n1, n2) -> n1 + n2;
		System.out.println(f1.apply(4, 5));
	}

}
