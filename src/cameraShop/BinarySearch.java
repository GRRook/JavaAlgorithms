package cameraShop;

public class BinarySearch {

	public int binarySearch(int[] sortedArray, int searchNumber) {	
		
		int low = 0;
		int high = sortedArray.length - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (sortedArray[middle] == searchNumber) {
				System.out.println("Value found in sorted array on index:" + sortedArray[middle]);
				return sortedArray[middle];
			}
			if (sortedArray[middle] < searchNumber) {
				low = middle + 1;
			}
			if (sortedArray[middle] > searchNumber) {
				high = middle - 1;
			}
		}
		System.out.println("Value not found in sorted array");
		return -1;
	}
}