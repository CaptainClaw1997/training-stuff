package com.rakuten.prj.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.rakuten.prj.entity.Product;
import com.rakuten.prj.entity.Triplet;

class ArrayUtilTest {

	@Test
	void testGetSum() {
		int[] values = { 45, 10, -5 };
		int expected = 50;
		assertEquals(expected, ArrayUtil.getSum(values));
	}

	@Test
	void testGetOccurence() {
		int[] values = { 43, 6, 77, 6, 12, 6 };
		int expected = 3;
		assertEquals(expected, ArrayUtil.getOccurence(values, 6));
	}

	@Test
	void testSort() {
		int[] nos = { 6, 2, 78, 12, 90 };
		ArrayUtil.sort(nos);
		int[] expected = { 2, 6, 12, 78, 90 };
		assertArrayEquals(expected, nos);

		Product[] products = new Product[6];
		products[0] = new Product(645, "Hp Laptop", 135000.00, "computer");
		products[1] = new Product(224, "iPhone", 98000.00, "mobile");
		products[2] = new Product(834, "Logitech Mouse", 600.00, "computer");
		products[3] = new Product(5, "Sony Bravia", 125000.00, "tv");
		products[4] = new Product(912, "One Plus", 32000.00, "mobile");
		products[5] = new Product(88, "HP Printer", 19000.00, "computer");
		ArrayUtil.sort(products);

		Product[] sps = new Product[6];
		sps[3] = new Product(645, "Hp Laptop", 135000.00, "computer");
		sps[2] = new Product(224, "iPhone", 98000.00, "mobile");
		sps[4] = new Product(834, "Logitech Mouse", 600.00, "computer");
		sps[0] = new Product(5, "Sony Bravia", 125000.00, "tv");
		sps[5] = new Product(912, "One Plus", 32000.00, "mobile");
		sps[1] = new Product(88, "HP Printer", 19000.00, "computer");

		assertArrayEquals(sps, products);
	}

	@Test
	void testComparable() {
		String[] names = { "George", "Brad", "Lee", "Charlie", "Angelina" };
		ArrayUtil.sort(names);
		String[] sorted = { "Angelina", "Brad", "Charlie", "George", "Lee" };
		assertArrayEquals(sorted, names);
	}

	@Test
	void testPrintTriplet() {
		int[] inp1 = { 2, 3, 4, 5, 7 };
		List<Triplet> out1 = ArrayUtil.printTriplets(inp1);
		List<Triplet> test1 = new ArrayList<>();
		test1.add(new Triplet(2, 3, 5));
		test1.add(new Triplet(2, 5, 7));
		test1.add(new Triplet(3, 4, 7));

		for (int i = 0; i < test1.size(); i++) {
			assertEquals(test1.get(i).getFirst(), out1.get(i).getFirst());
			assertEquals(test1.get(i).getSecond(), out1.get(i).getSecond());
			assertEquals(test1.get(i).getSum(), out1.get(i).getSum());
		}
	}

}
