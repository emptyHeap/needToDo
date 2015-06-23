package study;

public class InsertionSort extends Sort{

	public static void main(String[] args){
		Comparable[] array = Randomizer.getArray(100);
		sort(array);
		print(array);
		System.out.println(isSort(array));
	}
	
	public static void sort(Comparable[] array){
		int N = array.length;
		for (int i = 1; i < N; i++){
			for (int j = i; j > 0 && less(array, j, j-1); j--){
				exch(array, j, j-1);
			}
		}
	}
}
