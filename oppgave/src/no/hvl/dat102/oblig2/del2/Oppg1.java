package no.hvl.dat102.oblig2.del2;

import java.util.Random;

public class Oppg1 {
	
	public static void main(String[] args) {
		long x = testTime();	
		System.out.println("seconds taken: " + (float)x / 1000000000);
	}
	public static long testTime() {
		InsertionSort<Integer> sorter2 = new InsertionSort<>(false);
	    int n = 60001;
	    Integer[] data = new Integer[n];
	    for (int i = 0; i < n; i++) {
	    	Random rand = new Random();
	    	data[i] = rand.nextInt(10);
	    }

	    long start = System.nanoTime();
	    sorter2.sort(data);
	    long end = System.nanoTime();
	    if (!isSorted(data)) {
	    	System.out.println("NOT SORTED");
	    }
	    long diff = end - start;
	    System.out.println("nanoseconds taken: " + diff);

	    return diff;
	}
	public static boolean isSorted(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false; // Array is not sorted
            }
        }
        return true; // Array is sorted
    }
}

