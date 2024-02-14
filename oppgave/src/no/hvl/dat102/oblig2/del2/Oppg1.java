package no.hvl.dat102.oblig2.del2;

import java.util.Random;

public class Oppg1 {
	
	public static void main(String[] args) {
		long x = testTime();	
		System.out.println("seconds * 10 taken: " + (float)x / 1000000000);
	}
	public static long testTime() {
		InsertionSort<Integer> sorter2 = new InsertionSort<>(true);
	    int n = 60000;
	    Integer[] data = new Integer[n];
	    for (int i = 0; i < n; i++) {
	    	Random rand = new Random();
	    	data[i] = rand.nextInt() * 9;
	    }
	    long start = System.nanoTime();
	    sorter2.sort(data);
	    long end = System.nanoTime();
	    long diff = end - start;
	    System.out.println("nanoseconds taken: " + diff);
	    return diff;
	}
}
