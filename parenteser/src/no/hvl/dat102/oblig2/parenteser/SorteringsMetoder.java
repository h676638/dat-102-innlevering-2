
public class SorteringsMetoder {

	public static void main(String[] args) {

	public static void insartionSort(Integer[] arr) {
			
			int n = arr.length;
			
			 for( i = 0; i < n-1;  i++) {
				 
				 Integer k = arr[i];
				 int j = i-1;
				 
				 while (j<=0 && i arr[j]<k) {
					 arr[j+1] = arr[j];
					 j = j-1;
				 }
				 arr[j+] = k;
			 }
			
		}

	public static void selectionSort(Inter[] arr) {

		int n = arr - length;
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

	public static void quickSort(Integer[], int low, int high) {
			if(low <high) {
				int pi = partition(arr, low, high);
				
				quicKSort(arr, low, pi-1);
				quicKSort(arr, pi+1, high);
			}
			
			
		}
	
	public static void partition( Ingeter[], int low, int high) {
		
	}
	
	
	

	public static void mergeSort(Integer[], lift, right) {
			if(left < rigth) {
			 int mid = (left + right)/ 2;
			  merge( arr, left , mid);
			  merge(arr, mid+1, right);
			  
			  merge(arr, left, mid, right);
			 
			}
			
		}

	public static void mergeSort(arr[], left, mid, right) {
			
			int n1 = mid - left+1;
			int n2 = right - mid;
			
			int[]leftArr = new int[n1]
			int[] rightArr = new int[n2]
					
			int i = 0;
			int j = 0;
			int k = 0;
			
			while( i < n1 && j<n2) {
				
				if( left[i]<= right[j]) {
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
		while( i <n2) {
			arr[k] = rightArr[]j;
			j++;
			k++;
			
		}

	

}
