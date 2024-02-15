package no.hvl.dat102.oblig2.del2;

public class InsertionSort<T extends Comparable<T>>{
	boolean optA;
	
	public InsertionSort(boolean a) {
		this.optA = a;
	}
	public T[] sort(T[] list) {
		int index = 0;
		//if parameter is true, activate optional optimisation algorithm 
		if (this.optA) {
			index = 1;
			int lowest = 0;
			for (int i = 0; i < list.length; i++) {
				if (list[i].compareTo(list[lowest]) < 0) {
					lowest = i;
				}
			}
			T tempT = list[0];
			list[0] = list[lowest];
			list[lowest] = tempT;
		}
		for (int i = index; i<list.length; i += 2) {
			if (i == list.length-1) {
				i --;
			}
			if (i == index) {
				i--;
				continue;
			}
			
			int j = i;
			if (list[i].compareTo(list[i+1]) > 0) {
				T temp = list[i];
				list[i] = list[i+1];
				list[i+1] = temp;
			}

			T min = list[i];
			T max = list[i+1];
			while (j > index) {
				if (max.compareTo(list[j-1]) < 0) {
					list[j+1] = list[j-1];
					list[j-1] = min;
					list[j] = max;
					j--;
				}
				else if (min.compareTo(list[j-1]) < 0) {
					j--;
					T temp = list[j];
					list[j] = min;
					list[j+1] = temp;
				}
				else {
					break;
				}
			}
		}
		return list;
	}
}
