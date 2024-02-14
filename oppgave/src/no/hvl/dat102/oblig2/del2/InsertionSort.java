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
		for (int i = index; i<list.length; i++) {
			if (i == index) {
				continue;
			}
			else {
				if (list[i].compareTo(list[i-1]) >= 0) {
					continue;
				}
			}
			int j = i;
			T cur = list[j];
			while (j > index && cur.compareTo(list[j-1]) <= 0) {
				j--;
				T temp = list[j];
				list[j] = cur;
				list[j+1] = temp;
			}
		}
		return list;
	}
}
