package org.bytesized.listUtils;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ListsTest {

	@Test
	public void mergeSortTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.addAll(Arrays.asList(2, 4, 3, 1));
		Lists.mergeSort(l);
		assertEquals(Arrays.asList(1, 2, 3, 4), l);
	}
	
	@Test
	public void mergeSortOddTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.addAll(Arrays.asList(2, 4, 3, 1, 5));
		Lists.mergeSort(l);
		assertEquals(Arrays.asList(1, 2, 3, 4, 5), l);
	}
	
	@Test
	public void mergeSortEmptyTest() {
		List<Integer> l = new ArrayList<Integer>();
		Lists.mergeSort(l);
		assertEquals(Collections.emptyList(), l);
	}
	
	@Test
	public void mergeSortNullTest() {
		List<Integer> l = null;
		Lists.mergeSort(l);
		assertEquals(null, l);
	}
	
	@Test
	public void mergeSortSingleTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.addAll(Arrays.asList(1));
		Lists.mergeSort(l);
		assertEquals(Arrays.asList(1), l);
	}
	
	@Test
	public void quickSortTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.addAll(Arrays.asList(2, 4, 3, 1));
		Lists.quickSort(l);
		assertEquals(Arrays.asList(1, 2, 3, 4), l);
	}
	
	@Test
	public void quickSortOddTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.addAll(Arrays.asList(2, 4, 3, 1, 5));
		Lists.quickSort(l);
		assertEquals(Arrays.asList(1, 2, 3, 4, 5), l);
	}
	
	@Test
	public void quickSortEmptyTest() {
		List<Integer> l = new ArrayList<Integer>();
		Lists.quickSort(l);
		assertEquals(Collections.emptyList(), l);
	}
	
	@Test
	public void quickSortNullTest() {
		List<Integer> l = null;
		Lists.quickSort(l);
		assertEquals(null, l);
	}
	
	@Test
	public void quickSortSingleTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.addAll(Arrays.asList(1));
		Lists.quickSort(l);
		assertEquals(Arrays.asList(1), l);
	}
}