package cameraShop;

public class LinearSearch {

	public int linearSearch(int[] array, int searchNumber){
		int foundIndex = -1;
		for (int i = 0; i <array.length; i++){
			if(array[i]==searchNumber){
				System.out.println("Value found in array on index: ");
				foundIndex = i;
			}
		}
		if (foundIndex == -1){
			System.out.println("Value not found in Array");
		} 
		return foundIndex;
	}
}