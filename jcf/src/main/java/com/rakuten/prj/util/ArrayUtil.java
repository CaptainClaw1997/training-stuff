package com.rakuten.prj.util;

import com.rakuten.prj.entity.Triplet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project contains summing, occurrence check, sort.
 * 
 * 
 * @author bharath
 *
 */
public final class ArrayUtil {

	/**
	 * Just to keep the JaCoCo happy.
	 */
	private ArrayUtil() {

	}

	/**
	 * 
	 * @param data - Array input
	 * @return sum of elements of array
	 */
	public static int getSum(int[] data) {
		int sum = 0;
		for (int i : data)
			sum += i;
		return sum;
	}

	/**
	 * 
	 * @param data - Array input
	 * @param no   - element whose occurrence needs to be counted
	 * @return no. of occurrences
	 */
	public static int getOccurence(int[] data, int no) {
		int occur = 0;
		for (int i : data) {
			if (i == no)
				occur++;
		}
		return occur;
	}

	/**
	 * 
	 * @param data - Array input
	 */
	public static void sort(int[] data) {
		Arrays.parallelSort(data);
	}

	public static void sort(Comparable[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = i + 1; j < items.length; j++) {
				if (items[i].compareTo(items[j]) > 0) {
					Comparable temp = items[j];
					items[j] = items[i];
					items[i] = temp;
				}
			}
		}
	}

	public static List<Triplet> printTriplets(int[] data) {
		List<Triplet> triplets = new ArrayList<>();
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				for (int k = j + 1; k < data.length; k++) {
					if (data[i] + data[j] == data[k]) {
						triplets.add(new Triplet(data[i], data[j], data[k]));
					}
				}
			}
		}

		return triplets;
	}
}
