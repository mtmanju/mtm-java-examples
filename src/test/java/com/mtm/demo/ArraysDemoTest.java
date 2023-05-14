package com.mtm.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Comparator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArraysDemoTest {

	@Test
	public void arraySort() {
		String[] array = {"ABC", "XYZ", "PQR"};
		Arrays.sort(array);
		Assert.assertArrayEquals(new String[]{"ABC", "PQR", "XYZ"}, array);
	}

	@Test
	public void arraySortWithComparator() {
		String[] array = { "ABC", "XYZ", "PQR" };
		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str2.compareTo(str1);
			}
		});

		Assert.assertArrayEquals(new String[] { "XYZ", "PQR", "ABC" }, array);
	}

	@Test
	public void arrayToString() {
		int[] intArray = { 1, 2, 3 };
		System.out.println("Array String: " + Arrays.toString(intArray));
	}

	@Test
	public void array2DtoString() {
		int[][] intArray = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println("2D Array String: " + Arrays.deepToString(intArray));
	}

	@Test
	public void arrayCompare() {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = { 4, 5, 6 };

        Assert.assertTrue(Arrays.equals(arr1, arr2));
        Assert.assertFalse(Arrays.equals(arr1, arr3));

	}

}
