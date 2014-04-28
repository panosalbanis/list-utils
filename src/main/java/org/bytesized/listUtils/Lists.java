package org.bytesized.listUtils;

import java.util.List;

public class Lists {

	/**
	 * Sorts a given list using the merge sort algorithm.
	 * @param list The list to be sorted.
	 */
	public static <T extends Comparable<T>> void mergeSort(List<T> list) {
		if (list == null || list.size() < 2) return;
		mergeSort(list.subList(0, list.size()/2));
		mergeSort(list.subList(list.size()/2, list.size()));
		merge(list);
	}
	
	/**
	 * Sorts a given list using the quick sort algorithm.
	 * @param list The list to be sorted.
	 */
	public static <T extends Comparable<T>> void quickSort(List<T> list) {
		if (list == null || list.size() < 2) return;
		int pivotIndex = swap(list, list.size() / 2);
		quickSort(list.subList(0, pivotIndex - 1));
		quickSort(list.subList(pivotIndex, list.size()));
	}
		
	/**
	 * Merges two sorted halves of a list into one sorted one.
	 * @param list The list to operate on.
	 */
	private static <T extends Comparable<T>> void merge(List<T> list) {
		int i = 0;
		int j = list.size() / 2;
		while (j < list.size() && i < list.size()) {
			if  (list.get(i).compareTo(list.get(j)) > 0) {
				list.add(i, list.remove(j));
				j++;
			}
			i++;
		}
	}
	
	/**
	 * Swaps all elements bigger than the pivot to it's right
	 * and those smaller to it's left.
	 * @param list The list to operate on.
	 * @param index The initial index of the pivot element.
	 * @return The resulting index of the pivot element.
	 */
	private static <T extends Comparable<T>> int swap(List<T> list, int index) {
		T elem = list.get(index);
		int endIndex = index;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).compareTo(elem) > 0 && i < endIndex) {
				list.add(endIndex + 1, list.remove(i));
				endIndex--;
			} else if (list.get(i).compareTo(elem) < 0 && i > endIndex) {
				list.add(endIndex - 1, list.remove(i));
				endIndex++;
			}
		}
		return endIndex;
	}
}