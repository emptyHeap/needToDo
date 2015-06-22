package study;

public class SelectionSort extends Sort {
	
	/*public static void main(String[] args){
		Comparable[] array = Randomizer.getArray(1000);
		print(array);
		sort(array);
		print(array);
		isSort(array);
	}*/
	
	public static void sort(Comparable[] array){
		int N = array.length;
		int min;
		for (int i = 0; i < N; i++){
			min = i;
			for (int j = i+1; j < N; j++){
				if (less(array, j, i)){
					min = j;
				}
			}
			exch(array, i, min);
		}
	}
}
