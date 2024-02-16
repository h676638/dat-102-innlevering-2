package no.hvl.dat102.oblig2.del2;

import java.util.Arrays;
import java.util.Random;
public class SorteringsMetoder {
	public static void main(String[] args) {
		 int array[] = new int[532000];

		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(532000);

		}
		long startTime = System.currentTimeMillis();
		mergeSort(array,0,array.length -1);
		long endTime = System.currentTimeMillis();
		System.out.println("Sorted array: " + Arrays.toString(array));
		System.out.println("Time taken to sort  elements: " + (endTime - startTime) + " ms");

	}

	

	public static void insertionSort(Integer[] arr) {
	    int n = arr.length;

	    for (int i = 1; i < n; i++) {
	        Integer k = arr[i];
	        int j = i - 1;

	        while (j >= 0 && arr[j] > k) {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = k;
	    }
	}


	public static void selectionSort(Integer[] arr) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;

				}
			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

	}

	public static void quickSort(Integer[] arr, int low, int high) {
       if (low < high) {
           int pi = partition(arr, low, high);

           quickSort(arr, low, pi - 1);
           quickSort(arr, pi + 1, high);
       }
   }

   private static int partition(Integer[] arr, int low, int high) {
       int pivot = arr[high];
       int i = low - 1;
       for (int j = low; j < high; j++) {
           if (arr[j] < pivot) {
               i++;

               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }

       int temp = arr[i + 1];
       arr[i + 1] = arr[high];
       arr[high] = temp;

       return i + 1;
   }

	

	public static void mergeSort(int[] arr, int left, int right) {
		  
		
	
			if(left < right) {
				
			
			 int mid = (left + right)/ 2;
			  mergeSort( arr, left , mid);
			  mergeSort(arr, mid+1, right);
			  
			  merge(arr, left, mid, right);
			 
			}
			
		}

	public static void merge(int []arr, int left, int mid, int right) {
			
			int n1 = mid - left+1;
			int n2 = right - mid;
			
			int[]leftArr = new int[n1];
			int[]rightArr = new int[n2];
			
			
			for (int i = 0; i < n1; i++) {
		        leftArr[i] = arr[left + i];
		    }
		    for (int j = 0; j < n2; j++) {
		        rightArr[j] = arr[mid + 1 + j];
		    }
					
			int i = 0;
			int j = 0;
			int k = left;
			
			while( i < n1 && j<n2) {
				
				if(leftArr[i]<= rightArr[j]) {
					arr[k] = leftArr[i];
					i++;
					
				}
				else {
					arr[k] = rightArr[j];
					j++;
					
				}
				
				k++;
				
			}
		while( i <n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
			
		}
		while( j <n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
			
		}

	
}
}
