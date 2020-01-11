package com.rakuten.prj.client;

import java.util.List;

import com.rakuten.prj.entity.Triplet;
import com.rakuten.prj.util.ArrayUtil;

public class TripletExample {

	public static void main(String[] args) {
		int[] inp = {2,3,4,5,7};
		
		List<Triplet> out = ArrayUtil.printTriplets(inp);
		
		for (Triplet trip : out) {
			System.out.println("<" + trip.getFirst() + "," + trip.getSecond() + "," + trip.getSum() + ">");
		}
	}

}
